package com.medicos.springboot.app.models.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.medicos.springboot.app.models.entity.MedEstudios;

@Repository
public class MedEstudiosDaoImpl implements IMedEstudiosDao{

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<MedEstudios> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from MedEstudios").getResultList();
	}
	 @Transactional
	@Override
	public MedEstudios findOne(Long id) {
		return em.find(MedEstudios.class, id);
	}
	 @Transactional
	@Override
	public void save(MedEstudios medestudios) {
		if(medestudios.getEs_me_id() != null && medestudios.getEs_me_id() >0) {
			em.merge(medestudios);
		} else {
			em.persist(medestudios);
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
			return em.createNativeQuery("select estudios_view.nombre, meperapp_estudios.es_me_id from estudios_view,meperapp_estudios where estudios_view.id= meperapp_estudios.estudio_id and meperapp_estudios.medicos_perfiles_id="+medicos_Perfil_Id).getResultList();
		}
}
