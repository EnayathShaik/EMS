package com.infotech.dao.registration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.entity.UserExperienceDetail;

@Repository("userExperienceDetailDao")
public class UserExperienceDetailDaoImpl implements UserExperienceDetailDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void addUserExperienceDetails(UserExperienceDetail userExperienceDetail) {
		entityManager.merge(userExperienceDetail);
	}

	@Transactional
	public List<UserExperienceDetail> getUserExperienceDetailByUserID(Long userID) {
		
		TypedQuery<UserExperienceDetail> query = 
				entityManager.createQuery("select u from UserExperienceDetail u where u.userID=?1"
						, UserExperienceDetail.class);
		query.setParameter(1, userID);
		try {
			return (query.getResultList());
		} catch (Exception e) {
			return null;
		}
	}

	@Transactional
	public UserExperienceDetail getUserExperienceDetail(Long userExperianceDetailID) {
		
		TypedQuery<UserExperienceDetail> query = 
				entityManager.createQuery("select u from UserExperienceDetail u where u.userExperianceDetailID=?1"
						, UserExperienceDetail.class);
		query.setParameter(1, userExperianceDetailID);
		try {
			return (query.getResultList().get(0));
		} catch (Exception e) {
			return null;
		}
	}

	@Transactional
	public void deleteUserExperienceDetail(UserExperienceDetail userExperienceDetail) {
		// TODO Auto-generated method stub
		
	}

	
	

}
