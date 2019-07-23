package org.worryfreehealth.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.AdminInfoDao;
import org.worryfreehealth.dao.PatientInfoDao;
import org.worryfreehealth.vo.AdminInfo;
import org.worryfreehealth.vo.PatientInfo;

import com.opensymphony.xwork2.ActionSupport;

public class SearchPatientAction extends ActionSupport{
	
	private String patientName;

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	public String execute() throws Exception{
		PatientInfoDao pio = new PatientInfoDao();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<PatientInfo> list = pio.queryPatient(patientName);
		request.setAttribute("count", list.size());
		if(!list.isEmpty()){
			request.setAttribute("patient", list);
		}
		return SUCCESS;		
	}

}
