package com.gafker.www.httpclientform;

public class MainRun {
public static void main(String[] args) {
	HttpClientPostMethodUseDemo postMethod = new HttpClientPostMethodUseDemo();
	HttplientHttpPostUseDemo httpPost = new HttplientHttpPostUseDemo();
	String localFile="C:\\Users\\john\\Pictures\\002.png";
	postMethod.upload(localFile);
//	httpPost.upload(localFile);
}
}
