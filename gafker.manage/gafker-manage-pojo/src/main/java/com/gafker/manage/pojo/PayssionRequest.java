package com.gafker.manage.pojo;

/**
 * Payment Request 创建交易
	线上环境地址：
		HTTP FORM提交地址为：https://www.payssion.com/payment/create.html
		WEB服务API地址为：https://www.payssion.com/api/v1/payment/create
	测试环境地址：
		HTTP FORM提交地址为：http://sandbox.payssion.com/payment/create.html
		WEB服务API地址为：http://sandbox.payssion.com/api/v1/payment/create
 * Payssion支付创建订单
 * @author gafker
 *HTTP FORM或者WEB服务API创建交易时所有参数通过key-value POST形式提交。Map
 */

/**
 * 创建交易签名api_sig生成分两步骤:
 * 1、将api_key, pm_id, amount, currency, order_id以及应用的secret_key字符串，以 “|”为分隔符串联成一个字符串
 * 2、将第一步骤串联起来的的字符串经md5加密生成最终的api_sig 具体代码示例：
 * @author gafker
 *
 */
public class PayssionRequest {
	private String api_key;		//必填	添加应用成功后可以看到该应用的api_key
	private String pm_id;	//必填	支付方式id: 例如 alipay_cn. 详细pm_id请参考
	private double amount;	//必填	付款金额: 例如 10.12
	private String currency;	//必填	货币: 例如 USD
	private String description;	//必填	付款描述: 例如 example.com #item.
	private String order_id;	//必填	商户订单号
	private String api_sig;	//必填	api签名。具体生成规则请参考
	private String return_url;	//可选	支付返回后跳转的页面URL。可以在应用设置默认的return_url
	private String payer_email;	//可选	客户邮箱
	private String payer_name;	//可选	客户姓名
	public String getApi_key() {
		return api_key;
	}
	public void setApi_key(String api_key) {
		this.api_key = api_key;
	}
	public String getPm_id() {
		return pm_id;
	}
	public void setPm_id(String pm_id) {
		this.pm_id = pm_id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getApi_sig() {
		return api_sig;
	}
	public void setApi_sig(String api_sig) {
		this.api_sig = api_sig;
	}
	public String getReturn_url() {
		return return_url;
	}
	public void setReturn_url(String return_url) {
		this.return_url = return_url;
	}
	public String getPayer_email() {
		return payer_email;
	}
	public void setPayer_email(String payer_email) {
		this.payer_email = payer_email;
	}
	public String getPayer_name() {
		return payer_name;
	}
	public void setPayer_name(String payer_name) {
		this.payer_name = payer_name;
	}
	
	/**
	 * 异步通知签名notify_sig生成分两步骤：
	 * 1、将api_key, pm_id, amount, currency, order_id, state以及应用的sercret_key字符串，以 “|”为分隔符串联成一个字符串
	 * 2、将第一步骤串联起来的的字符串经md5加密生成最终的notify_sig 具体代码示
	 * 主要参数如下： app_name：应用名称
		pm_id：支付方式id: 例如 alipay_cn. 详细pm_id请参考 
		transaction_id： Payssion平台交易号，非商户订单号。
		order_id：商家订单号
		amount：订单金额
		paid: 已支付金额
		net: 扣除先后续费后净额
		currency：交易币种
		description：订单描述
		state：支付状态
		notify_sig: 异步通知签名，具体规则参考签名规则。
	 */
}
