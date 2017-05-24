package com.infotech.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserExperienceDetailModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3250551504347261707L;
	private Long userExperianceDetailID;
	private String oganization;
	private Date joinFrom;
	private Date joinTo;
	private String designationStart;
	private String designationEnd;
	private String jobResponsibility;
	private String designationOfImmediateSuperior;
	private BigDecimal grossSalaryDrawn;
	private String reasonForLeaving;
	private Long userID;

	public Long getUserExperianceDetailID() {
		return userExperianceDetailID;
	}

	public void setUserExperianceDetailID(Long userExperianceDetailID) {
		this.userExperianceDetailID = userExperianceDetailID;
	}

	public String getOganization() {
		return oganization;
	}

	public void setOganization(String oganization) {
		this.oganization = oganization;
	}

	public Date getJoinFrom() {
		return joinFrom;
	}

	public void setJoinFrom(Date joinFrom) {
		this.joinFrom = joinFrom;
	}

	public Date getJoinTo() {
		return joinTo;
	}

	public void setJoinTo(Date joinTo) {
		this.joinTo = joinTo;
	}

	public String getDesignationStart() {
		return designationStart;
	}

	public void setDesignationStart(String designationStart) {
		this.designationStart = designationStart;
	}

	public String getDesignationEnd() {
		return designationEnd;
	}

	public void setDesignationEnd(String designationEnd) {
		this.designationEnd = designationEnd;
	}

	public String getJobResponsibility() {
		return jobResponsibility;
	}

	public void setJobResponsibility(String jobResponsibility) {
		this.jobResponsibility = jobResponsibility;
	}

	public String getDesignationOfImmediateSuperior() {
		return designationOfImmediateSuperior;
	}

	public void setDesignationOfImmediateSuperior(String designationOfImmediateSuperior) {
		this.designationOfImmediateSuperior = designationOfImmediateSuperior;
	}

	public BigDecimal getGrossSalaryDrawn() {
		return grossSalaryDrawn;
	}

	public void setGrossSalaryDrawn(BigDecimal grossSalaryDrawn) {
		this.grossSalaryDrawn = grossSalaryDrawn;
	}

	public String getReasonForLeaving() {
		return reasonForLeaving;
	}

	public void setReasonForLeaving(String reasonForLeaving) {
		this.reasonForLeaving = reasonForLeaving;
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
