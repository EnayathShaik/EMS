package com.infotech.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;

public class CommonEntity implements Serializable {
	
	private static final long serialVersionUID = -8526728113709120846L;

	@Column(name = "CR_UID")
	private Long createdById;
	
	@Column(name = "CR_DT")
	private Timestamp createdDate;
	
	@Column(name = "UPD_UID")
	private Long modifiedById;

	@Column(name = "UPD_DT")
	private Timestamp modifiedDate;

	public Long getCreatedById() {
		return createdById;
	}

	public void setCreatedById(Long createdById) {
		this.createdById = createdById;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Long getModifiedById() {
		return modifiedById;
	}

	public void setModifiedById(Long modifiedById) {
		this.modifiedById = modifiedById;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
