package com.infotech.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class EducationQualificationDetailModel implements Serializable {
	
	private static final long serialVersionUID = 23103686517409925L;
	private Long userEducationDetailID;
	private String qualification;
	private String university;
	private String yearOfPass;
	private BigDecimal marksInPercentage;
	private String majorSubject;
	private Long userID;

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
