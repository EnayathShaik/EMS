package com.infotech.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ZE_USER")
public class User extends CommonEntity {

	/**
	 */
	private static final long serialVersionUID = -3877542829809286711L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ZE_USER_ID", length = 10)
	private Long userID;

	@Column(name = "USERNAME", length = 60)
	private String userName;

	@Column(name = "PASSWORD", length = 60)
	private String password;

	@Column(name = "FATHER_NAME", length = 60)
	private String employeeFatherName;

	@Column(name = "DATE_OF_JOIN")
	private Date dateOfJoining;

	@Column(name = "DESIGNATION")
	private String designation;

	@Column(name = "ADDRESS")
	private String address;

	@OneToMany(mappedBy = "userID", cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
	private List<UserPersonalDetail> userPersonalDetails;

	@OneToMany(mappedBy = "userID", cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
	private List<FamilyDetail> familyDetails;

	@OneToMany(mappedBy = "userID", cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
	private List<EducationQualificationDetail> educationQualificationDetail;

	@OneToMany(mappedBy = "userID", cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
	private List<UserExperienceDetail> userExperienceDetail;

	@OneToMany(mappedBy = "userID", cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
	private List<UserEmergencyDetail> userEmergencyDetail;

	@OneToMany(mappedBy = "userID", cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
	private List<UserLastCompanyDetail> lastCompanyDetail;

	@OneToMany(mappedBy = "userID", cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
	private List<UserAdditionalDetails> userAdditionalDetail;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public List<UserPersonalDetail> getUserPersonalDetails() {
		return userPersonalDetails;
	}

	public void setUserPersonalDetails(List<UserPersonalDetail> userPersonalDetails) {
		this.userPersonalDetails = userPersonalDetails;
	}

	public List<FamilyDetail> getFamilyDetails() {
		return familyDetails;
	}

	public void setFamilyDetails(List<FamilyDetail> familyDetails) {
		this.familyDetails = familyDetails;
	}

	public List<EducationQualificationDetail> getEducationQualificationDetail() {
		return educationQualificationDetail;
	}

	public void setEducationQualificationDetail(List<EducationQualificationDetail> educationQualificationDetail) {
		this.educationQualificationDetail = educationQualificationDetail;
	}

	public List<UserExperienceDetail> getUserExperienceDetail() {
		return userExperienceDetail;
	}

	public void setUserExperienceDetail(List<UserExperienceDetail> userExperienceDetail) {
		this.userExperienceDetail = userExperienceDetail;
	}

	public List<UserEmergencyDetail> getUserEmergencyDetail() {
		return userEmergencyDetail;
	}

	public void setUserEmergencyDetail(List<UserEmergencyDetail> userEmergencyDetail) {
		this.userEmergencyDetail = userEmergencyDetail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getEmployeeFatherName() {
		return employeeFatherName;
	}

	public void setEmployeeFatherName(String employeeFatherName) {
		this.employeeFatherName = employeeFatherName;
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

	public List<UserLastCompanyDetail> getLastCompanyDetail() {
		return lastCompanyDetail;
	}

	public void setLastCompanyDetail(List<UserLastCompanyDetail> lastCompanyDetail) {
		this.lastCompanyDetail = lastCompanyDetail;
	}

	public List<UserAdditionalDetails> getUserAdditionalDetail() {
		return userAdditionalDetail;
	}

	public void setUserAdditionalDetail(
			List<UserAdditionalDetails> userAdditionalDetail) {
		this.userAdditionalDetail = userAdditionalDetail;
	}
	

}
