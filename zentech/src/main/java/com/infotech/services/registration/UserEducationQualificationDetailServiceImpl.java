package com.infotech.services.registration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.dao.registration.EducationQualificationDetailDao;
import com.infotech.dao.registration.UserPersonalDetailDao;
import com.infotech.entity.EducationQualificationDetail;
import com.infotech.entity.User;
import com.infotech.model.EducationQualificationDetailModel;

@Service("userEducationQualificationDetailService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserEducationQualificationDetailServiceImpl implements UserEducationQualificationDetailService {

	@Autowired
	private EducationQualificationDetailDao educationQualificationDetailDao;
	@Autowired
	private UserPersonalDetailDao userPersonalDetailDao;
	public void addEducationDetails(List<EducationQualificationDetailModel> qualificationDetails) {

		for (EducationQualificationDetailModel model : qualificationDetails) {
			EducationQualificationDetail qualificationDetail = new EducationQualificationDetail();
			BeanUtils.copyProperties(model, qualificationDetail);
			User user = userPersonalDetailDao.getUserDetailsById(model.getUserID());
			qualificationDetail.setUserID(user);
			educationQualificationDetailDao.addEducationDetails(qualificationDetail);
		}
	}

	public List<EducationQualificationDetailModel> getEducationDetailsListByUserID(Long userID) {

		List<EducationQualificationDetail> qualificationDetails = new ArrayList<EducationQualificationDetail>();
		qualificationDetails = educationQualificationDetailDao.getEducationDetailsListByUserID(userID);
		List<EducationQualificationDetailModel> modelList = new ArrayList<EducationQualificationDetailModel>();
		for (EducationQualificationDetail model : qualificationDetails) {
			EducationQualificationDetailModel detailModel = new EducationQualificationDetailModel();
			BeanUtils.copyProperties(model, detailModel);
			modelList.add(detailModel);
		}
		return modelList;
	}

	public EducationQualificationDetailModel getEducationDetail(Long userEducationDetailID) {
		
		EducationQualificationDetail qualificationDetails = new EducationQualificationDetail();
		qualificationDetails = educationQualificationDetailDao.getEducationDetail(userEducationDetailID);
		EducationQualificationDetailModel detailModel = new EducationQualificationDetailModel();
		BeanUtils.copyProperties(qualificationDetails, detailModel);
		return detailModel;
	}

	public void deleteEducationDetails(EducationQualificationDetailModel qualificationDetails) {
		// TODO Auto-generated method stub

	}

}
