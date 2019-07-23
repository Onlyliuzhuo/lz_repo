package org.worryfreehealth.vo;

/**
 * HospitalDeskInfo entity. @author MyEclipse Persistence Tools
 */

public class HospitalDeskInfo implements java.io.Serializable {

	// Fields

	private HospitalDeskInfoId id;

	// Constructors

	/** default constructor */
	public HospitalDeskInfo() {
	}

	/** full constructor */
	public HospitalDeskInfo(HospitalDeskInfoId id) {
		this.id = id;
	}

	// Property accessors

	public HospitalDeskInfoId getId() {
		return this.id;
	}

	public void setId(HospitalDeskInfoId id) {
		this.id = id;
	}

}