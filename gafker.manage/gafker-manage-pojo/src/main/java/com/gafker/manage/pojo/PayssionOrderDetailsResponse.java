package com.gafker.manage.pojo;

/**
 * 交易查询API响应参数说明(json格式)
 * @author gafker
 *
 */
public class PayssionOrderDetailsResponse {
	private int result_code;//必填	api请求结果: 例如200. 详细result_code请参考
	private Object transaction;//必填	该笔支付的信息
	public int getResult_code() {
		return result_code;
	}
	public void setResult_code(int result_code) {
		this.result_code = result_code;
	}
	public Object getTransaction() {
		return transaction;
	}
	public void setTransaction(Object transaction) {
		this.transaction = transaction;
	}
	
	/**
	 * transaction交易信息，主要字段有： transaction_id：Payssion平台交易号
		app_name：应用名称
		pm_id：支付方式id，请联系Payssion技术索取pm_id
		currency：交易币种
		order_id：商家订单号
		amount：订单金额
		paid：已支付金额
		net：扣除先后续费后净额
		state：支付状态。详细支付状态请参考
		fees：费用
		fees_add：额外费用
		refund：已退款金额
		refund_fees：退款费用
		created：交易创建时间
		updated：交易更新时间
	 */
	
}
