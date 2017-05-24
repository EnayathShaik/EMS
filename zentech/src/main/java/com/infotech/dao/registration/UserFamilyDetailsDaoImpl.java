package com.infotech.dao.registration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.entity.FamilyDetail;


@Repository("userFamilyDetailDao")
public class UserFamilyDetailsDaoImpl implements UserFamilyDetailDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void addFamilyDetail(FamilyDetail familyDetail) {
		entityManager.merge(familyDetail);
		
	}

	@Transactional
	public List<FamilyDetail> getFamilyDetailByUserID(Long userID) {
		
		TypedQuery<FamilyDetail> query = 
				entityManager.createQuery("select u from FamilyDetail u where u.userID=?1"
						, FamilyDetail.class);
		query.setParameter(1, userID);
		try {
			return (query.getResultList());
		} catch (Exception e) {
			return null;
		}
	}

	@Transactional
	public FamilyDetail getFamilyDetail(Long userFamilyDetailID) {
		
		TypedQuery<FamilyDetail> query = 
				entityManager.createQuery("select u from FamilyDetail u where u.userFamilyDetailID=?1"
						, FamilyDetail.class);
		query.setParameter(1, userFamilyDetailID);
		try {
			return (query.getResultList().get(0));
		} catch (Exception e) {
			return null;
		}
	}

	@Transactional
	public void deleteUserFamilyDetail(FamilyDetail familyDetail) {
		// TODO Auto-generated method stub
		
	}

	
	
}
