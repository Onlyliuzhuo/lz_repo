package org.worryfreehealth.vo;

/**
 * PictureSwitch entity. @author MyEclipse Persistence Tools
 */

public class PictureSwitch implements java.io.Serializable {

	// Fields

	private PictureSwitchId id;

	// Constructors

	/** default constructor */
	public PictureSwitch() {
	}

	/** full constructor */
	public PictureSwitch(PictureSwitchId id) {
		this.id = id;
	}

	// Property accessors

	public PictureSwitchId getId() {
		return this.id;
	}

	public void setId(PictureSwitchId id) {
		this.id = id;
	}

}