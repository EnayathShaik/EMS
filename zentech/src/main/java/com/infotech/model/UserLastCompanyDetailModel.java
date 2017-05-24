package com.infotech.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class UserLastCompanyDetailModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7603580083176687525L;
	private Long userLastCompanyDetailID;
	private String reportingName;
	private String designation;
	private BigDecimal grossSalary;
	private BigDecimal cashBasic;
	private BigDecimal cashDA;
	private BigDecimal cashHRA;
	private BigDecimal cashLTA;
	private BigDecimal cashMedical;
	private BigDecimal cashConveyance;
	private BigDecimal cashOther;
	private BigDecimal cashTotal;
	private BigDecimal nonCashPF;
	private BigDecimal nonCashSF;
	private BigDecimal nonCashGratuity;
	private BigDecimal nonCashOther;
	private BigDecimal nonCashTotal;
	private String referenceName1;
	private String referenceName2;
	private Long userID;

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
