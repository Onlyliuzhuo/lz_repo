package org.worryfreehealth.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.HospitalInfoDao;
import org.worryfreehealth.dao.PatientInfoDao;
import org.worryfreehealth.vo.HospitalInfo;
import org.worryfreehealth.vo.PatientInfo;

import com.opensymphony.xwork2.ActionSupport;

public class SearchHospitalAction extends ActionSupport{
	private String hospitalID;
	
	public String execute() throws Exception{
		HospitalInfoDao hio = new HospitalInfoDao();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<HospitalInfo> list = hio.queryHospital(hospitalID);
		request.setAttribute("count", list.size());
		if(!list.isEmpty()){
			request.setAttribute("hospital", list);
		}
		return SUCCESS;		
	}
	
	public String getHospitalID() {
		return hospitalID;
	}

	public void setHospitalID(String hospitalID) {
		this.hospitalID = hospitalID;
	}

}
