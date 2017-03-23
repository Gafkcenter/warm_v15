
//清空input标签中默认的value值
function func(){
	document.getElementById("user").value="";
}
//当光标从Input标签文本框中失去之后，需要触发的事件处理的方案。
function checkuser(){
	//定义标记只要用户不合法，都不让通过
	var flag = false;
	//获取当前的user这个input标签对象
	var user = document.getElementById("user").value;
	//获取用户显示用户名信息的span标签
	var userspan = document.getElementById("userspan");
	//验证用户名是否合法
	if(user == ""){
		userspan.innerHTML = "用户名错误".fontcolor('red');
		
	}else{
		userspan.innerHTML = "用户名正确".fontcolor('green');
		flag = true;
	}
	return flag;
}
//验证用户的输入密码
function checkpwd(){
	var flag = false;
	//获取用户输入的密码值
	var pwd = document.getElementById("pwd").value;
	
	var pwdspan = document.getElementById("pwdspan");
	
	if( pwd == "" ){
		pwdspan.innerHTML = "密码不能为空".fontcolor("red");
	}else{
		pwdspan.innerHTML = "密码正确".fontcolor("yellow");
		flag = true;
	}
	return flag;
}
//验证确认密码
function checkrepwd(){
	var flag = false;
	//获取用户输入的密码值
	var pwd = document.getElementById("pwd").value;
	var repwd = document.getElementById("repwd").value;
	var repwdspan = document.getElementById("repwdspan");
	if(pwd == repwd){
		repwdspan.innerHTML = "密码一致".fontcolor("blue");
		flag = true;
	}else{
		repwdspan.innerHTML = "密码不一致".fontcolor("red");
	}
	return flag;
}
//验证性别
function checksex(){
	var sexs = document.getElementsByName("sex");
	//定义计数器，统计单选按钮选中了几个
	var count = 0;
	for(var i=0;i<sexs.length;i++){
		if( sexs[i].checked ){
			count ++;
		}
	}
	//判断count是否为1
	if( count != 1 ){
		document.getElementById("sexspan").innerHTML = "请选择性别".fontcolor('red');
	}
}
//验证复选框
function checkhobby(){
	//获取所有的name为hobby的checkbox复选框
	var hobbys = document.getElementsByName("hobby");
	var count = 0;
	for(var i=0;i<hobbys.length;i++){
		if( hobbys[i].checked ){
			count++;
			break;
		}
	}
	if(count == 0){
		document.getElementById("hspan").innerHTML = "爱好必须选择一项".fontcolor('red');
	}
}

function check(){
	if( checkuser() && checkpwd() && checkrepwd() ){
		return true;
	}
	return false;
	
}





