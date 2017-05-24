package com.infotech.dao.registration;

import java.util.List;

import com.infotech.entity.EducationQualificationDetail;

public interface EducationQualificationDetailDao{
	
	public void addEducationDetails(EducationQualificationDetail qualificationDetails);
	public List<EducationQualificationDetail> getEducationDetailsListByUserID(Long userID);
	
	public EducationQualificationDetail getEducationDetail(Long userEducationDetailID);
	public void deleteEducationDetails(EducationQualificationDetail qualificationDetails);
		
}

