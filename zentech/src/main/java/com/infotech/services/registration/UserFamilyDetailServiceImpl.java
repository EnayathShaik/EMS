package com.infotech.services.registration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.dao.registration.UserFamilyDetailDao;
import com.infotech.dao.registration.UserPersonalDetailDao;
import com.infotech.entity.FamilyDetail;
import com.infotech.entity.User;
import com.infotech.model.FamilyDetailModel;

@Service("userFamilyDetailService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserFamilyDetailServiceImpl implements UserFamilyDetailService {

	@Autowired
	private UserFamilyDetailDao userFamilyDetailDao;
    @Autowired 
    private UserPersonalDetailDao userPersonalDetailDao;
	
	public void addFamilyDetail(List<FamilyDetailModel> familyDetail) {

		for (FamilyDetailModel model : familyDetail) {
			model.setUserID((long)1);
			FamilyDetail detail = new FamilyDetail();
			BeanUtils.copyProperties(model, detail);
			User user = userPersonalDetailDao.getUserDetailsById(model.getUserID());
			detail.setUserID(user);
			userFamilyDetailDao.addFamilyDetail(detail);
		}

	}

	public List<FamilyDetailModel> getFamilyDetailByUserID(Long userID) {

		List<FamilyDetail> familyDetails = new ArrayList<FamilyDetail>();
		familyDetails = userFamilyDetailDao.getFamilyDetailByUserID(userID);
		List<FamilyDetailModel> modelList = new ArrayList<FamilyDetailModel>();
		for (FamilyDetail model : familyDetails) {
			FamilyDetailModel detailModel = new FamilyDetailModel();
			BeanUtils.copyProperties(model, detailModel);
			modelList.add(detailModel);
		}
		return modelList;
	}

	public FamilyDetailModel getFamilyDetail(Long userFamilyDetailID) {

		FamilyDetail familyDetails = new FamilyDetail();
		familyDetails = userFamilyDetailDao.getFamilyDetail(userFamilyDetailID);
		FamilyDetailModel detailModel = new FamilyDetailModel();
		BeanUtils.copyProperties(familyDetails, detailModel);
		return detailModel;
	}

	public void deleteUserFamilyDetail(FamilyDetailModel familyDetail) {

	}

}
