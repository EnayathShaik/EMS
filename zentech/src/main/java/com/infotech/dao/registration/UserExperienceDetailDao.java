package com.infotech.dao.registration;

import java.util.List;

import com.infotech.entity.UserExperienceDetail;

public interface UserExperienceDetailDao{
	
	public void addUserExperienceDetails(UserExperienceDetail userExperienceDetail);
	public List<UserExperienceDetail> getUserExperienceDetailByUserID(Long userID);	
	public UserExperienceDetail getUserExperienceDetail(Long userExperianceDetailID);
	public void deleteUserExperienceDetail(UserExperienceDetail userExperienceDetail);
		
}

