package com.gafker.www.httpclientrequest;

public class MainRun {

	/**
	 * Java 自身提供的Get Post请求方法
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "http://127.0.0.1:8080/gafker-manage-web/listxml";
		String sendGet = HttpRequestHttpClientRequest.doGet(url);
		System.out.println("sendGet:" + sendGet);
		String sendPost = HttpRequestHttpClientRequest.doPost(url);
		System.out.println("sendPost:" + sendPost);
	}

}
