package org.worryfreehealth.vo;

/**
 * AdminInfo entity. @author MyEclipse Persistence Tools
 */

public class AdminInfo implements java.io.Serializable {

	// Fields

	private String adminId;
	private String adminPassword;
	private String adminName;
	private String adminTel;
	private String adminLastLoginTime;

	// Constructors

	/** default constructor */
	public AdminInfo() {
	}

	/** minimal constructor */
	public AdminInfo(String adminId) {
		this.adminId = adminId;
	}

	/** full constructor */
	public AdminInfo(String adminId, String adminPassword, String adminName,
			String adminTel, String adminLastLoginTime) {
		this.adminId = adminId;
		this.adminPassword = adminPassword;
		this.adminName = adminName;
		this.adminTel = adminTel;
		this.adminLastLoginTime = adminLastLoginTime;
	}

	// Property accessors

	public String getAdminId() {
		return this.adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPassword() {
		return this.adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminTel() {
		return this.adminTel;
	}

	public void setAdminTel(String adminTel) {
		this.adminTel = adminTel;
	}

	public String getAdminLastLoginTime() {
		return this.adminLastLoginTime;
	}

	public void setAdminLastLoginTime(String adminLastLoginTime) {
		this.adminLastLoginTime = adminLastLoginTime;
	}

}