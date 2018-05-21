;

function checkForm() {
	var code = checkCode();
    var name = checkName();
    
    return code && name ;
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
		nameMsg.innerHTML="<font color='red'>商品名称不能为空</font>"
		nameMsg.className="error"
	    return false; 
	} else if(name.value.length > 10){ 
		nameMsg.innerHTML="<font color='red'>商品名称长度不能超过十位</font>"
		nameMsg.className="error"
		return false; 
	} else{ 
		nameMsg.innerHTML="<font color='green'>OK</font>"
		nameMsg.className="success"; 
		    return true; 
	} 
} 