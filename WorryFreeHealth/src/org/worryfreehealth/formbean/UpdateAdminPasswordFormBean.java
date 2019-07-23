package org.worryfreehealth.formbean;

public class UpdateAdminPasswordFormBean {
	
	private String adminID;
	private String oldPassword;
	private String newPassword;
	private String newRePassword;
	
	public String getAdminID() {
		return adminID;
	}
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getNewRePassword() {
		return newRePassword;
	}
	public void setNewRePassword(String newRePassword) {
		this.newRePassword = newRePassword;
	}
}
