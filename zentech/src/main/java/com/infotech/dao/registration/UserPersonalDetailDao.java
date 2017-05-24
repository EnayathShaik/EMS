package com.infotech.dao.registration;

import com.infotech.entity.User;
import com.infotech.entity.UserAdditionalDetails;
import com.infotech.entity.UserPersonalDetail;

public interface UserPersonalDetailDao{
	
	public void addUserPersonalDetail(UserPersonalDetail userPersonalDetail);
	public UserPersonalDetail getUserPersonalDetailByUserID(Long userID);	
	public UserPersonalDetail getUserPersonalDetail(Long userPersonalDetailID);
	public void deleteUserPersonalDetail(UserPersonalDetail personalDetail);
	public User getUserDetailsById(long id);
	public User addUserDetail(User user);
	public void addUserAdditionalDetail(UserAdditionalDetails userAdditionalDetails);
}

