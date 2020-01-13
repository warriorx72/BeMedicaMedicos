package com.medicos.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medicos.springboot.app.models.entity.Direccion;
@Repository
public class DireccionDaoImpl implements IDireccionDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Direccion> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery ("from Direccion").getResultList();
	}
	@Transactional
	@Override
	public Direccion findOne(Long id) {
		// TODO Auto-generated method stub
		return em.find(Direccion.class,id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		em.remove(findOne(id));
	}

	@Override
	@Transactional
	public void save(Direccion direccion) {
		if(direccion.getDireccionId() !=null &&  direccion.getDireccionId()>0) {
			em.merge(direccion);
			
		}
		else {
			em.persist(direccion);
		}

	}

}
