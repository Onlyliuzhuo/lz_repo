package org.worryfreehealth.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.AdminInfoDao;
import org.worryfreehealth.vo.AdminInfo;

import com.opensymphony.xwork2.ActionSupport;

public class SearchAdmin extends ActionSupport{
	private String adminId;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String execute() throws Exception{
		AdminInfoDao aio = new AdminInfoDao();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<AdminInfo> list = aio.queryUser(adminId);
		request.setAttribute("count", list.size());
		if(!list.isEmpty()){
			request.setAttribute("admin", list);
		}
		return SUCCESS;		
	}
}
