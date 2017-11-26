下面以本地客户端发起文件的上传、下载为例做个小Demo。
HttpClient有两种形式:
一种是org.apache.http下的;
一种是org.apache.commons.httpclient.HttpClient。

文件上传
    文件上传可以使用两种方式实现，
    一种是PostMethod方式，是使用FileBody将文件包装流包装起来
    一种是HttpPost方式。两者的处理大同小异。是使用FilePart将文件流包装起来。
    ***在传递文件流给服务端的时候，都可以同时传递其他的参数。