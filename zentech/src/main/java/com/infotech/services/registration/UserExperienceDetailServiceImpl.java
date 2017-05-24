package com.infotech.services.registration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.dao.registration.UserExperienceDetailDao;
import com.infotech.dao.registration.UserPersonalDetailDao;
import com.infotech.entity.User;
import com.infotech.entity.UserExperienceDetail;
import com.infotech.model.UserExperienceDetailModel;

@Service("userExperienceDetailService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserExperienceDetailServiceImpl implements UserExperienceDetailService {
	
	
	@Autowired
	private UserExperienceDetailDao userExperienceDetailDao;
	@Autowired
	private UserPersonalDetailDao userPersonalDetailDao;

	public void addUserExperienceDetails(List<UserExperienceDetailModel> userExperienceDetail) {
		
		for(UserExperienceDetailModel model:userExperienceDetail){			
			UserExperienceDetail experienceDetail=new UserExperienceDetail();
			  BeanUtils.copyProperties(model, experienceDetail);
			  User user = userPersonalDetailDao.getUserDetailsById(model.getUserID());
			  experienceDetail.setUserID(user);
			  userExperienceDetailDao.addUserExperienceDetails(experienceDetail);		
			}
	}

	public List<UserExperienceDetailModel> getUserExperienceDetailByUserID(Long userID) {
		
		List<UserExperienceDetail> qualificationDetails = new ArrayList<UserExperienceDetail>();
		qualificationDetails = userExperienceDetailDao.getUserExperienceDetailByUserID(userID);
		List<UserExperienceDetailModel> modelList = new ArrayList<UserExperienceDetailModel>();
		for (UserExperienceDetail model : qualificationDetails) {
			UserExperienceDetailModel detailModel = new UserExperienceDetailModel();
			BeanUtils.copyProperties(model, detailModel);
			modelList.add(detailModel);
		}
		return modelList;
	}

	public UserExperienceDetailModel getUserExperienceDetail(Long userExperianceDetailID) {
		
		UserExperienceDetail qualificationDetails = new UserExperienceDetail();
		qualificationDetails = userExperienceDetailDao.getUserExperienceDetail(userExperianceDetailID);
		UserExperienceDetailModel detailModel = new UserExperienceDetailModel();
		BeanUtils.copyProperties(qualificationDetails, detailModel);
		return detailModel;
	}

	public void deleteUserExperienceDetail(UserExperienceDetailModel userExperienceDetail) {
		// TODO Auto-generated method stub
		
	}

	
}
