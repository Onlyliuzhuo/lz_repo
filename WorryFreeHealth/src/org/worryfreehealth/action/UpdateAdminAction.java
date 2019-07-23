package org.worryfreehealth.action;

import org.worryfreehealth.dao.AdminInfoDao;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateAdminAction extends ActionSupport{

	private String adminID;
	private String adminname;
	private String adminpassword;
	private String adminRePassword;
	private String admintel;

	public String execute() throws Exception{
		AdminInfoDao aid = new AdminInfoDao();
		System.out.println(adminID);
		System.out.println(adminname);
		System.out.println(adminpassword);
		System.out.println(admintel);
		if(aid.updateAdminById(adminID, adminname, adminpassword, admintel)){
			return SUCCESS;	
		}
	return NONE;
	}
	
	public String getAdminID() {
		return adminID;
	}

	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getAdminpassword() {
		return adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}

	public String getAdminRePassword() {
		return adminRePassword;
	}

	public void setAdminRePassword(String adminRePassword) {
		this.adminRePassword = adminRePassword;
	}

	public String getAdmintel() {
		return admintel;
	}

	public void setAdmintel(String admintel) {
		this.admintel = admintel;
	}

}
