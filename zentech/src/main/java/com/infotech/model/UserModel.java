package com.infotech.model;



import java.util.Date;

public class UserModel{

	private Long userID;


	private String userName;


	private String password;


	private String employeeFatherName;


	private Date dateOfJoining;


	private String designation;


	private String address;


	public Long getUserID() {
		return userID;
	}


	public void setUserID(Long userID) {
		this.userID = userID;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmployeeFatherName() {
		return employeeFatherName;
	}


	public void setEmployeeFatherName(String employeeFatherName) {
		this.employeeFatherName = employeeFatherName;
	}


	public Date getDateOfJoining() {
		return dateOfJoining;
	}


	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "UserModel [userID=" + userID + ", userName=" + userName
				+ ", password=" + password + ", employeeFatherName="
				+ employeeFatherName + ", dateOfJoining=" + dateOfJoining
				+ ", designation=" + designation + ", address=" + address + "]";
	}
	
	
	
}
