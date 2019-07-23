package org.worryfreehealth.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * HospitalInfo entity. @author MyEclipse Persistence Tools
 */

public class HospitalInfo implements java.io.Serializable {

	// Fields

	private String hospitalId;
	private String hospitalName;
	private String hospitalTel;
	private String hospitalWebsite;
	private String hospitalAdress;
	private String hospitalMajor;
	private String hospitalLevel;
	private String hospitalDescribe;
	private String hospitalRegRule;
	private String hospitalPicture;
	private Integer hodpitalIsExamined;
	private Set hospitalDeskInfos = new HashSet(0);
	private Set orderListInfos = new HashSet(0);
	private Set doctorInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public HospitalInfo() {
	}

	/** minimal constructor */
	public HospitalInfo(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	/** full constructor */
	public HospitalInfo(String hospitalId, String hospitalName,
			String hospitalTel, String hospitalWebsite, String hospitalAdress,
			String hospitalMajor, String hospitalLevel,
			String hospitalDescribe, String hospitalRegRule,
			String hospitalPicture, Integer hodpitalIsExamined,
			Set hospitalDeskInfos, Set orderListInfos, Set doctorInfos) {
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.hospitalTel = hospitalTel;
		this.hospitalWebsite = hospitalWebsite;
		this.hospitalAdress = hospitalAdress;
		this.hospitalMajor = hospitalMajor;
		this.hospitalLevel = hospitalLevel;
		this.hospitalDescribe = hospitalDescribe;
		this.hospitalRegRule = hospitalRegRule;
		this.hospitalPicture = hospitalPicture;
		this.hodpitalIsExamined = hodpitalIsExamined;
		this.hospitalDeskInfos = hospitalDeskInfos;
		this.orderListInfos = orderListInfos;
		this.doctorInfos = doctorInfos;
	}

	// Property accessors

	public String getHospitalId() {
		return this.hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalTel() {
		return this.hospitalTel;
	}

	public void setHospitalTel(String hospitalTel) {
		this.hospitalTel = hospitalTel;
	}

	public String getHospitalWebsite() {
		return this.hospitalWebsite;
	}

	public void setHospitalWebsite(String hospitalWebsite) {
		this.hospitalWebsite = hospitalWebsite;
	}

	public String getHospitalAdress() {
		return this.hospitalAdress;
	}

	public void setHospitalAdress(String hospitalAdress) {
		this.hospitalAdress = hospitalAdress;
	}

	public String getHospitalMajor() {
		return this.hospitalMajor;
	}

	public void setHospitalMajor(String hospitalMajor) {
		this.hospitalMajor = hospitalMajor;
	}

	public String getHospitalLevel() {
		return this.hospitalLevel;
	}

	public void setHospitalLevel(String hospitalLevel) {
		this.hospitalLevel = hospitalLevel;
	}

	public String getHospitalDescribe() {
		return this.hospitalDescribe;
	}

	public void setHospitalDescribe(String hospitalDescribe) {
		this.hospitalDescribe = hospitalDescribe;
	}

	public String getHospitalRegRule() {
		return this.hospitalRegRule;
	}

	public void setHospitalRegRule(String hospitalRegRule) {
		this.hospitalRegRule = hospitalRegRule;
	}

	public String getHospitalPicture() {
		return this.hospitalPicture;
	}

	public void setHospitalPicture(String hospitalPicture) {
		this.hospitalPicture = hospitalPicture;
	}

	public Integer getHodpitalIsExamined() {
		return this.hodpitalIsExamined;
	}

	public void setHodpitalIsExamined(Integer hodpitalIsExamined) {
		this.hodpitalIsExamined = hodpitalIsExamined;
	}

	public Set getHospitalDeskInfos() {
		return this.hospitalDeskInfos;
	}

	public void setHospitalDeskInfos(Set hospitalDeskInfos) {
		this.hospitalDeskInfos = hospitalDeskInfos;
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

}