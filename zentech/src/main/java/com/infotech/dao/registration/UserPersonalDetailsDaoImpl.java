package com.infotech.dao.registration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.entity.User;
import com.infotech.entity.UserAdditionalDetails;
import com.infotech.entity.UserPersonalDetail;

@Repository("userPersonalDetailDao")
public class UserPersonalDetailsDaoImpl implements UserPersonalDetailDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void addUserPersonalDetail(UserPersonalDetail userPersonalDetail) {
		entityManager.merge(userPersonalDetail);
		System.out.println("userpersonalid :"+userPersonalDetail.getUserPersonalDetailID());
	}

	@Transactional
	public UserPersonalDetail getUserPersonalDetailByUserID(Long userID) {
		
		TypedQuery<UserPersonalDetail> query = 
				entityManager.createQuery("select u from UserPersonalDetail u , User user where u.userID=user.userID and user.userID=?"
						, UserPersonalDetail.class);
		
		try {
			query.setParameter(1, Long.valueOf(userID));
			return (query.getResultList().get(0));
		} catch (Exception e) {
			return null;
		}
	}

	@Transactional
	public UserPersonalDetail getUserPersonalDetail(Long userPersonalDetailID) {
		
		TypedQuery<UserPersonalDetail> query = 
				entityManager.createQuery("select u from UserPersonalDetail u where u.userPersonalDetailID=?"
						, UserPersonalDetail.class);
		query.setParameter(1, userPersonalDetailID);
		try {
			return (query.getResultList().get(0));
		} catch (Exception e) {
			return null;
		}
	}

	@Transactional
	public void deleteUserPersonalDetail(UserPersonalDetail personalDetail) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public User getUserDetailsById(long id) {
		TypedQuery<User> query = 
				entityManager.createQuery("select u from User u where u.userID=?", User.class);
		query.setParameter(1, id);
		try {
			return (query.getResultList().get(0));
		} catch (Exception e) {
			return null;
		}
	}

	@Transactional
	public User addUserDetail(User user) {
		//user.getFamilyDetails().clear();
		entityManager.merge(user);
		System.out.println("userpersonalid :"+user.getUserID());
		return user;
	}

	@Transactional
	public void addUserAdditionalDetail(UserAdditionalDetails userAdditionalDetails) {
		entityManager.merge(userAdditionalDetails);
		System.out.println("userpersonalid :"+userAdditionalDetails.getUserAdditionalDetailID());
		
	}


	

}
