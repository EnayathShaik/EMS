package com.infotech.model;

import java.io.Serializable;

public class FamilyDetailModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8402292083489633675L;
	private Long userFamilyDetailID;
	private String memberName;
	private Integer age;
	private String sex;
	private String relation;
	private String occupation;
	private Long userID;

	
	
	public Long getUserFamilyDetailID() {
		return userFamilyDetailID;
	}

	public void setUserFamilyDetailID(Long userFamilyDetailID) {
		this.userFamilyDetailID = userFamilyDetailID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
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
