package com.gafker.manage.pojo;
/**
 * 创建交易响应参数说明(json格式)
 * @author gafker
 *
 */
public class PayssionResponse {
	private int result_code;//必填	api请求结果: 例如200. 详细result_code请参考
	private Object transaction;//必填	交易信息
	private String todo;//必填	需要执行的操作: 例如 redirect.
	private String redirect_url;//	可选	付款链接URL。当todo值包含“redirect”，可将页面跳转到redirect_url让用户完成支付
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
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public String getRedirect_url() {
		return redirect_url;
	}
	public void setRedirect_url(String redirect_url) {
		this.redirect_url = redirect_url;
	}
	
}
