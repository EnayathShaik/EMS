package com.infotech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ZE_EMERGENCY_DETAIL")
public class UserEmergencyDetail extends CommonEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7603580083176687525L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ZE_EMERGENCY_DETAIL_ID", length = 10)
	private Long userEmergencyDetailID;

	@Column(name = "BLOOD_GROUP", length = 10)
	private String bloodGroup;

	@Column(name = "ALLERGIC_TO")
	private String allergicTo;	

	@Column(name = "BLOOD_PRESSURE")
	private String bloodPressure;
	
	@Column(name = "EYE_SIGHT_RIGHT", length = 20)
	private String eyeSightRight;
	
	@Column(name = "EYE_SIGHT_LEFT", length = 20)
	private String eyeSightLeft;

	@Column(name = "ANY_MAJOR_ILLNESS", length = 200)
	private String anyMajorIllness;
	
	@Column(name = "EMERGENCY_CONTACT_PERSON", length = 60)
	private String contactPersonInCaseOfEmergency;
	
	@Column(name="EMERGENCY_ADDRESS" ,length=200)
	private String emergencyAddress;
	
	@Column(name = "EMERGENCY_CONTACT_NUMBER", length = 10)
	private String emergencyNumber;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ZE_USER_ID", nullable = false, referencedColumnName = "ZE_USER_ID")	
	private User userID;

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

	public User getUserID() {
		return userID;
	}

	public void setUserID(User userID) {
		this.userID = userID;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
