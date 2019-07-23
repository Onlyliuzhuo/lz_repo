package org.worryfreehealth.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * DoctorInfo entity. @author MyEclipse Persistence Tools
 */

public class DoctorInfo implements java.io.Serializable {

	// Fields

	private String doctorId;
	private HospitalInfo hospitalInfo;
	private DeskInfo deskInfo;
	private String doctorPassword;
	private String doctorName;
	private String doctorSex;
	private Integer doctorAge;
	private String doctorTel;
	private String doctorLevel;
	private String doctorDescrible;
	private String doctorHeadPortrait;
	private String doctorPicture;
	private String hospitalName;
	private String deskName;
	private Integer doctorIsExamined;
	private Integer doctorIsUsed;
	private Double doctorMoney;
	private Set messageBoardInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public DoctorInfo() {
	}

	/** minimal constructor */
	public DoctorInfo(String doctorId) {
		this.doctorId = doctorId;
	}

	/** full constructor */
	public DoctorInfo(String doctorId, HospitalInfo hospitalInfo,
			DeskInfo deskInfo, String doctorPassword, String doctorName,
			String doctorSex, Integer doctorAge, String doctorTel,
			String doctorLevel, String doctorDescrible,
			String doctorHeadPortrait, String doctorPicture,
			String hospitalName, String deskName, Integer doctorIsExamined,
			Integer doctorIsUsed, Double doctorMoney, Set messageBoardInfos) {
		this.doctorId = doctorId;
		this.hospitalInfo = hospitalInfo;
		this.deskInfo = deskInfo;
		this.doctorPassword = doctorPassword;
		this.doctorName = doctorName;
		this.doctorSex = doctorSex;
		this.doctorAge = doctorAge;
		this.doctorTel = doctorTel;
		this.doctorLevel = doctorLevel;
		this.doctorDescrible = doctorDescrible;
		this.doctorHeadPortrait = doctorHeadPortrait;
		this.doctorPicture = doctorPicture;
		this.hospitalName = hospitalName;
		this.deskName = deskName;
		this.doctorIsExamined = doctorIsExamined;
		this.doctorIsUsed = doctorIsUsed;
		this.doctorMoney = doctorMoney;
		this.messageBoardInfos = messageBoardInfos;
	}

	// Property accessors

	public String getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public HospitalInfo getHospitalInfo() {
		return this.hospitalInfo;
	}

	public void setHospitalInfo(HospitalInfo hospitalInfo) {
		this.hospitalInfo = hospitalInfo;
	}

	public DeskInfo getDeskInfo() {
		return this.deskInfo;
	}

	public void setDeskInfo(DeskInfo deskInfo) {
		this.deskInfo = deskInfo;
	}

	public String getDoctorPassword() {
		return this.doctorPassword;
	}

	public void setDoctorPassword(String doctorPassword) {
		this.doctorPassword = doctorPassword;
	}

	public String getDoctorName() {
		return this.doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorSex() {
		return this.doctorSex;
	}

	public void setDoctorSex(String doctorSex) {
		this.doctorSex = doctorSex;
	}

	public Integer getDoctorAge() {
		return this.doctorAge;
	}

	public void setDoctorAge(Integer doctorAge) {
		this.doctorAge = doctorAge;
	}

	public String getDoctorTel() {
		return this.doctorTel;
	}

	public void setDoctorTel(String doctorTel) {
		this.doctorTel = doctorTel;
	}

	public String getDoctorLevel() {
		return this.doctorLevel;
	}

	public void setDoctorLevel(String doctorLevel) {
		this.doctorLevel = doctorLevel;
	}

	public String getDoctorDescrible() {
		return this.doctorDescrible;
	}

	public void setDoctorDescrible(String doctorDescrible) {
		this.doctorDescrible = doctorDescrible;
	}

	public String getDoctorHeadPortrait() {
		return this.doctorHeadPortrait;
	}

	public void setDoctorHeadPortrait(String doctorHeadPortrait) {
		this.doctorHeadPortrait = doctorHeadPortrait;
	}

	public String getDoctorPicture() {
		return this.doctorPicture;
	}

	public void setDoctorPicture(String doctorPicture) {
		this.doctorPicture = doctorPicture;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getDeskName() {
		return this.deskName;
	}

	public void setDeskName(String deskName) {
		this.deskName = deskName;
	}

	public Integer getDoctorIsExamined() {
		return this.doctorIsExamined;
	}

	public void setDoctorIsExamined(Integer doctorIsExamined) {
		this.doctorIsExamined = doctorIsExamined;
	}

	public Integer getDoctorIsUsed() {
		return this.doctorIsUsed;
	}

	public void setDoctorIsUsed(Integer doctorIsUsed) {
		this.doctorIsUsed = doctorIsUsed;
	}

	public Double getDoctorMoney() {
		return this.doctorMoney;
	}

	public void setDoctorMoney(Double doctorMoney) {
		this.doctorMoney = doctorMoney;
	}

	public Set getMessageBoardInfos() {
		return this.messageBoardInfos;
	}

	public void setMessageBoardInfos(Set messageBoardInfos) {
		this.messageBoardInfos = messageBoardInfos;
	}

}