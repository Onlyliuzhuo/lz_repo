package org.worryfreehealth.vo;

/**
 * MessageBoardInfo entity. @author MyEclipse Persistence Tools
 */

public class MessageBoardInfo implements java.io.Serializable {

	// Fields

	private String messageId;
	private PatientInfo patientInfo;
	private DoctorInfo doctorInfo;
	private String patientName;
	private String patientTel;
	private String doctorName;
	private String patientMessage;
	private String doctorReply;
	private String messageStartDate;
	private String messageEndDate;
	private String messageDiseasePicture;
	private Integer messageIsExamined;
	private Integer messageIsEnd;

	// Constructors

	/** default constructor */
	public MessageBoardInfo() {
	}

	/** minimal constructor */
	public MessageBoardInfo(String messageId) {
		this.messageId = messageId;
	}

	/** full constructor */
	public MessageBoardInfo(String messageId, PatientInfo patientInfo,
			DoctorInfo doctorInfo, String patientName, String patientTel,
			String doctorName, String patientMessage, String doctorReply,
			String messageStartDate, String messageEndDate,
			String messageDiseasePicture, Integer messageIsExamined,
			Integer messageIsEnd) {
		this.messageId = messageId;
		this.patientInfo = patientInfo;
		this.doctorInfo = doctorInfo;
		this.patientName = patientName;
		this.patientTel = patientTel;
		this.doctorName = doctorName;
		this.patientMessage = patientMessage;
		this.doctorReply = doctorReply;
		this.messageStartDate = messageStartDate;
		this.messageEndDate = messageEndDate;
		this.messageDiseasePicture = messageDiseasePicture;
		this.messageIsExamined = messageIsExamined;
		this.messageIsEnd = messageIsEnd;
	}

	// Property accessors

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public PatientInfo getPatientInfo() {
		return this.patientInfo;
	}

	public void setPatientInfo(PatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}

	public DoctorInfo getDoctorInfo() {
		return this.doctorInfo;
	}

	public void setDoctorInfo(DoctorInfo doctorInfo) {
		this.doctorInfo = doctorInfo;
	}

	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientTel() {
		return this.patientTel;
	}

	public void setPatientTel(String patientTel) {
		this.patientTel = patientTel;
	}

	public String getDoctorName() {
		return this.doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getPatientMessage() {
		return this.patientMessage;
	}

	public void setPatientMessage(String patientMessage) {
		this.patientMessage = patientMessage;
	}

	public String getDoctorReply() {
		return this.doctorReply;
	}

	public void setDoctorReply(String doctorReply) {
		this.doctorReply = doctorReply;
	}

	public String getMessageStartDate() {
		return this.messageStartDate;
	}

	public void setMessageStartDate(String messageStartDate) {
		this.messageStartDate = messageStartDate;
	}

	public String getMessageEndDate() {
		return this.messageEndDate;
	}

	public void setMessageEndDate(String messageEndDate) {
		this.messageEndDate = messageEndDate;
	}

	public String getMessageDiseasePicture() {
		return this.messageDiseasePicture;
	}

	public void setMessageDiseasePicture(String messageDiseasePicture) {
		this.messageDiseasePicture = messageDiseasePicture;
	}

	public Integer getMessageIsExamined() {
		return this.messageIsExamined;
	}

	public void setMessageIsExamined(Integer messageIsExamined) {
		this.messageIsExamined = messageIsExamined;
	}

	public Integer getMessageIsEnd() {
		return this.messageIsEnd;
	}

	public void setMessageIsEnd(Integer messageIsEnd) {
		this.messageIsEnd = messageIsEnd;
	}

}