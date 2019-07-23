package org.worryfreehealth.vo;

/**
 * HospitalDeskInfoId entity. @author MyEclipse Persistence Tools
 */

public class HospitalDeskInfoId implements java.io.Serializable {

	// Fields

	private HospitalInfo hospitalInfo;
	private DeskInfo deskInfo;

	// Constructors

	/** default constructor */
	public HospitalDeskInfoId() {
	}

	/** full constructor */
	public HospitalDeskInfoId(HospitalInfo hospitalInfo, DeskInfo deskInfo) {
		this.hospitalInfo = hospitalInfo;
		this.deskInfo = deskInfo;
	}

	// Property accessors

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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HospitalDeskInfoId))
			return false;
		HospitalDeskInfoId castOther = (HospitalDeskInfoId) other;

		return ((this.getHospitalInfo() == castOther.getHospitalInfo()) || (this
				.getHospitalInfo() != null
				&& castOther.getHospitalInfo() != null && this
				.getHospitalInfo().equals(castOther.getHospitalInfo())))
				&& ((this.getDeskInfo() == castOther.getDeskInfo()) || (this
						.getDeskInfo() != null
						&& castOther.getDeskInfo() != null && this
						.getDeskInfo().equals(castOther.getDeskInfo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getHospitalInfo() == null ? 0 : this.getHospitalInfo()
						.hashCode());
		result = 37 * result
				+ (getDeskInfo() == null ? 0 : this.getDeskInfo().hashCode());
		return result;
	}

}