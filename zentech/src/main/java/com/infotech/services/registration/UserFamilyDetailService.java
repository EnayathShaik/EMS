package com.infotech.services.registration;

import java.util.List;

import org.springframework.stereotype.Component;

import com.infotech.model.FamilyDetailModel;

@Component
public interface UserFamilyDetailService {

	public void addFamilyDetail(List<FamilyDetailModel> familyDetail);
	public List<FamilyDetailModel> getFamilyDetailByUserID(Long userID);	
	public FamilyDetailModel getFamilyDetail(Long userFamilyDetailID);
	public void deleteUserFamilyDetail(FamilyDetailModel familyDetail);
}