package com.infotech.services.registration;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.dao.registration.UserLastCompanyDetailDao;
import com.infotech.dao.registration.UserPersonalDetailDao;
import com.infotech.entity.User;
import com.infotech.entity.UserLastCompanyDetail;
import com.infotech.model.UserLastCompanyDetailModel;

@Service("lastCompanyDetailsService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class LastCompanyDetailsServiceImpl implements LastCompanyDetailsService {

	@Autowired
	private UserLastCompanyDetailDao userLastCompanyDetailDao;
	@Autowired
	private UserPersonalDetailDao userPersonalDetailDao;
	public void addUserLastCompanyDetail(UserLastCompanyDetailModel lastCompanyDetail) {
		UserLastCompanyDetail companyDetail = new UserLastCompanyDetail();
		BeanUtils.copyProperties(lastCompanyDetail, companyDetail);
		User user = userPersonalDetailDao.getUserDetailsById(lastCompanyDetail.getUserID());
		companyDetail.setUserID(user);
		userLastCompanyDetailDao.addUserLastCompanyDetail(companyDetail);

	}

	public UserLastCompanyDetailModel getUserLastCompanyDetailByUserID(Long userID) {
		
		UserLastCompanyDetail companyDetail = new UserLastCompanyDetail();
		companyDetail = (UserLastCompanyDetail) userLastCompanyDetailDao.getUserLastCompanyDetailByUserID(userID);
		UserLastCompanyDetailModel model = new UserLastCompanyDetailModel();
		BeanUtils.copyProperties(companyDetail, model);
		return model;
	}

	public UserLastCompanyDetailModel getUserLastCompanyDetail(Long userLastCompanyDetailID) {
		
		UserLastCompanyDetail companyDetail = new UserLastCompanyDetail();
		companyDetail = (UserLastCompanyDetail) userLastCompanyDetailDao.getUserLastCompanyDetail(userLastCompanyDetailID);
		UserLastCompanyDetailModel model = new UserLastCompanyDetailModel();
		BeanUtils.copyProperties(companyDetail, model);
		return model;
	}

	public void deleteUserLastCompanyDetail(UserLastCompanyDetailModel familyDetail) {

	}

}
