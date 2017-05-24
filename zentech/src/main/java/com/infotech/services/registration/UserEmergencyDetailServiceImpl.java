package com.infotech.services.registration;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.dao.registration.UserEmergencyDetailDao;
import com.infotech.dao.registration.UserPersonalDetailDao;
import com.infotech.entity.User;
import com.infotech.entity.UserEmergencyDetail;
import com.infotech.model.UserEmergencyDetailModel;

@Service("userEmergencyDetailService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserEmergencyDetailServiceImpl implements UserEmergencyDetailService {
	
	
	@Autowired
	private UserEmergencyDetailDao userEmergencyDetailDao;
	@Autowired
	private UserPersonalDetailDao userPersonalDetailDao;
	public void addEmergencyDetail(UserEmergencyDetailModel userEmergencyDetails) {
		
		UserEmergencyDetail emergencyDetail=new UserEmergencyDetail();
		BeanUtils.copyProperties(userEmergencyDetails, emergencyDetail);
		User user = userPersonalDetailDao.getUserDetailsById(userEmergencyDetails.getUserID());
		emergencyDetail.setUserID(user);
		userEmergencyDetailDao.addEmergencyDetail(emergencyDetail);
	}

	public UserEmergencyDetailModel getUserEmergencyDetailsByUserID(Long userID) {

		UserEmergencyDetail emergencyDetail = new UserEmergencyDetail();
		emergencyDetail = userEmergencyDetailDao.getUserEmergencyDetailsByUserID(userID);
		UserEmergencyDetailModel detailModel = new UserEmergencyDetailModel();
		BeanUtils.copyProperties(emergencyDetail, detailModel);
		return detailModel;
	}

	public UserEmergencyDetailModel getUserEmergencyDetails(Long userEmergencyDetailID) {
		
		UserEmergencyDetail emergencyDetail = new UserEmergencyDetail();
		emergencyDetail = userEmergencyDetailDao.getUserEmergencyDetails(userEmergencyDetailID);
		UserEmergencyDetailModel detailModel = new UserEmergencyDetailModel();
		BeanUtils.copyProperties(emergencyDetail, detailModel);
		return detailModel;
	}

	public void deleteEducationDetails(UserEmergencyDetailModel userEmergencyDetail) {
		
	}

	
	
	
}
