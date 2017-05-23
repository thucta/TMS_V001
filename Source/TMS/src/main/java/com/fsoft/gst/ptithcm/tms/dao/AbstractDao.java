package com.fsoft.gst.ptithcm.tms.dao;

import java.io.Serializable;

import java.lang.reflect.ParameterizedType;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractDao.
 *
 * @param <PK> the generic type
 * @param <T> the generic type
 */
public abstract class AbstractDao<PK extends Serializable, T> {

	/** The persistent class. */
	private final Class<T> persistentClass;

	/**
	 * Instantiates a new abstract dao.
	 */
	@SuppressWarnings("unchecked")
	public AbstractDao() {
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass

		()).getActualTypeArguments()[1];
	}

	/** The session factory. */
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Gets the session.
	 *
	 * @return the session
	 */
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * Gets the by key.
	 *
	 * @param key the key
	 * @return the by key
	 */
	@SuppressWarnings("unchecked")
	public T getByKey(PK key) {
		return (T) getSession().get(persistentClass, key);
	}

	/**
	 * Persist.
	 *
	 * @param entity the entity
	 */
	public void persist(T entity) {
		getSession().persist(entity);
	}
	
	public void saveOrUpdate(T entity) {
		getSession().saveOrUpdate(entity);
	}
	
	/**
	 * Delete.
	 *
	 * @param entity the entity
	 */
	public void delete(T entity) {
		getSession().delete(entity);
	}

	/**
	 * Creates the entity criteria.
	 *
	 * @return the criteria
	 */
	protected Criteria createEntityCriteria() {
		return getSession().createCriteria(persistentClass);
	}

}