package com.infotech.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 * Abstract DAO to cater basic CRUD Operation. All DAOs will be extending this class, 
 * so as to avoid repetition of code for these operations. 
 * @author admin
 *
 * @param <T>
 */
public abstract class AbstractJpaDAO<T extends Serializable> {

	private Class<T> clazz;

	// Entity Manager dependency Injection
	@PersistenceContext
	private EntityManager entityManager;
	/**
	 * Post construct method to be overridden by subclasses to setup class information. 
	 */
	@PostConstruct
	public void postConstruct(){	
		System.out.println(entityManager);
	}

	public EntityManager getEntityManger(){
		return entityManager;
	}
	/**
	 * Set entity class for which CRUD operations will be executed
	 * @param clazzToSet
	 */
	public final void setClazz(final Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}

	/**
	 * TO find record by Primary Key
	 * @param id
	 * @return Instance of Entity matching Primary Key.
	 */
	public T findOne(final int id) {
		return entityManager.find(clazz, id);
	}
	/**
	 * Load all the records in table
	 * @return List of all records in a table in form of Objects
	 */
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
						
		return entityManager.createQuery("from " + clazz.getName())
				.getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<T> findAll(String condition) {
		String sql = "";
		if(condition!=null && condition.length()>0)
			sql = "from " + clazz.getName()+" where "+condition;
		else
			sql ="from " + clazz.getName();
		List<T> resultList = entityManager.createQuery(sql)
				.getResultList();
		return resultList;
	}

	/**
	 * To persist an entity in Database table
	 * @param entity
	 */
	@Transactional(propagation=Propagation.REQUIRED)
	public void create(final T entity) {
		entityManager.persist(entity);
		
	}
	
	/**
	 * To update an entity
	 * @param entity
	 * @return entity
	 */
	 //@Transactional(noRollbackFor = RuntimeException.class)
	@Transactional(propagation =Propagation.REQUIRED )	
	public T update(final T entity) {
		return entityManager.merge(entity);
	}

	/**
	 * To delete an entity from Database
	 * @param entity
	 */
	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(final T entity) {
		entityManager.remove(entity);
	}

	/**
	 * Delete an entity with matching ID
	 * @param entityId
	 */
	@Transactional(propagation=Propagation.REQUIRED)
	public void deleteById(final int entityId) {
		final T entity = findOne(entityId);
		delete(entity);
	}
	
	public EntityManager getEntityManager(){
		return entityManager;
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public int executeUpdate(String sqlQuery) {
		Query query= entityManager.createQuery(sqlQuery);
		return query.executeUpdate();		
	}
	
	
	public List<Object[]> executeQuery(String query) {
		Query qu= entityManager.createNativeQuery(query);
		return qu.getResultList();		
	}
	

}