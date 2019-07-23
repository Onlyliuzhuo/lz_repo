package org.worryfreehealth.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.PatientInfoDao;
import org.worryfreehealth.vo.PatientInfo;

import com.opensymphony.xwork2.ActionSupport;

public class ExaminThenSearchPatientAction extends ActionSupport{
	
	public String execute() throws Exception{
		PatientInfoDao pio = new PatientInfoDao();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<PatientInfo> list = pio.queryAllUserIfExamined();
		request.setAttribute("count", list.size());
		if(!list.isEmpty()){
			request.setAttribute("patient", list);
		}
		return SUCCESS;		
	}
}
