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
@Table(name = "ZE_LAST_COMPANY_DETAIL")
public class UserLastCompanyDetail extends CommonEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7603580083176687525L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ZE_EXPERIENCE_DETAIL_ID", length = 10)
	private Long userLastCompanyDetailID;

	@Column(name = "REPORTING_TO", length = 100)
	private String reportingName;

	@Column(name = "DESIGNATION")
	private String designation;

	@Column(name = "GROSS_SALARY")
	private BigDecimal grossSalary;

	@Column(name = "CASH_BASIC")
	private BigDecimal cashBasic;

	@Column(name = "CASH_DA")
	private BigDecimal cashDA;

	@Column(name = "CASH_HRA")
	private BigDecimal cashHRA;

	@Column(name = "CASH_LTA")
	private BigDecimal cashLTA;

	@Column(name = "CASH_MEDICAL")
	private BigDecimal cashMedical;

	@Column(name = "CASH_CONVEYANCE")
	private BigDecimal cashConveyance;

	@Column(name = "CASH_OTHER")
	private BigDecimal cashOther;

	@Column(name = "CASH_TOTAL")
	private BigDecimal cashTotal;

	@Column(name = "NON_CASH_PF")
	private BigDecimal nonCashPF;

	@Column(name = "NON_CASH_SF")
	private BigDecimal nonCashSF;

	@Column(name = "NON_CASH_GRATUITY")
	private BigDecimal nonCashGratuity;

	@Column(name = "NON_CASH_OTHER")
	private BigDecimal nonCashOther;

	@Column(name = "NON_CASH_TOTAL")
	private BigDecimal nonCashTotal;

	@Column(name = "REFERENCE_NAME1", length = 100)
	private String referenceName1;

	@Column(name = "REFERENCE_NAME2", length = 100)
	private String referenceName2;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ZE_USER_ID", nullable = false, referencedColumnName = "ZE_USER_ID")
	private User userID;

	

	public Long getUserLastCompanyDetailID() {
		return userLastCompanyDetailID;
	}

	public void setUserLastCompanyDetailID(Long userLastCompanyDetailID) {
		this.userLastCompanyDetailID = userLastCompanyDetailID;
	}

	public String getReportingName() {
		return reportingName;
	}

	public void setReportingName(String reportingName) {
		this.reportingName = reportingName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(BigDecimal grossSalary) {
		this.grossSalary = grossSalary;
	}

	public BigDecimal getCashBasic() {
		return cashBasic;
	}

	public void setCashBasic(BigDecimal cashBasic) {
		this.cashBasic = cashBasic;
	}

	public BigDecimal getCashDA() {
		return cashDA;
	}

	public void setCashDA(BigDecimal cashDA) {
		this.cashDA = cashDA;
	}

	public BigDecimal getCashHRA() {
		return cashHRA;
	}

	public void setCashHRA(BigDecimal cashHRA) {
		this.cashHRA = cashHRA;
	}

	public BigDecimal getCashLTA() {
		return cashLTA;
	}

	public void setCashLTA(BigDecimal cashLTA) {
		this.cashLTA = cashLTA;
	}

	public BigDecimal getCashMedical() {
		return cashMedical;
	}

	public void setCashMedical(BigDecimal cashMedical) {
		this.cashMedical = cashMedical;
	}

	public BigDecimal getCashConveyance() {
		return cashConveyance;
	}

	public void setCashConveyance(BigDecimal cashConveyance) {
		this.cashConveyance = cashConveyance;
	}

	public BigDecimal getCashOther() {
		return cashOther;
	}

	public void setCashOther(BigDecimal cashOther) {
		this.cashOther = cashOther;
	}

	public BigDecimal getCashTotal() {
		return cashTotal;
	}

	public void setCashTotal(BigDecimal cashTotal) {
		this.cashTotal = cashTotal;
	}

	public BigDecimal getNonCashPF() {
		return nonCashPF;
	}

	public void setNonCashPF(BigDecimal nonCashPF) {
		this.nonCashPF = nonCashPF;
	}

	public BigDecimal getNonCashSF() {
		return nonCashSF;
	}

	public void setNonCashSF(BigDecimal nonCashSF) {
		this.nonCashSF = nonCashSF;
	}

	public BigDecimal getNonCashGratuity() {
		return nonCashGratuity;
	}

	public void setNonCashGratuity(BigDecimal nonCashGratuity) {
		this.nonCashGratuity = nonCashGratuity;
	}

	public BigDecimal getNonCashOther() {
		return nonCashOther;
	}

	public void setNonCashOther(BigDecimal nonCashOther) {
		this.nonCashOther = nonCashOther;
	}

	public BigDecimal getNonCashTotal() {
		return nonCashTotal;
	}

	public void setNonCashTotal(BigDecimal nonCashTotal) {
		this.nonCashTotal = nonCashTotal;
	}

	public String getReferenceName1() {
		return referenceName1;
	}

	public void setReferenceName1(String referenceName1) {
		this.referenceName1 = referenceName1;
	}

	public String getReferenceName2() {
		return referenceName2;
	}

	public void setReferenceName2(String referenceName2) {
		this.referenceName2 = referenceName2;
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
