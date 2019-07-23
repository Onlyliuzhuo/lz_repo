package org.worryfreehealth.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.HospitalInfoDao;
import org.worryfreehealth.vo.HospitalInfo;

import com.opensymphony.xwork2.ActionSupport;

public class SearchThenUpdateHospitalMessageAction extends ActionSupport{
	
	private String hospitalId;
	
	public String execute() throws Exception{
		//System.out.println("111");
		HospitalInfoDao hio = new HospitalInfoDao();
		HttpServletRequest request = ServletActionContext.getRequest();
		//System.out.println(hospitalId);
		List<HospitalInfo> list = hio.queryHospitalById(hospitalId);
		//System.out.println("111");
		if(!list.isEmpty()){
			request.setAttribute("hospital", list);
		}
		return SUCCESS;		
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

}
