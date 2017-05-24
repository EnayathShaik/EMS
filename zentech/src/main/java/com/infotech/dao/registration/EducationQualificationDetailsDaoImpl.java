package com.infotech.dao.registration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.entity.EducationQualificationDetail;

@Repository("educationQualificationDetailDao")
public class EducationQualificationDetailsDaoImpl implements EducationQualificationDetailDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void addEducationDetails(EducationQualificationDetail qualificationDetails) {
		entityManager.merge(qualificationDetails);
	}

	@Transactional
	public List<EducationQualificationDetail> getEducationDetailsListByUserID(Long userID) {
		
		TypedQuery<EducationQualificationDetail> query = 
				entityManager.createQuery("select u from EducationQualificationDetail u where u.userId=?1"
						, EducationQualificationDetail.class);
		query.setParameter(1, userID);
		try {
			return (query.getResultList());
		} catch (Exception e) {
			return null;
		}
	}

	@Transactional
	public EducationQualificationDetail getEducationDetail(Long userEducationDetailID) {
		
		TypedQuery<EducationQualificationDetail> query = 
				entityManager.createQuery("select u from EducationQualificationDetail u where u.userEducationDetailID=?1"
						, EducationQualificationDetail.class);
		query.setParameter(1, userEducationDetailID);
		try {
			return (query.getResultList().get(0));
		} catch (Exception e) {
			return null;
		}
	}

	@Transactional
	public void deleteEducationDetails(EducationQualificationDetail qualificationDetails) {
		// TODO Auto-generated method stub

	}

}
