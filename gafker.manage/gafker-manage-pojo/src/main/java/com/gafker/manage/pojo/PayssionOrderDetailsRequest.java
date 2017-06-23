package com.gafker.manage.pojo;

/**
 * 交易查询签名api_sig生成分两步骤：
 * 1、将api_key, transaction_id, order_id以及应用的sercret_key字符串，以 “|”为分隔符串联成一个字符串
 * 2、将第一步骤串联起来的的字符串经md5加密生成最终的notify_sig 
 * 交易查询API地址为：https://www.payssion.com/api/v1/payment/getDetail
 * 交易查询API地址为：http://sandbox.payssion.com/api/v1/payment/getDetail
 * 
 * 所有参数通过key-value POST形式提交：
 * @author gafker
 *
 */
public class PayssionOrderDetailsRequest {
	private String api_key;//必填	应用ID。添加应用成功后可以看到该应用的api_key
	private String transaction_id;//	string	可选*	Payssion交易号。transaction_id和order_id至少提交一个
	private String order_id;//	可选*	订单号。transaction_id和order_id至少提交一个
	private String api_sig;//	必填	api签名。具体生成规则请参考
}
