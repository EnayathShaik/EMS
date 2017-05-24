package com.infotech.services.registration;

import java.util.List;

import org.springframework.stereotype.Component;

import com.infotech.model.EducationQualificationDetailModel;

@Component
public interface UserEducationQualificationDetailService {

	public void addEducationDetails(List<EducationQualificationDetailModel> qualificationDetails);
	public List<EducationQualificationDetailModel> getEducationDetailsListByUserID(Long userID);
	
	public EducationQualificationDetailModel getEducationDetail(Long userEducationDetailID);
	public void deleteEducationDetails(EducationQualificationDetailModel qualificationDetails);
}