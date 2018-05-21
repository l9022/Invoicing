 ;
 
function checkForm() {
	var code = checkCode();
    var name = checkName();
    var phone = checkPhone();
    var email = checkEmail();
    
    return code && name && phone && email;
}
	
function checkCode() {
	var code = document.getElementById('code');
	var codeMsg = document.getElementById('codeMsg'); 
	var reg = new RegExp("[0-9]{1,3}");
	if(code.value.length == 0 || code.value.length > 3){ 
		codeMsg.innerHTML="<font color='red'>编号不能为空且编号不能超过3位</font>"
		codeMsg.className="error"
	    return false; 
	} else if(!reg.test(code.value)){ 
		codeMsg.innerHTML="<font color='red'>编号只能输入数字</font>"
		codeMsg.className="error"
	    return false; 
	} else{ 
	    codeMsg.innerHTML="<font color='green'>OK</font>"
	    codeMsg.className="success"; 
	    return true; 
	}
}
	
function checkName(){ 
    var name = document.getElementById('name'); 
	var nameMsg = document.getElementById('nameMsg'); 
	if(name.value.length == 0){ 
		nameMsg.innerHTML="<font color='red'>员工名称不能为空</font>"
		nameMsg.className="error"
	    return false; 
	} else if(name.value.length > 10){ 
		nameMsg.innerHTML="<font color='red'>员工名称长度不能超过十位</font>"
		nameMsg.className="error"
		return false; 
	} else{ 
		nameMsg.innerHTML="<font color='green'>OK</font>"
		nameMsg.className="success"; 
		    return true; 
	} 
} 
	
function checkPhone(){ 
    var phone = document.getElementById('phone'); 
	var phoneMsg = document.getElementById('phoneMsg'); 
	var reg = new RegExp("[0-9]{11}"); //验证手机号正则表达式 
	if(phone.value.length == 0){ 
		phoneMsg.innerHTML="<font color='red'>手机号码不能为空</font>"
		phoneMsg.className="error"
	    return false; 
	} else if(phone.value.length != 11){ 
		phoneMsg.innerHTML="<font color='red'>手机号码长度必须是11位</font>"
		phoneMsg.className="error"
		return false; 
	} else if(!reg.test(phone.value)){
		phoneMsg.innerHTML="<font color='red'>手机号码内容必须是数字</font>"
		phoneMsg.className="error"
		return false; 
	} else { 
		phoneMsg.innerHTML="<font color='green'>OK</font>"
		phoneMsg.className="success"; 
	    return true; 
	} 
}
	
function checkEmail(){
    var reg = new RegExp("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$"); //正则表达式
	var email = document.getElementById("email"); //要验证的对象
	var emailMsg= document.getElementById("emailMsg")
	if(email.value.length == 0){ //输入不能为空
		emailMsg.innerHTML="<font color='red'>邮箱地址不能为空</font>"
		emailMsg.className="error"
	    return false;
	}else if(!reg.test(email.value)){ //正则验证不通过，格式不对
	    emailMsg.innerHTML="<font color='red'>邮箱地址不合法</font>!"
		emailMsg.className="error"
	    return false;
	}else{
	    emailMsg.innerHTML="<font color='green'>OK</font>"
		emailMsg.className="success"; 
	    return true;
	}
}

