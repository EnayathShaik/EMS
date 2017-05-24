package com.infotech.services.registration;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.dao.registration.UserPersonalDetailDao;
import com.infotech.entity.User;
import com.infotech.entity.UserAdditionalDetails;
import com.infotech.entity.UserPersonalDetail;
import com.infotech.model.UserAdditionalDetailModel;
import com.infotech.model.UserModel;
import com.infotech.model.UserPersonalDetailModel;

@Service("userPersonalDetailService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserPersonalDetailServiceImpl implements UserPersonalDetailService {

	@Autowired
	private UserPersonalDetailDao userPersonalDetailDao;

	public void addUserPersonalDetail(UserPersonalDetailModel userPersonalDetail) {
		System.out.println("inside adduserpersonaldetail...");
		UserPersonalDetail detail = new UserPersonalDetail();
		BeanUtils.copyProperties(userPersonalDetail, detail);
		User user = getUserDetailsById(userPersonalDetail.getUserID());
		detail.setUserID(user);
		userPersonalDetailDao.addUserPersonalDetail(detail);
	}

	public UserPersonalDetailModel getUserPersonalDetailByUserID(Long userID) {

		UserPersonalDetail personalDetail = new UserPersonalDetail();
		UserPersonalDetailModel detailModel = new UserPersonalDetailModel();
		personalDetail = userPersonalDetailDao.getUserPersonalDetailByUserID(userID);
		if(personalDetail != null)
			BeanUtils.copyProperties(personalDetail, detailModel);
		return detailModel;
	}

	public UserPersonalDetailModel getUserPersonalDetail(Long userPersonalDetailID) {

		UserPersonalDetail userPersonalDetail = new UserPersonalDetail();
		userPersonalDetail = userPersonalDetailDao.getUserPersonalDetail(userPersonalDetailID);
		UserPersonalDetailModel detailModel = new UserPersonalDetailModel();
		BeanUtils.copyProperties(userPersonalDetail, detailModel);
		return detailModel;
	}

	public void deleteUserPersonalDetail(UserPersonalDetailModel personalDetail) {
		// TODO Auto-generated method stub

	}

	public User getUserDetailsById(long id) {
		return userPersonalDetailDao.getUserDetailsById(id);
	}

	public UserModel addUserDetail(UserModel userModel) {
		System.out.println("inside adduserpersonaldetail...");
		User user = new User();
		BeanUtils.copyProperties(userModel, user);
		userPersonalDetailDao.addUserDetail(user);
		userModel.setUserID(user.getUserID());
		return userModel;
	}

	public void addUserAdditionalDetail(UserAdditionalDetailModel userAdditionalDetail) {
		System.out.println("inside adduserpersonaldetail...");
		UserAdditionalDetails detail = new UserAdditionalDetails();
		BeanUtils.copyProperties(userAdditionalDetail, detail);
		User user = getUserDetailsById(userAdditionalDetail.getUserID());
		detail.setUserID(user);
		userPersonalDetailDao.addUserAdditionalDetail(detail);
		
	}

}
