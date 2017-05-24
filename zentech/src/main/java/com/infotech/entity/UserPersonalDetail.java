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
@Table(name = "ZE_USER_PERSONAL_DETAIL")
public class UserPersonalDetail extends CommonEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3122377695910373927L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ZE_USER_PERSONAL_DETAIL_ID", length = 10)
	private Long userPersonalDetailID;

	@Column(name = "USER_FULL_NAME", length = 60)
	private String userName;

	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;

	@Column(name = "WEIGHT", length = 100)
	private BigDecimal weight;

	@Column(name = "HEIGHT", length = 100)
	private BigDecimal hight;

	@Column(name = "POSTAL_ADDRESS", length = 1000)
	private String postalAddress;

	@Column(name = "PERMANENT_ADDRESS", length = 1000)
	private String permanentAddress;

	@Column(name = "CONTACT", length = 12)
	private BigDecimal contact;

	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ZE_USER_ID", nullable = false, referencedColumnName = "ZE_USER_ID")
	private User userID;

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
