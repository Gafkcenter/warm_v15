package com.gafker.www.rawrequest;

public class MainRun {

	/**
	 * Java 自身提供的Get Post请求方法
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "http://127.0.0.1:8080/gafker-manage-web/listxml";
		String param = null;
		String sendGet = HttpRequestJavaRaw.sendGet(url, param);
		System.out.println("sendGet:" + sendGet);
		String sendPost = HttpRequestJavaRaw.sendPost(url, param);
		System.out.println("sendPost:" + sendPost);
	}

}
