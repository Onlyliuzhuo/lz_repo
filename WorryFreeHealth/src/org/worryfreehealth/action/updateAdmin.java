package org.worryfreehealth.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.AdminInfoDao;
import org.worryfreehealth.vo.AdminInfo;

import com.opensymphony.xwork2.ActionSupport;

public class updateAdmin extends ActionSupport{
	private  String adminId;
	public String execute() throws Exception{
		AdminInfoDao aio = new AdminInfoDao();
		HttpServletRequest request = ServletActionContext.getRequest();
		//HttpSession session = request.getSession();
		List list = aio.queryUserById(adminId);
		//AdminInfo a =(AdminInfo)list.get(0);
		//System.out.println(a.getAdminId());
		if(!list.isEmpty()){
			request.setAttribute("admin", list);
		}
		return SUCCESS;		
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

}
