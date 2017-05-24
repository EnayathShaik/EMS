package com.infotech.entity;

import java.math.BigDecimal;
import java.util.Date;

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
@Table(name = "ZE_EXPERIENCE_DETAIL")
public class UserExperienceDetail extends CommonEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7603580083176687525L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ZE_EXPERIENCE_DETAIL_ID", length = 10)
	private Long userExperianceDetailID;

	@Column(name = "ORGANIZATION", length = 100)
	private String oganization;

	@Column(name = "JOIN_FROM")
	private Date joinFrom;

	@Column(name = "JOIN_TO")
	private Date joinTo;

	@Column(name = "DESIGNATION_START", length = 20)
	private String designationStart;

	@Column(name = "DESIGNATION_END", length = 20)
	private String designationEnd;

	@Column(name = "JOB_RESPONSIBILITY", length = 60)
	private String jobResponsibility;

	@Column(name = "DESIGNATION_OF_IMMEDIATE_SUPERIOR")
	private String designationOfImmediateSuperior;

	@Column(name = "GROSS_SALARY_DRAWN", length = 20)
	private BigDecimal grossSalaryDrawn;

	@Column(name = "REASON_FOR_LEAVING", length = 250)
	private String reasonForLeaving;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ZE_USER_ID", nullable = false, referencedColumnName = "ZE_USER_ID")
	private User userID;

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
