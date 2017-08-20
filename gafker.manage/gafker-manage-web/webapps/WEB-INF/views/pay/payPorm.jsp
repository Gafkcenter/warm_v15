<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="payssion_payment" action="http://sandbox.payssion.com/payment/create.html" method="post">
    <input type="hidden" name="api_key" value="5963a4c1c35c2a8e">
    <input type="hidden" name="api_sig" value="d6229c11afb870e5e1551d6c45f5c2ab">
    <input type="hidden" name="pm_id" value="alipay_cn">
    <input type="hidden" name="order_id" value="123">
    <input type="hidden" name="description" value="Charge for test">
    <input type="hidden" name="amount" value="1.00">
    <input type="hidden" name="currency" value="USD">
    <input type="hidden" name="return_url" value="http://sandbox.payssion.com/demo/afterpayment">
    <input type ="submit" value ="Submit">
</form>
</body>
</html>