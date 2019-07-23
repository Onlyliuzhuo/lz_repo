package org.worryfreehealth.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.AdminInfoDao;

import com.opensymphony.xwork2.ActionSupport;

public class AddAdminAction extends ActionSupport {

	private String adminID;
	private String adminPassword;
	private String adminRePassword;
	private String adminTel;
	private String adminName;

	public String execute() throws Exception {
		AdminInfoDao aio = new AdminInfoDao();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");// 防止弹出的信息出现乱码
		PrintWriter out = response.getWriter();
		if (aio.saveUser(adminID, adminPassword, adminName, adminTel)) {
			out.print("<script>alert('添加成功！')</script>");
			out.print("<script>window.location.href='addAdmin.jsp'</script>");
			out.flush();
			out.close();
			return NONE;
		} else {
			out.print("<script>alert('添加失败！')</script>");
			out.print("<script>window.location.href='addAdmin.jsp'</script>");
			out.flush();
			out.close();
			return NONE;
		}
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
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

	public String getAdminRePassword() {
		return adminRePassword;
	}

	public void setAdminRePassword(String adminRePassword) {
		this.adminRePassword = adminRePassword;
	}

	public String getAdminTel() {
		return adminTel;
	}

	public void setAdminTel(String adminTel) {
		this.adminTel = adminTel;
	}

}
