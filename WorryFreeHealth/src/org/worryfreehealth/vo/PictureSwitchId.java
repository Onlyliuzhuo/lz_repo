package org.worryfreehealth.vo;

/**
 * PictureSwitchId entity. @author MyEclipse Persistence Tools
 */

public class PictureSwitchId implements java.io.Serializable {

	// Fields

	private String pictureOne;
	private String pictureTwo;
	private String pictureThree;
	private String pictureFour;

	// Constructors

	/** default constructor */
	public PictureSwitchId() {
	}

	/** full constructor */
	public PictureSwitchId(String pictureOne, String pictureTwo,
			String pictureThree, String pictureFour) {
		this.pictureOne = pictureOne;
		this.pictureTwo = pictureTwo;
		this.pictureThree = pictureThree;
		this.pictureFour = pictureFour;
	}

	// Property accessors

	public String getPictureOne() {
		return this.pictureOne;
	}

	public void setPictureOne(String pictureOne) {
		this.pictureOne = pictureOne;
	}

	public String getPictureTwo() {
		return this.pictureTwo;
	}

	public void setPictureTwo(String pictureTwo) {
		this.pictureTwo = pictureTwo;
	}

	public String getPictureThree() {
		return this.pictureThree;
	}

	public void setPictureThree(String pictureThree) {
		this.pictureThree = pictureThree;
	}

	public String getPictureFour() {
		return this.pictureFour;
	}

	public void setPictureFour(String pictureFour) {
		this.pictureFour = pictureFour;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PictureSwitchId))
			return false;
		PictureSwitchId castOther = (PictureSwitchId) other;

		return ((this.getPictureOne() == castOther.getPictureOne()) || (this
				.getPictureOne() != null && castOther.getPictureOne() != null && this
				.getPictureOne().equals(castOther.getPictureOne())))
				&& ((this.getPictureTwo() == castOther.getPictureTwo()) || (this
						.getPictureTwo() != null
						&& castOther.getPictureTwo() != null && this
						.getPictureTwo().equals(castOther.getPictureTwo())))
				&& ((this.getPictureThree() == castOther.getPictureThree()) || (this
						.getPictureThree() != null
						&& castOther.getPictureThree() != null && this
						.getPictureThree().equals(castOther.getPictureThree())))
				&& ((this.getPictureFour() == castOther.getPictureFour()) || (this
						.getPictureFour() != null
						&& castOther.getPictureFour() != null && this
						.getPictureFour().equals(castOther.getPictureFour())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPictureOne() == null ? 0 : this.getPictureOne()
						.hashCode());
		result = 37
				* result
				+ (getPictureTwo() == null ? 0 : this.getPictureTwo()
						.hashCode());
		result = 37
				* result
				+ (getPictureThree() == null ? 0 : this.getPictureThree()
						.hashCode());
		result = 37
				* result
				+ (getPictureFour() == null ? 0 : this.getPictureFour()
						.hashCode());
		return result;
	}

}