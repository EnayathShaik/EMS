package com.infotech.model;

import java.io.Serializable;
import java.math.BigDecimal;

import java.util.Date;

public class UserPersonalDetailModel implements Serializable {

	private static final long serialVersionUID = -2391100360413463536L;
	private Long userPersonalDetailID;
	private String userName;
	private Date dateOfBirth;
	private BigDecimal weight;
	private BigDecimal hight;
	private String postalAddress;
	private String permanentAddress;
	private BigDecimal contact;
	private String languageKnow;
	private String hobbies;
	private String Interest;
	private String employeeKnow;
	private String employeeName;
	private String institutionMembership;
	private String specializedTraining;
	private String otherInfoSuggestion;
	private Long userID;
	private String password;
	private String fatherName;
	private Date dateOfJoining;
	private String designation;
	private String address;

	public Long getUserPersonalDetailID() {
		return userPersonalDetailID;
	}

	public void setUserPersonalDetailID(Long userPersonalDetailID) {
		this.userPersonalDetailID = userPersonalDetailID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public BigDecimal getHight() {
		return hight;
	}

	public void setHight(BigDecimal hight) {
		this.hight = hight;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public BigDecimal getContact() {
		return contact;
	}

	public void setContact(BigDecimal contact) {
		this.contact = contact;
	}

	public String getLanguageKnow() {
		return languageKnow;
	}

	public void setLanguageKnow(String languageKnow) {
		this.languageKnow = languageKnow;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getInterest() {
		return Interest;
	}

	public void setInterest(String interest) {
		Interest = interest;
	}

	public String getEmployeeKnow() {
		return employeeKnow;
	}

	public void setEmployeeKnow(String employeeKnow) {
		this.employeeKnow = employeeKnow;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getInstitutionMembership() {
		return institutionMembership;
	}

	public void setInstitutionMembership(String institutionMembership) {
		this.institutionMembership = institutionMembership;
	}

	public String getSpecializedTraining() {
		return specializedTraining;
	}

	public void setSpecializedTraining(String specializedTraining) {
		this.specializedTraining = specializedTraining;
	}

	public String getOtherInfoSuggestion() {
		return otherInfoSuggestion;
	}

	public void setOtherInfoSuggestion(String otherInfoSuggestion) {
		this.otherInfoSuggestion = otherInfoSuggestion;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserPersonalDetailModel [userPersonalDetailID="
				+ userPersonalDetailID + ", userName=" + userName
				+ ", dateOfBirth=" + dateOfBirth + ", weight=" + weight
				+ ", hight=" + hight + ", postalAddress=" + postalAddress
				+ ", permanentAddress=" + permanentAddress + ", contact="
				+ contact + ", languageKnow=" + languageKnow + ", hobbies="
				+ hobbies + ", Interest=" + Interest + ", employeeKnow="
				+ employeeKnow + ", employeeName=" + employeeName
				+ ", institutionMembership=" + institutionMembership
				+ ", specializedTraining=" + specializedTraining
				+ ", otherInfoSuggestion=" + otherInfoSuggestion + ", userID="
				+ userID + ", password=" + password + ", fatherName="
				+ fatherName + ", dateOfJoining=" + dateOfJoining
				+ ", designation=" + designation + ", address=" + address + "]";
	}
	
	
}
