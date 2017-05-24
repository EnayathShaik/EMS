package com.infotech.dao;

import java.io.Serializable;
import java.util.List;
/**
 * Common Dao Interface, to be implemented by Each class
 * @author admin
 *
 * @param <T>
 */
public interface CommonDao<T extends Serializable> {

	public T findOne(final int id);

	public List<T> findAll();
	
	public List<T> findAll(final String condition);

	public T update(final T entity);

	public void delete(final T entity);

	public void deleteById(final int entityId);

	public void create(T entity);
	
	public int executeUpdate (String sqlQuery) ;
	
	public List<Object[]> executeQuery( String sqlQuery);
	
}
