package com.infotech.model;

import java.util.List;

public class CommonFormBean {
	private List<FamilyDetailModel> listFamilyModel;
	private List<EducationQualificationDetailModel> listEducationModel;
	private List<UserExperienceDetailModel> listExperienceModel;
	
	public List<FamilyDetailModel> getListFamilyModel() {
		return listFamilyModel;
	}

	public void setListFamilyModel(List<FamilyDetailModel> listFamilyModel) {
		this.listFamilyModel = listFamilyModel;
	}

	public List<EducationQualificationDetailModel> getListEducationModel() {
		return listEducationModel;
	}

	public void setListEducationModel(
			List<EducationQualificationDetailModel> listEducationModel) {
		this.listEducationModel = listEducationModel;
	}
	

	public List<UserExperienceDetailModel> getListExperienceModel() {
		return listExperienceModel;
	}

	public void setListExperienceModel(
			List<UserExperienceDetailModel> listExperienceModel) {
		this.listExperienceModel = listExperienceModel;
	}

	@Override
	public String toString() {
		return "CommonFormBean [listFamilyModel=" + listFamilyModel
				+ ", listEducationModel=" + listEducationModel
				+ ", listExperienceModel=" + listExperienceModel + "]";
	}	
	
}
