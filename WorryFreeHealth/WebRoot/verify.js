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
		alert("�˺Ų���Ϊ�գ�");
	}
	else if(password==""){
		alert("���벻��Ϊ�գ�");
	}
	else if(password!=passwordConfirm){
		alert("�������벻һ�£�");
	}
	else if(name==""){
		alert("��������Ϊ�գ�");
	}
	else if(sex==""){
		alert("�Ա���Ϊ�գ�");
	}
	else if(Tel==""){
		alert("�绰����Ϊ�գ�");
	}
	else if(deskName==""){
		alert("���Ҳ���Ϊ�գ�");
	}
	else if(hospitalName==""){
		alert("ҽԺ����Ϊ�գ�");
	}
	else if(describe==""){
		alert("�ó���������Ϊ�գ�");
	}
	else{
		document.doctorRegisterForm.submit();
	}
}