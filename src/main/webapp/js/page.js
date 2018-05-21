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
	if(code.value.length == 0){ 
		codeMsg.innerHTML="<font color='red'>编号不能为空</font>"
		codeMsg.className="error"
	    return false; 
	} else if(code.value.length>3){ 
		codeMsg.innerHTML="<font color='red'>编号不能超过3位</font>"
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
		nameMsg.innerHTML="<font color='red'>员工姓名不能为空</font>"
		nameMsg.className="error"
	    return false; 
	} else if(name.value.length > 10){ 
		nameMsg.innerHTML="<font color='red'>员工姓名长度不能超过十位</font>"
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
	//var pattern = /^1[34578]\d{9}$/; //验证手机号正则表达式 
	if(phone.value.length == 0){ 
		phoneMsg.innerHTML="<font color='red'>手机号码不能为空</font>"
		phoneMsg.className="error"
	    return false; 
	} else if(phone.value.length != 11){ 
		phoneMsg.innerHTML="<font color='red'>手机号码长度必须是11位</font>"
		phoneMsg.className="error"
		return false; 
	} else{ 
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

