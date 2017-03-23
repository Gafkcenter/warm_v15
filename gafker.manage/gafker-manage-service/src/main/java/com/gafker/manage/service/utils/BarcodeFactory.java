package com.gafker.manage.service.utils;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.gafker.common.exception.ImagePathException;
import com.gafker.common.utils.FileEnumEvent;
import com.gafker.manage.serviceImpl.HappayteachersdayServiceImpl;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/**
 * @author Gafker Xiong
 * 
 */
public class BarcodeFactory {
	public static Logger logger1 = LogManager.getLogger(BarcodeFactory.class);
	// 图片宽度
	private static final int IMAGE_WIDTH = HappayteachersdayServiceImpl.QRCODE_IMAGES_WIDTH;
	private static final int IMAGE_HEIGHT = HappayteachersdayServiceImpl.QRCODE_IMAGES_WIDTH;
	// 中间图片大小
	private static final int IMAGE_HALF_WIDTH = IMAGE_WIDTH / 2;
	// 中间图片边框的宽度
	private static final int FRAME_WIDTH = 2;

	// 二维码写码器
	private static MultiFormatWriter mutiWriter = new MultiFormatWriter();

	/**
	 * 
	 * @param content 生成码的内容 url
	 * @param width
	 * @param height
	 * @param srcImagePath  生成的码中间的那个图片路径 
	 * @param destImagePath 码生成后保存的路径。
	 * @throws Exception
	 */
	public static void encode(String content, int width, int height, String srcImagePath, String destImagePath)
			throws Exception {
		if (logger1.isDebugEnabled()) {
			logger1.info("srcImagePath:"+srcImagePath);
			logger1.debug("destImagePath"+destImagePath);
		}
		try {
			ImageIO.write(genBarcode(content, width, height, srcImagePath), "jpg", new File(destImagePath));
		} catch (Exception e) {
			throw new Exception("srcImagePath:"+srcImagePath + "_destImagePath:" + destImagePath);
		}
	}

	private static BufferedImage genBarcode(String content, int width, int height, String srcImagePath)
			throws Exception {
		// 读取源图像
		BufferedImage scaleImage;
		try {
			scaleImage = scale(srcImagePath, IMAGE_WIDTH, IMAGE_HEIGHT, true);
			if (logger1.isDebugEnabled()) {
				logger1.debug("srcImagePath:"+srcImagePath);
			}
		} catch (Exception e) {
			throw new ImagePathException(FileEnumEvent.IMAGEPATH, "source:" + srcImagePath + ":" + e.getMessage());
		}
		int[][] srcPixels = new int[IMAGE_WIDTH][IMAGE_HEIGHT];
		for (int i = 0; i < scaleImage.getWidth(); i++) {
			for (int j = 0; j < scaleImage.getHeight(); j++) {
				srcPixels[i][j] = scaleImage.getRGB(i, j);
			}
		}

		Map<EncodeHintType, Object> hint = new HashMap<EncodeHintType, Object>();
		hint.put(EncodeHintType.CHARACTER_SET, "utf-8");
		hint.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
		// 生成二维码
		BitMatrix matrix = mutiWriter.encode(content, BarcodeFormat.QR_CODE, width, height, hint);
		// 去白边
		matrix = clearWhiteSideArea(matrix);
		width = matrix.getWidth();
		height = matrix.getHeight();
		// 2

		// 二维矩阵转为一维像素数组(图片放在码中位置-相对码宽度位置)
		int halfW = matrix.getWidth() / 2;
		int halfH = matrix.getHeight() / 2;
		int[] pixels = new int[width * height];

		for (int y = 0; y < matrix.getHeight(); y++) {
			for (int x = 0; x < matrix.getWidth(); x++) {
				// 读取图片
				if (x > halfW - IMAGE_HALF_WIDTH && x < halfW + IMAGE_HALF_WIDTH && y > halfH - IMAGE_HALF_WIDTH
						&& y < halfH + IMAGE_HALF_WIDTH) {
					pixels[y * width + x] = srcPixels[x - halfW + IMAGE_HALF_WIDTH][y - halfH + IMAGE_HALF_WIDTH];
				}
				// 在图片四周形成边框
				else if ((x > halfW - IMAGE_HALF_WIDTH - FRAME_WIDTH && x < halfW - IMAGE_HALF_WIDTH + FRAME_WIDTH
						&& y > halfH - IMAGE_HALF_WIDTH - FRAME_WIDTH && y < halfH + IMAGE_HALF_WIDTH + FRAME_WIDTH)
						|| (x > halfW + IMAGE_HALF_WIDTH - FRAME_WIDTH && x < halfW + IMAGE_HALF_WIDTH + FRAME_WIDTH
								&& y > halfH - IMAGE_HALF_WIDTH - FRAME_WIDTH
								&& y < halfH + IMAGE_HALF_WIDTH + FRAME_WIDTH)
						|| (x > halfW - IMAGE_HALF_WIDTH - FRAME_WIDTH && x < halfW + IMAGE_HALF_WIDTH + FRAME_WIDTH
								&& y > halfH - IMAGE_HALF_WIDTH - FRAME_WIDTH
								&& y < halfH - IMAGE_HALF_WIDTH + FRAME_WIDTH)
						|| (x > halfW - IMAGE_HALF_WIDTH - FRAME_WIDTH && x < halfW + IMAGE_HALF_WIDTH + FRAME_WIDTH
								&& y > halfH + IMAGE_HALF_WIDTH - FRAME_WIDTH
								&& y < halfH + IMAGE_HALF_WIDTH + FRAME_WIDTH)) {
					// 1.中间图片边的颜色
					pixels[y * width + x] = 0xfffff00;
				} else {
					// 此处可以修改二维码的颜色，可以分别制定二维码和背景的颜色；
					// 2.前面设置码色， 3.后面设置背景色
					pixels[y * width + x] = matrix.get(x, y) ? 0xff0000ff : 0xfffffff;
				}
			}
		}

		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		image.getRaster().setDataElements(0, 0, width, height, pixels);

		return image;
	}

	/**
	 * 把传入的原始图像按高度和宽度进行缩放，生成符合要求的图标
	 * 
	 * @param srcImageFile
	 *            源文件地址
	 * @param height
	 *            目标高度
	 * @param width
	 *            目标宽度
	 * @param hasFiller
	 *            比例不对时是否需要补白：true为补白; false为不补白;
	 * @throws IOException
	 */
	private static BufferedImage scale(String srcImageFile, int height, int width, boolean hasFiller)
			throws IOException {
		double ratio = 0.0; // 缩放比例
		File file = new File(srcImageFile);
		BufferedImage srcImage = ImageIO.read(file);
		Image destImage = srcImage.getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH);
		// 计算比例
		if ((srcImage.getHeight() > height) || (srcImage.getWidth() > width)) {
			if (srcImage.getHeight() > srcImage.getWidth()) {
				ratio = (new Integer(height)).doubleValue() / srcImage.getHeight();
			} else {
				ratio = (new Integer(width)).doubleValue() / srcImage.getWidth();
			}
			AffineTransformOp op = new AffineTransformOp(AffineTransform.getScaleInstance(ratio, ratio), null);
			destImage = op.filter(srcImage, null);
		}
		if (hasFiller) {// 补白
			BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Graphics2D graphic = image.createGraphics();
			graphic.setColor(Color.white);
			graphic.fillRect(0, 0, width, height);
			if (width == destImage.getWidth(null))
				graphic.drawImage(destImage, 0, (height - destImage.getHeight(null)) / 2, destImage.getWidth(null),
						destImage.getHeight(null), Color.white, null);
			else
				graphic.drawImage(destImage, (width - destImage.getWidth(null)) / 2, 0, destImage.getWidth(null),
						destImage.getHeight(null), Color.white, null);
			graphic.dispose();
			destImage = image;
		}
		return (BufferedImage) destImage;
	}

	/**
	 * 去白边
	 * 
	 * @param matrix
	 * @return
	 */
	private static BitMatrix clearWhiteSideArea(BitMatrix matrix) {
		int[] rec = matrix.getEnclosingRectangle();
		int resWidth = rec[2] + 1;
		int resHeight = rec[3] + 1;
		BitMatrix resMatrix = new BitMatrix(resWidth, resHeight);
		resMatrix.clear();
		for (int i = 0; i < resWidth; i++) {
			for (int j = 0; j < resHeight; j++) {
				if (matrix.get(i + rec[0], j + rec[1])) {
					resMatrix.set(i, j);
				}
			}
		}
		return resMatrix;
	}

	/**
	 * 方式二 生成不带图的无边二维码
	 * 
	 * @param content
	 * @param width
	 * @param height
	 * @param srcImagePath
	 * @throws IOException
	 * @throws WriterException
	 */
	public static void nowhitecode(String content, int width, int height, String srcImagePath)
			throws IOException, WriterException {
		Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
		hints.put(EncodeHintType.MARGIN, 0);
		BitMatrix bitMatrix = new QRCodeWriter().encode(content, BarcodeFormat.QR_CODE, 256, 256, hints);
		// 1.1去白边
		int[] rec = bitMatrix.getEnclosingRectangle();
		int resWidth = rec[2] + 1;
		int resHeight = rec[3] + 1;
		BitMatrix resMatrix = new BitMatrix(resWidth, resHeight);
		resMatrix.clear();
		for (int i = 0; i < resWidth; i++) {
			for (int j = 0; j < resHeight; j++) {
				if (bitMatrix.get(i + rec[0], j + rec[1])) {
					resMatrix.set(i, j);
				}
			}
		}
		// 2
		width = resMatrix.getWidth();
		height = resMatrix.getHeight();
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				image.setRGB(x, y, resMatrix.get(x, y) == true ? Color.BLACK.getRGB() : Color.WHITE.getRGB());
			}
		}
		// 3
		ImageIO.write(image, "png", new File(srcImagePath));
	}
}
