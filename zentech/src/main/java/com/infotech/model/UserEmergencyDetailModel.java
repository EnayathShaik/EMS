package com.infotech.model;

import java.io.Serializable;

public class UserEmergencyDetailModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long userEmergencyDetailID;

	private String bloodGroup;

	private String allergicTo;	

	private String bloodPressure;
	
	private String eyeSightRight;
	
	private String eyeSightLeft;

	private String anyMajorIllness;
	
	private String contactPersonInCaseOfEmergency;
	
	private String emergencyAddress;
	
	private String emergencyNumber;
	
	private Long userID;

	public Long getUserEmergencyDetailID() {
		return userEmergencyDetailID;
	}

	public void setUserEmergencyDetailID(Long userEmergencyDetailID) {
		this.userEmergencyDetailID = userEmergencyDetailID;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAllergicTo() {
		return allergicTo;
	}

	public void setAllergicTo(String allergicTo) {
		this.allergicTo = allergicTo;
	}

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public String getEyeSightRight() {
		return eyeSightRight;
	}

	public void setEyeSightRight(String eyeSightRight) {
		this.eyeSightRight = eyeSightRight;
	}

	public String getEyeSightLeft() {
		return eyeSightLeft;
	}

	public void setEyeSightLeft(String eyeSightLeft) {
		this.eyeSightLeft = eyeSightLeft;
	}

	public String getAnyMajorIllness() {
		return anyMajorIllness;
	}

	public void setAnyMajorIllness(String anyMajorIllness) {
		this.anyMajorIllness = anyMajorIllness;
	}

	public String getContactPersonInCaseOfEmergency() {
		return contactPersonInCaseOfEmergency;
	}

	public void setContactPersonInCaseOfEmergency(String contactPersonInCaseOfEmergency) {
		this.contactPersonInCaseOfEmergency = contactPersonInCaseOfEmergency;
	}

	public String getEmergencyAddress() {
		return emergencyAddress;
	}

	public void setEmergencyAddress(String emergencyAddress) {
		this.emergencyAddress = emergencyAddress;
	}

	public String getEmergencyNumber() {
		return emergencyNumber;
	}

	public void setEmergencyNumber(String emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
