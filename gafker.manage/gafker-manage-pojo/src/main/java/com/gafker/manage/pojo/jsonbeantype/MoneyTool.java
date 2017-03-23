package com.gafker.manage.pojo.jsonbeantype;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import com.gafker.common.utils.MathUtil;

public final class MoneyTool {
	/**
	 * 支付时double *100
	 * @param money
	 * @return
	 */
	public static int parseMoney(double money) {
		String formatMoney=MathUtil.formatSomePoint(money, "#0.00");
		BigDecimal decimal=new BigDecimal(formatMoney);
		BigDecimal d=new BigDecimal("100");
		BigDecimal c=decimal.multiply(d);
        return c.intValue();
	}
	
    /**
     * @param money
     * @return
     */
	public static double getMoney(int money){
		return MathUtil.formatTwoPointToDouble((double)money/100);
	}
	
	public static String showMoney(int money){
		DecimalFormat df = new DecimalFormat("######0.00");
		return df.format(MathUtil.formatTwoPointToDouble((double)money/100));
	}
	
	public static void main(String arr[]){
		System.err.println(showMoney(0));
	}
}
