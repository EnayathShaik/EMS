package com.infotech.model;

import javax.persistence.Column;

public class UserAdditionalDetailModel {

	private Long userAdditionalDetailID;
		
	private String languageKnow;

	private String hobbies;

	
	private String Interest;

	private String employeeKnow;

	private String employeeName;

	private String institutionMembership;

	private String specializedTraining;

	private String otherInfoSuggestion;

	private Long userID;
	public Long getUserAdditionalDetailID() {
		return userAdditionalDetailID;
	}

	public void setUserAdditionalDetailID(Long userAdditionalDetailID) {
		this.userAdditionalDetailID = userAdditionalDetailID;
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

	@Override
	public String toString() {
		return "UserAdditionalDetailModel [userAdditionalDetailID="
				+ userAdditionalDetailID + ", languageKnow=" + languageKnow
				+ ", hobbies=" + hobbies + ", Interest=" + Interest
				+ ", employeeKnow=" + employeeKnow + ", employeeName="
				+ employeeName + ", institutionMembership="
				+ institutionMembership + ", specializedTraining="
				+ specializedTraining + ", otherInfoSuggestion="
				+ otherInfoSuggestion + ", userID=" + userID + "]";
	}

	
	
	
}
