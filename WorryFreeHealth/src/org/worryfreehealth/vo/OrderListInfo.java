package org.worryfreehealth.vo;

/**
 * OrderListInfo entity. @author MyEclipse Persistence Tools
 */

public class OrderListInfo implements java.io.Serializable {

	// Fields

	private String orderListId;
	private HospitalInfo hospitalInfo;
	private DeskInfo deskInfo;
	private PatientInfo patientInfo;
	private String doctorId;
	private String doctorName;
	private Double doctorMoney;
	private String patientName;
	private String patientTel;
	private String patientDiseaseDescrible;
	private String patientDiseasePicture;
	private String hospitalName;
	private String deskName;
	private String orderListDate;
	private String orderListStartTime;
	private String orderListEndTime;
	private Integer orderListIsCancel;
	private Integer orderListIsFinish;

	// Constructors

	/** default constructor */
	public OrderListInfo() {
	}

	/** minimal constructor */
	public OrderListInfo(String orderListId) {
		this.orderListId = orderListId;
	}

	/** full constructor */
	public OrderListInfo(String orderListId, HospitalInfo hospitalInfo,
			DeskInfo deskInfo, PatientInfo patientInfo, String doctorId,
			String doctorName, Double doctorMoney, String patientName,
			String patientTel, String patientDiseaseDescrible,
			String patientDiseasePicture, String hospitalName, String deskName,
			String orderListDate, String orderListStartTime,
			String orderListEndTime, Integer orderListIsCancel,
			Integer orderListIsFinish) {
		this.orderListId = orderListId;
		this.hospitalInfo = hospitalInfo;
		this.deskInfo = deskInfo;
		this.patientInfo = patientInfo;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorMoney = doctorMoney;
		this.patientName = patientName;
		this.patientTel = patientTel;
		this.patientDiseaseDescrible = patientDiseaseDescrible;
		this.patientDiseasePicture = patientDiseasePicture;
		this.hospitalName = hospitalName;
		this.deskName = deskName;
		this.orderListDate = orderListDate;
		this.orderListStartTime = orderListStartTime;
		this.orderListEndTime = orderListEndTime;
		this.orderListIsCancel = orderListIsCancel;
		this.orderListIsFinish = orderListIsFinish;
	}

	// Property accessors

	public String getOrderListId() {
		return this.orderListId;
	}

	public void setOrderListId(String orderListId) {
		this.orderListId = orderListId;
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

	public PatientInfo getPatientInfo() {
		return this.patientInfo;
	}

	public void setPatientInfo(PatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}

	public String getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return this.doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Double getDoctorMoney() {
		return this.doctorMoney;
	}

	public void setDoctorMoney(Double doctorMoney) {
		this.doctorMoney = doctorMoney;
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

	public String getPatientDiseaseDescrible() {
		return this.patientDiseaseDescrible;
	}

	public void setPatientDiseaseDescrible(String patientDiseaseDescrible) {
		this.patientDiseaseDescrible = patientDiseaseDescrible;
	}

	public String getPatientDiseasePicture() {
		return this.patientDiseasePicture;
	}

	public void setPatientDiseasePicture(String patientDiseasePicture) {
		this.patientDiseasePicture = patientDiseasePicture;
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

	public String getOrderListDate() {
		return this.orderListDate;
	}

	public void setOrderListDate(String orderListDate) {
		this.orderListDate = orderListDate;
	}

	public String getOrderListStartTime() {
		return this.orderListStartTime;
	}

	public void setOrderListStartTime(String orderListStartTime) {
		this.orderListStartTime = orderListStartTime;
	}

	public String getOrderListEndTime() {
		return this.orderListEndTime;
	}

	public void setOrderListEndTime(String orderListEndTime) {
		this.orderListEndTime = orderListEndTime;
	}

	public Integer getOrderListIsCancel() {
		return this.orderListIsCancel;
	}

	public void setOrderListIsCancel(Integer orderListIsCancel) {
		this.orderListIsCancel = orderListIsCancel;
	}

	public Integer getOrderListIsFinish() {
		return this.orderListIsFinish;
	}

	public void setOrderListIsFinish(Integer orderListIsFinish) {
		this.orderListIsFinish = orderListIsFinish;
	}

}