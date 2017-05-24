package com.infotech.services.registration;

import java.util.List;

import org.springframework.stereotype.Component;

import com.infotech.model.UserExperienceDetailModel;

@Component
public interface UserExperienceDetailService {

	public void addUserExperienceDetails(List<UserExperienceDetailModel> userExperienceDetail);

	public List<UserExperienceDetailModel> getUserExperienceDetailByUserID(Long userID);

	public UserExperienceDetailModel getUserExperienceDetail(Long userExperianceDetailID);

	public void deleteUserExperienceDetail(UserExperienceDetailModel userExperienceDetail);
	
}