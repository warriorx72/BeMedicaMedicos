package com.medicos.springboot.app.models.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.medicos.springboot.app.models.entity.MedPerfiles;
@Repository
public class MedPerfilesDaoImpl implements IMedPerfilesDao {
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<MedPerfiles> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from MedPerfiles").getResultList();
	}
	 @Transactional
	@Override
	public MedPerfiles findOne(Long id) {
		return em.find(MedPerfiles.class, id);
	}
	 @Transactional
	@Override
	public void save(MedPerfiles medpaquetes) {
		if(medpaquetes.getPer_me_id() != null && medpaquetes.getPer_me_id() >0) {
			em.merge(medpaquetes);
		} else {
			em.persist(medpaquetes);
		}
	}

	 @Transactional
	@Override
	public void delete(Long id) {
		em.remove(findOne(id));
	}

	 @SuppressWarnings("unchecked")
		@Override

		public List<Object> findAll2(Long medicos_Perfil_Id) {
			// TODO Auto-generated method stub
			return em.createNativeQuery("select mepeapp_perfiles.per_me_id,perfiles.perfil_id, perfiles.perfil_nombre from perfiles,mepeapp_perfiles where perfiles.perfil_id=mepeapp_perfiles.perfil_id and mepeapp_perfiles.medicos_perfiles_id="+medicos_Perfil_Id).getResultList();
		}
	 
}
