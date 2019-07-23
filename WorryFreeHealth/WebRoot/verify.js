/**
 * 
 */
function confirm(){
	var account = document.getElementById("doctorAccount").value;
	var password = document.getElementById("doctorPassword").value;	
	var passwordConfirm = document.doctorRegisterForm.doctorConfirmPassword.value;
	var name = document.getElementById("doctorName").value;
	var sex = document.getElementById("doctorSex").value;
	var Tel = document.getElementById("doctorTel").value;
	var deskName = document.getElementById("doctorDeskName").value;
	var hospitalName = document.getElementById("doctorHospitalName").value;
	var describe = document.getElementById("doctorDescribe").value;
	alert("account");
	if(account==""){
		alert("账号不能为空！");
	}
	else if(password==""){
		alert("密码不能为空！");
	}
	else if(password!=passwordConfirm){
		alert("两次密码不一致！");
	}
	else if(name==""){
		alert("姓名不能为空！");
	}
	else if(sex==""){
		alert("性别不能为空！");
	}
	else if(Tel==""){
		alert("电话不能为空！");
	}
	else if(deskName==""){
		alert("科室不能为空！");
	}
	else if(hospitalName==""){
		alert("医院不能为空！");
	}
	else if(describe==""){
		alert("擅长疾病不能为空！");
	}
	else{
		document.doctorRegisterForm.submit();
	}
}