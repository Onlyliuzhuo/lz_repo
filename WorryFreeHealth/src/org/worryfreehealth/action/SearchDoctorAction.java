package org.worryfreehealth.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.DoctorInfoDao;
import org.worryfreehealth.vo.DoctorInfo;

import com.opensymphony.xwork2.ActionSupport;

public class SearchDoctorAction extends ActionSupport {

	private String doctorId;

	public String execute() throws Exception {
		DoctorInfoDao dio = new DoctorInfoDao();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<DoctorInfo> list = dio.queryUser(doctorId, 1, 1);
		//System.out.println(doctorId);
		request.setAttribute("count", list.size());
		if (!list.isEmpty()) {
			request.setAttribute("doctor", list);
		}
		return SUCCESS;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

}
