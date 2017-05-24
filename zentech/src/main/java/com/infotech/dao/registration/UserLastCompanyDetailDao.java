package com.infotech.dao.registration;

import java.util.List;

import com.infotech.entity.UserLastCompanyDetail;

public interface UserLastCompanyDetailDao{
	
	public void addUserLastCompanyDetail(UserLastCompanyDetail lastCompanyDetail);
	public List<UserLastCompanyDetail> getUserLastCompanyDetailByUserID(Long userID);	
	public UserLastCompanyDetail getUserLastCompanyDetail(Long userLastCompanyDetailID);
	public void deleteUserLastCompanyDetail(UserLastCompanyDetail familyDetail);
		
}

