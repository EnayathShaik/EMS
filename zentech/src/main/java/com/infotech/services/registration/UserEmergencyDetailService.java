package com.infotech.services.registration;

import org.springframework.stereotype.Component;

import com.infotech.model.UserEmergencyDetailModel;

@Component
public interface UserEmergencyDetailService {

	public void addEmergencyDetail(UserEmergencyDetailModel userEmergencyDetails);
	public UserEmergencyDetailModel getUserEmergencyDetailsByUserID(Long userID);	
	public UserEmergencyDetailModel getUserEmergencyDetails(Long userEmergencyDetailID);
	public void deleteEducationDetails(UserEmergencyDetailModel userEmergencyDetail);
}