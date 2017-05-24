package com.infotech.services.registration;

import org.springframework.stereotype.Component;

import com.infotech.model.UserLastCompanyDetailModel;

@Component
public interface LastCompanyDetailsService {

	public void addUserLastCompanyDetail(UserLastCompanyDetailModel lastCompanyDetail);

	public UserLastCompanyDetailModel getUserLastCompanyDetailByUserID(Long userID);

	public UserLastCompanyDetailModel getUserLastCompanyDetail(Long userLastCompanyDetailID);

	public void deleteUserLastCompanyDetail(UserLastCompanyDetailModel familyDetail);
}