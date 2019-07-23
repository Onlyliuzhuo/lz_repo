package org.worryfreehealth.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.HospitalInfoDao;
import org.worryfreehealth.vo.HospitalInfo;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteThenSearchHospitalAction extends ActionSupport{
	
	public String execute() throws Exception{
		HospitalInfoDao hio = new HospitalInfoDao();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<HospitalInfo> list = hio.queryAllHospital();
		request.setAttribute("count", list.size());
		if(!list.isEmpty()){
			request.setAttribute("hospital", list);
		}
		return SUCCESS;		
	}


}
