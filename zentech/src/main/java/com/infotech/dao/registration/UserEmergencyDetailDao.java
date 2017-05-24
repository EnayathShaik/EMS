package com.infotech.dao.registration;

import com.infotech.entity.UserEmergencyDetail;

public interface UserEmergencyDetailDao{
	
	public void addEmergencyDetail(UserEmergencyDetail userEmergencyDetails);
	public UserEmergencyDetail getUserEmergencyDetailsByUserID(Long userID);	
	public UserEmergencyDetail getUserEmergencyDetails(Long userEmergencyDetailID);
	public void deleteEducationDetails(UserEmergencyDetail userEmergencyDetail);
		
}

