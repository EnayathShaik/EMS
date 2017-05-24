package com.infotech.dao.registration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.entity.UserLastCompanyDetail;

@Repository("userLastCompanyDetailDao")
public class UserLastCompanyDetailDaoImpl implements UserLastCompanyDetailDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void addUserLastCompanyDetail(UserLastCompanyDetail lastCompanyDetail) {
		entityManager.merge(lastCompanyDetail);
		
	}

	@Transactional
	public List<UserLastCompanyDetail> getUserLastCompanyDetailByUserID(Long userID) {
		
		TypedQuery<UserLastCompanyDetail> query = 
				entityManager.createQuery("select u from UserLastCompanyDetail u where u.userId=?1"
						, UserLastCompanyDetail.class);
		query.setParameter(1, userID);
		try {
			return (query.getResultList());
		} catch (Exception e) {
			return null;
		}
	}

	@Transactional
	public UserLastCompanyDetail getUserLastCompanyDetail(Long userLastCompanyDetailID) {
		
		TypedQuery<UserLastCompanyDetail> query = 
				entityManager.createQuery("select u from UserLastCompanyDetail u where u.userLastCompanyDetailID=?1"
						, UserLastCompanyDetail.class);
		query.setParameter(1, userLastCompanyDetailID);
		try {
			return (query.getResultList().get(0));
		} catch (Exception e) {
			return null;
		}
	}

	@Transactional
	public void deleteUserLastCompanyDetail(UserLastCompanyDetail familyDetail) {
		// TODO Auto-generated method stub
		
	}

	
	
}
