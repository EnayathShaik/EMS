package com.infotech.dao.registration;

import java.util.List;

import com.infotech.entity.FamilyDetail;

public interface UserFamilyDetailDao{

	public void addFamilyDetail(FamilyDetail familyDetail);
	public List<FamilyDetail> getFamilyDetailByUserID(Long userID);	
	public FamilyDetail getFamilyDetail(Long userFamilyDetailID);
	public void deleteUserFamilyDetail(FamilyDetail familyDetail);
		
}

