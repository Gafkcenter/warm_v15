
//���input��ǩ��Ĭ�ϵ�valueֵ
function func(){
	document.getElementById("user").value="";
}
//������Input��ǩ�ı�����ʧȥ֮����Ҫ�������¼�����ķ�����
function checkuser(){
	//������ֻҪ�û����Ϸ���������ͨ��
	var flag = false;
	//��ȡ��ǰ��user���input��ǩ����
	var user = document.getElementById("user").value;
	//��ȡ�û���ʾ�û�����Ϣ��span��ǩ
	var userspan = document.getElementById("userspan");
	//��֤�û����Ƿ�Ϸ�
	if(user == ""){
		userspan.innerHTML = "�û�������".fontcolor('red');
		
	}else{
		userspan.innerHTML = "�û�����ȷ".fontcolor('green');
		flag = true;
	}
	return flag;
}
//��֤�û�����������
function checkpwd(){
	var flag = false;
	//��ȡ�û����������ֵ
	var pwd = document.getElementById("pwd").value;
	
	var pwdspan = document.getElementById("pwdspan");
	
	if( pwd == "" ){
		pwdspan.innerHTML = "���벻��Ϊ��".fontcolor("red");
	}else{
		pwdspan.innerHTML = "������ȷ".fontcolor("yellow");
		flag = true;
	}
	return flag;
}
//��֤ȷ������
function checkrepwd(){
	var flag = false;
	//��ȡ�û����������ֵ
	var pwd = document.getElementById("pwd").value;
	var repwd = document.getElementById("repwd").value;
	var repwdspan = document.getElementById("repwdspan");
	if(pwd == repwd){
		repwdspan.innerHTML = "����һ��".fontcolor("blue");
		flag = true;
	}else{
		repwdspan.innerHTML = "���벻һ��".fontcolor("red");
	}
	return flag;
}
//��֤�Ա�
function checksex(){
	var sexs = document.getElementsByName("sex");
	//�����������ͳ�Ƶ�ѡ��ťѡ���˼���
	var count = 0;
	for(var i=0;i<sexs.length;i++){
		if( sexs[i].checked ){
			count ++;
		}
	}
	//�ж�count�Ƿ�Ϊ1
	if( count != 1 ){
		document.getElementById("sexspan").innerHTML = "��ѡ���Ա�".fontcolor('red');
	}
}
//��֤��ѡ��
function checkhobby(){
	//��ȡ���е�nameΪhobby��checkbox��ѡ��
	var hobbys = document.getElementsByName("hobby");
	var count = 0;
	for(var i=0;i<hobbys.length;i++){
		if( hobbys[i].checked ){
			count++;
			break;
		}
	}
	if(count == 0){
		document.getElementById("hspan").innerHTML = "���ñ���ѡ��һ��".fontcolor('red');
	}
}

function check(){
	if( checkuser() && checkpwd() && checkrepwd() ){
		return true;
	}
	return false;
	
}





