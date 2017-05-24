package com.infotech.entity;

import java.io.Serializable;

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
@Table(name = "ZE_USER_ADDITIONAL_DETAIL")
public class UserAdditionalDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3122377695910373927L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ZE_USER_ADDITIONAL_DETAIL_ID", length = 10)
	private Long userAdditionalDetailID;
	
	@Column(name = "LANGUAGE_KNOW", length = 100)
	private String languageKnow;

	@Column(name = "HOBBIES")
	private String hobbies;

	@Column(name = "INTEREST")
	private String interest;

	@Column(name = "INTERNAL_EMPLOYEE_KNOW", length = 1)
	private String employeeKnow;

	@Column(name = "INTERNAL_EMPLOYEE_NAME")
	private String employeeName;

	@Column(name = "INSTITUTION_MEMBERSHIP", length = 100)
	private String institutionMembership;

	@Column(name = "SPECIALIZED_TRANING")
	private String specializedTraining;

	@Column(name = "ANY_OTHER_INFO_SUGGESTION")
	private String otherInfoSuggestion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ZE_USER_ID", nullable = false, referencedColumnName = "ZE_USER_ID")
	private User userID;
	
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
		return interest;
	}

	public void setInterest(String interest) {
		interest = interest;
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

	public Long getUserAdditionalDetailID() {
		return userAdditionalDetailID;
	}

	public void setUserAdditionalDetailID(Long userAdditionalDetailID) {
		this.userAdditionalDetailID = userAdditionalDetailID;
	}

	public User getUserID() {
		return userID;
	}

	public void setUserID(User userID) {
		this.userID = userID;
	}

	
}
