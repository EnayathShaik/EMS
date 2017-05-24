package com.infotech.dao.registration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.entity.UserEmergencyDetail;

@Repository("userEmergencyDetailDao")
public class UserEmergencyDetailDaoImpl implements UserEmergencyDetailDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void addEmergencyDetail(UserEmergencyDetail userEmergencyDetails) {
		entityManager.merge(userEmergencyDetails);
	}

	@Transactional
	public UserEmergencyDetail getUserEmergencyDetailsByUserID(Long userID) {
		
		TypedQuery<UserEmergencyDetail> query = 
				entityManager.createQuery("select u from UserEmergencyDetail u where u.userId=?1"
						, UserEmergencyDetail.class);
		query.setParameter(1, userID);
		try {
			return (query.getResultList().get(0));
		} catch (Exception e) {
			return null;
		}
	}

	@Transactional
	public UserEmergencyDetail getUserEmergencyDetails(Long userEmergencyDetailID) {
		
		TypedQuery<UserEmergencyDetail> query = 
				entityManager.createQuery("select u from UserEmergencyDetail u where u.userEmergencyDetailID=?1"
						, UserEmergencyDetail.class);
		query.setParameter(1, userEmergencyDetailID);
		try {
			return (query.getResultList().get(0));
		} catch (Exception e) {
			return null;
		}
	}

	@Transactional
	public void deleteEducationDetails(UserEmergencyDetail userEmergencyDetail) {
		// TODO Auto-generated method stub
		
	}

	
	

}
