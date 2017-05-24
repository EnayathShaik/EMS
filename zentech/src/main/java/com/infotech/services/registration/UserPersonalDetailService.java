package com.infotech.services.registration;

import org.springframework.stereotype.Component;

import com.infotech.entity.User;
import com.infotech.model.UserAdditionalDetailModel;
import com.infotech.model.UserModel;
import com.infotech.model.UserPersonalDetailModel;

@Component
public interface UserPersonalDetailService {

	public void addUserPersonalDetail(UserPersonalDetailModel userPersonalDetail);

	public UserPersonalDetailModel getUserPersonalDetailByUserID(Long userID);

	public UserPersonalDetailModel getUserPersonalDetail(Long userPersonalDetailID);

	public void deleteUserPersonalDetail(UserPersonalDetailModel personalDetail);
	
	public User getUserDetailsById(long id);
	
	public UserModel addUserDetail(UserModel user);
	public void addUserAdditionalDetail(UserAdditionalDetailModel userAdditionalDetailModel);
}