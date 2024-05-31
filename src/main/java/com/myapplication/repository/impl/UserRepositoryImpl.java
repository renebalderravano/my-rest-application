package com.myapplication.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.myapplication.model.User;
import com.myapplication.repository.UserRepository;
import com.myapplication.util.BaseRespository;


@Repository
public class UserRepositoryImpl extends BaseRespository<User> implements UserRepository {

	
	
	
	
	@Override
	public User findByUserName(String userName, String password) {
		
		
		Session session = this.getSf().getCurrentSession();
		EntityManager em = session.getEntityManagerFactory().createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<User> q = cb.createQuery(User.class);
		Root<User> root = q.from(User.class);
		
	    List<Predicate> predicates = new ArrayList<>();
	    
	        predicates.add(cb.equal(root.get("username"), userName));
		
		q.select(root).where(predicates.toArray(new Predicate[0]));
	
		List<User> l = em.createQuery(q).getResultList();
		return l.get(0);
	}

}
