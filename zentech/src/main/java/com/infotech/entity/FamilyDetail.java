package com.infotech.entity;

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
@Table(name = "ZE_USER_FAMILY_DETAIL")
public class FamilyDetail extends CommonEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6509007690646423812L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ZE_USER_FAMILY_DETAIL_ID", length = 10)
	private Long userFamilyDetailID;

	@Column(name = "MEMBERNAME", length = 60)
	private String memberName;

	@Column(name = "AGE", length = 100)
	private Integer age;

	@Column(name = "SEX", length = 20)
	private String sex;

	@Column(name = "RELATION", length = 1000)
	private String relation;

	@Column(name = "OCCUPATION", length = 12)
	private String occupation;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ZE_USER_ID", nullable = false, referencedColumnName = "ZE_USER_ID")	
	private User userID;

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

	public User getUserID() {
		return userID;
	}

	public void setUserID(User userID) {
		this.userID = userID;
	}

}
