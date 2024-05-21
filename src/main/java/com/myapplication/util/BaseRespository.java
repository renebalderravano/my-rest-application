package com.myapplication.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public abstract class BaseRespository<T> {

	@Autowired
	private SessionFactory sf;

	private Class<T> entityClass;

	public BaseRespository() {
		Type superClass = getClass().getGenericSuperclass();
		Type type = ((ParameterizedType) superClass).getActualTypeArguments()[0];
		entityClass = (Class<T>) type;
	}

	@SuppressWarnings("deprecation")
	public T save(T t) {
		Session s = sf.getCurrentSession();
		s.beginTransaction();		
		s.saveOrUpdate(t);		
		s.getTransaction().commit();
		return t;
	}

	@SuppressWarnings("deprecation")
	public void update(T housingLocation) {
		Session session = this.sf.getCurrentSession();
		session.update(housingLocation);
	}

	public List<T> findAll() {
		Session session = this.sf.getCurrentSession();
		EntityManager em = session.getEntityManagerFactory().createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<T> q = cb.createQuery(entityClass);
		Root<T> root = q.from(entityClass);
		q.select(root);
		List<T> l = em.createQuery(q).getResultList();
		return l;
	}

	public T findById(Integer id) {
		Session session = this.sf.getCurrentSession();
		T hl = (T) session.byId(entityClass).load(id);
		return hl;
	}

	@SuppressWarnings("deprecation")
	public void delete(Integer id) {
		Session session = this.sf.getCurrentSession();
		T hl = (T) session.byId(entityClass).load(id);
		session.delete(hl);
	}

}
