package org.worryfreehealth.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * PatientInfo entity. @author MyEclipse Persistence Tools
 */

public class PatientInfo implements java.io.Serializable {

	// Fields

	private String patientId;
	private String patientPassword;
	private String patientName;
	private String patientSex;
	private Integer patientAge;
	private String patientTel;
	private String patientHeadPortrait;
	private Integer patientIsExamined;
	private Integer patientIsUsed;
	private Set orderListInfos = new HashSet(0);
	private Set messageBoardInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public PatientInfo() {
	}

	/** minimal constructor */
	public PatientInfo(String patientId) {
		this.patientId = patientId;
	}

	/** full constructor */
	public PatientInfo(String patientId, String patientPassword,
			String patientName, String patientSex, Integer patientAge,
			String patientTel, String patientHeadPortrait,
			Integer patientIsExamined, Integer patientIsUsed,
			Set orderListInfos, Set messageBoardInfos) {
		this.patientId = patientId;
		this.patientPassword = patientPassword;
		this.patientName = patientName;
		this.patientSex = patientSex;
		this.patientAge = patientAge;
		this.patientTel = patientTel;
		this.patientHeadPortrait = patientHeadPortrait;
		this.patientIsExamined = patientIsExamined;
		this.patientIsUsed = patientIsUsed;
		this.orderListInfos = orderListInfos;
		this.messageBoardInfos = messageBoardInfos;
	}

	// Property accessors

	public String getPatientId() {
		return this.patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientPassword() {
		return this.patientPassword;
	}

	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}

	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientSex() {
		return this.patientSex;
	}

	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}

	public Integer getPatientAge() {
		return this.patientAge;
	}

	public void setPatientAge(Integer patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientTel() {
		return this.patientTel;
	}

	public void setPatientTel(String patientTel) {
		this.patientTel = patientTel;
	}

	public String getPatientHeadPortrait() {
		return this.patientHeadPortrait;
	}

	public void setPatientHeadPortrait(String patientHeadPortrait) {
		this.patientHeadPortrait = patientHeadPortrait;
	}

	public Integer getPatientIsExamined() {
		return this.patientIsExamined;
	}

	public void setPatientIsExamined(Integer patientIsExamined) {
		this.patientIsExamined = patientIsExamined;
	}

	public Integer getPatientIsUsed() {
		return this.patientIsUsed;
	}

	public void setPatientIsUsed(Integer patientIsUsed) {
		this.patientIsUsed = patientIsUsed;
	}

	public Set getOrderListInfos() {
		return this.orderListInfos;
	}

	public void setOrderListInfos(Set orderListInfos) {
		this.orderListInfos = orderListInfos;
	}

	public Set getMessageBoardInfos() {
		return this.messageBoardInfos;
	}

	public void setMessageBoardInfos(Set messageBoardInfos) {
		this.messageBoardInfos = messageBoardInfos;
	}

}