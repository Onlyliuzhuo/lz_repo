package org.worryfreehealth.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * DeskInfo entity. @author MyEclipse Persistence Tools
 */

public class DeskInfo implements java.io.Serializable {

	// Fields

	private String deskId;
	private String deskName;
	private String deskTel;
	private String deskLevel;
	private Set orderListInfos = new HashSet(0);
	private Set doctorInfos = new HashSet(0);
	private Set hospitalDeskInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public DeskInfo() {
	}

	/** minimal constructor */
	public DeskInfo(String deskId) {
		this.deskId = deskId;
	}

	/** full constructor */
	public DeskInfo(String deskId, String deskName, String deskTel,
			String deskLevel, Set orderListInfos, Set doctorInfos,
			Set hospitalDeskInfos) {
		this.deskId = deskId;
		this.deskName = deskName;
		this.deskTel = deskTel;
		this.deskLevel = deskLevel;
		this.orderListInfos = orderListInfos;
		this.doctorInfos = doctorInfos;
		this.hospitalDeskInfos = hospitalDeskInfos;
	}

	// Property accessors

	public String getDeskId() {
		return this.deskId;
	}

	public void setDeskId(String deskId) {
		this.deskId = deskId;
	}

	public String getDeskName() {
		return this.deskName;
	}

	public void setDeskName(String deskName) {
		this.deskName = deskName;
	}

	public String getDeskTel() {
		return this.deskTel;
	}

	public void setDeskTel(String deskTel) {
		this.deskTel = deskTel;
	}

	public String getDeskLevel() {
		return this.deskLevel;
	}

	public void setDeskLevel(String deskLevel) {
		this.deskLevel = deskLevel;
	}

	public Set getOrderListInfos() {
		return this.orderListInfos;
	}

	public void setOrderListInfos(Set orderListInfos) {
		this.orderListInfos = orderListInfos;
	}

	public Set getDoctorInfos() {
		return this.doctorInfos;
	}

	public void setDoctorInfos(Set doctorInfos) {
		this.doctorInfos = doctorInfos;
	}

	public Set getHospitalDeskInfos() {
		return this.hospitalDeskInfos;
	}

	public void setHospitalDeskInfos(Set hospitalDeskInfos) {
		this.hospitalDeskInfos = hospitalDeskInfos;
	}

}