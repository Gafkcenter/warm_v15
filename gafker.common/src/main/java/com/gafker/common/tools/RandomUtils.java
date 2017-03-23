package com.gafker.common.tools;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class RandomUtils extends org.apache.commons.lang3.RandomUtils {
	public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
			"o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8",
			"9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
			"U", "V", "W", "X", "Y", "Z" };
	public static final String ALLCHAR = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String LETTERCHAR = "abcdefghijkllmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String NUMBERCHAR = "0123456789";
	
	public static SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");

	/**
	 * 测试过千万没有重复的
	 * 
	 * @return
	 */
	public static String generateShortUuid() {
		StringBuffer shortBuffer = new StringBuffer();
		String uuid = UUID.randomUUID().toString().replace("-", "");
		for (int i = 0; i < 8; i++) {
			String str = uuid.substring(i * 4, i * 4 + 4);
			int x = Integer.parseInt(str, 16);
			shortBuffer.append(chars[x % 0x3E]);
		}
		return shortBuffer.toString();

	}

	/**
	 * 获取8位随机数String
	 * 
	 * @return
	 */
	public static String getRange8IntNumber() {
		int max = 99999999;
		int min = 9999999;
		Random random = new Random();
		int s = 10000000;
		for (int i = 0; i < 100; i++) {
			s = random.nextInt(max) % (max - min + 1) + min;
		}
		return String.valueOf(s);
	}

	/**
	 * 获取当前时间毫秒后8位执行AtomicLong累加 (日期yyyyMMdd8+8位随机数)
	 * prefix 类型字符串: 
	 * 		1.模块代码2位字母+订单代码2位字母
	 * 		2.pror:产品模块订单订单
	 * @return
	 */
	public static String getMillsRandom8IntNumber(String prefix) {
		//生成后自增数8位数
		long currentTimeMillis = System.currentTimeMillis();
		AtomicLong generator = new AtomicLong(Long.valueOf(String.valueOf(currentTimeMillis).substring(5)));
		long s = 10000000;
		for (int i = 0; i < 100; i++) {
			s = generator.incrementAndGet();
		}
		//追加日期yyyyMMdd
		String resultString = sdf.format(new Date())+String.valueOf(s);
		resultString=prefix+resultString;
		return resultString;
	}

	/**
	 * 返回一个定长的随机字符串(只包含大小写字母、数字)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public static String generateString(int length) {
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			sb.append(ALLCHAR.charAt(random.nextInt(ALLCHAR.length())));
		}
		return sb.toString();
	}

	/**
	 * 返回一个定长的随机纯字母字符串(只包含大小写字母)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public static String generateMixString(int length) {
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			sb.append(ALLCHAR.charAt(random.nextInt(LETTERCHAR.length())));
		}
		return sb.toString();
	}

	/**
	 * 返回一个定长的随机纯大写字母字符串(只包含大小写字母)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public static String generateLowerString(int length) {
		return generateMixString(length).toLowerCase();
	}

	/**
	 * 返回一个定长的随机纯小写字母字符串(只包含大小写字母)
	 * 
	 * @param length
	 *            随机字符串长度
	 * @return 随机字符串
	 */
	public static String generateUpperString(int length) {
		return generateMixString(length).toUpperCase();
	}

	/**
	 * 生成一个定长的纯0字符串
	 * 
	 * @param length
	 *            字符串长度
	 * @return 纯0字符串
	 */
	public static String generateZeroString(int length) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append('0');
		}
		return sb.toString();
	}

	/**
	 * 根据数字生成一个定长的字符串，长度不够前面补0
	 * 
	 * @param num
	 *            数字
	 * @param fixdlenth
	 *            字符串长度
	 * @return 定长的字符串
	 */
	public static String toFixdLengthString(long num, int fixdlenth) {
		StringBuffer sb = new StringBuffer();
		String strNum = String.valueOf(num);
		if (fixdlenth - strNum.length() >= 0) {
			sb.append(generateZeroString(fixdlenth - strNum.length()));
		} else {
			throw new RuntimeException("将数字" + num + "转化为长度为" + fixdlenth + "的字符串发生异常！");
		}
		sb.append(strNum);
		return sb.toString();
	}

	/**
	 * 每次生成的len位数都不相同
	 * 
	 * @param param
	 * @return 定长的数字
	 */
	public static int getNotSimple(int[] param, int len) {
		Random rand = new Random();
		for (int i = param.length; i > 1; i--) {
			int index = rand.nextInt(i);
			int tmp = param[index];
			param[index] = param[i - 1];
			param[i - 1] = tmp;
		}
		int result = 0;
		for (int i = 0; i < len; i++) {
			result = result * 10 + param[i];
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("返回一个定长的随机字符串(只包含大小写字母、数字):" + generateString(10));
		System.out.println("返回一个定长的随机纯字母字符串(只包含大小写字母):" + generateMixString(10));
		System.out.println("返回一个定长的随机纯大写字母字符串(只包含大小写字母):" + generateLowerString(10));
		System.out.println("返回一个定长的随机纯小写字母字符串(只包含大小写字母):" + generateUpperString(10));
		System.out.println("生成一个定长的纯0字符串:" + generateZeroString(10));
		System.out.println("根据数字生成一个定长的字符串，长度不够前面补0:" + toFixdLengthString(123, 10));
		int[] in = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("每次生成的len位数都不相同:" + getNotSimple(in, 3));
		System.out.println("generateShortUuid():" + generateShortUuid());
	}
}
