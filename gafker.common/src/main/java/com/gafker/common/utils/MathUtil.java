package com.gafker.common.utils;


import java.math.BigDecimal;
import java.text.DecimalFormat;


public class MathUtil {

	public static final int HUNDRED = 100;
	public static final int THOUSAND = 1000;
	/**
	 * 将数据转换为2位小数
	 * @param value
	 * @return
	 * @author 创建于 2010-8-20 下午02:34:27
	 */
	public static String formatTwoPoint(double value) {
		return new DecimalFormat("#0.00").format(value);
	}
	/**
	 * 将数据转换为2位小数
	 * @param value
	 * @return
	 * @author  创建于 2010-8-20 下午04:01:43
	 */
	public static Double formatTwoPointToDouble(double value) {
		return new Double(new DecimalFormat("#0.00").format(value));
	}
	/**
	 * 将数据转换为若干位位小数
	 * @param value
	 * @param format 转化的格式 比如 #0.00  2位小数  #0.000三位小数
	 * @return
	 * @author  创建于 2010-8-20 下午04:12:12
	 */
	public static String formatSomePoint(double value,String format) {
		return new DecimalFormat(format).format(value);
	}
	/**
	 * 将数据转换为若干位位小数
	 * @param value
	 * @param format 转化的格式 比如 #0.00  2位小数  #0.000三位小数
	 * @return
	 * @author  创建于 2010-8-20 下午04:12:12
	 */
	public static Double formatSomePointToDouble(double value,String format) {
		return new Double(new DecimalFormat(format).format(value));
	}
	

    /**      
     * @方法描述：  解决科学技术法的问题，四舍五入保留两位小数   
     * @创建人： 
     * @创建时间：2011-5-3 上午10:01:06  
     * @返回类型： String
     */
    public static String SicenDoubleToString(double value) {  
        String retValue = null;  
        DecimalFormat df = new DecimalFormat();  
        df.setMinimumFractionDigits(2);  
        df.setMaximumFractionDigits(2);  
        retValue = df.format(value);  
        return  retValue.replaceAll(",",""); 
    }  
    

	/**
	 *缩小一百倍
	 * @author gaofeng
	 * @version Jul 25, 2011
	 * @param lo
	 * @return
	 */
	public static String reduceHundred(String str){
		DecimalFormat format = new DecimalFormat("0.##");
		return format.format(Double.valueOf(str) / ((double) HUNDRED));
	}

	/**
	 *扩大一百倍
	 * @author gaofeng
	 * @version Jul 25, 2011
	 * @param str
	 * @return
	 */
	public static long enlargeHundred(double d){
		return Math.round(d * HUNDRED);
	}
	/**
	 *扩大一千倍
	 * @author gaofeng
	 * @version Jul 25, 2011
	 * @param str
	 * @return
	 */
	public static long enlargeThousand(double d){
		return Math.round(d * THOUSAND);
	}
	/***
	 * 字符串装换int
	 * @param content
	 * @return
	 */
	public static int stringToInt(String content){
		try {
			return Integer.parseInt(content);
		} catch (Exception e) {
		}
		return 0;
	}
	/**
	 * int转BigDecimal
	 * @param size
	 * @return
	 */
	public static BigDecimal parseApkSize(int size) {
		BigDecimal bd = new BigDecimal((double)size/(1024*1024));
		BigDecimal setScale = bd.setScale(2, BigDecimal.ROUND_DOWN);
		return setScale;
	}
}
