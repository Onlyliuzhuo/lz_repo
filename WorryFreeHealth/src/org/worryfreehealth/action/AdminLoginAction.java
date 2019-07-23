package org.worryfreehealth.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.AdminInfoDao;

import com.opensymphony.xwork2.ActionSupport;

public class AdminLoginAction extends ActionSupport{

	private String adminID;
	private String adminPassword;
	
	public String execute() throws Exception{
		AdminInfoDao aio = new AdminInfoDao();
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");// 防止弹出的信息出现乱码
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		session.setAttribute("adminId", adminID);
				
		if (aio.adminLogin(adminID, adminPassword)&&aio.adminLogin(adminID)) {
			out.print("<script>window.location.href='index.jsp'</script>");
			out.flush();
			out.close();
			return NONE;
		} else {
			out.print("<script>alert('输入信息有误！')</script>");
			out.print("<script>window.location.href='login.jsp'</script>");
			out.flush();
			out.close();
			return NONE;
		}		
	}
	
	public String getAdminID() {
		return adminID;
	}
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

}
