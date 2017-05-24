package com.infotech.entity;

import java.math.BigDecimal;

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
@Table(name = "ZE_USER_EDUCATION_DETAIL")
public class EducationQualificationDetail extends CommonEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8482691841353448197L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ZE_USER_EDUCATION_DETAIL_ID", length = 10)
	private Long userEducationDetailID;

	@Column(name = "QUALIFICATION", length = 60)
	private String qualification;

	@Column(name = "UNIVERSITY", length = 100)
	private String university;

	@Column(name = "YEAR_OF_PASS", length = 20)
	private String yearOfPass;

	@Column(name = "MARKS", length = 4)
	private BigDecimal marksInPercentage;

	@Column(name = "MAJOR_SUBJECT", length = 50)
	private String majorSubject;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ZE_USER_ID", nullable = false, referencedColumnName = "ZE_USER_ID")	
	private User userID;

	public Long getUserEducationDetailID() {
		return userEducationDetailID;
	}

	public void setUserEducationDetailID(Long userEducationDetailID) {
		this.userEducationDetailID = userEducationDetailID;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getYearOfPass() {
		return yearOfPass;
	}

	public void setYearOfPass(String yearOfPass) {
		this.yearOfPass = yearOfPass;
	}

	public BigDecimal getMarksInPercentage() {
		return marksInPercentage;
	}

	public void setMarksInPercentage(BigDecimal marksInPercentage) {
		this.marksInPercentage = marksInPercentage;
	}

	public String getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(String majorSubject) {
		this.majorSubject = majorSubject;
	}

	public User getUserID() {
		return userID;
	}

	public void setUserID(User userID) {
		this.userID = userID;
	}
	
}
