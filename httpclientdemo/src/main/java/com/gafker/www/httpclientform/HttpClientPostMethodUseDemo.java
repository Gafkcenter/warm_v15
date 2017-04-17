package com.gafker.www.httpclientform;

import java.io.File;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
/**
 * Use commons.httpclient
 * @author gafker
 * HttpClient是org.apache.commons.httpclient.HttpClient。
 *<groupId>commons-httpclient</groupId>
 */
public class HttpClientPostMethodUseDemo {
	private static final String URL_STR = "http://192.168.1.101:8080/gafker-manage-web/springUpload";
	String userName="Gafker";
	String passwd="Gafker";

	public void upload(String localFile) {
		File file = new File(localFile);
		PostMethod filePost = new PostMethod(URL_STR);
		HttpClient client = new HttpClient();

		try {
			// 通过以下方法可以模拟页面参数提交
			filePost.setParameter("userName", userName);
			filePost.setParameter("passwd", passwd);

			Part[] parts = { new FilePart(file.getName(), file) };
			filePost.setRequestEntity(new MultipartRequestEntity(parts, filePost.getParams()));

			client.getHttpConnectionManager().getParams().setConnectionTimeout(5000);

			int status = client.executeMethod(filePost);
			if (status == HttpStatus.SC_OK) {
				System.out.println("上传成功");
			} else {
				System.out.println("上传失败");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			filePost.releaseConnection();
		}
	}
}
