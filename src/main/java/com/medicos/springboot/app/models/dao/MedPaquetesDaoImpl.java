package com.medicos.springboot.app.models.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.medicos.springboot.app.models.entity.MedPaquetes;
@Repository
public class MedPaquetesDaoImpl implements IMedPaquetesDao {
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<MedPaquetes> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from MedPaquetes").getResultList();
	}
	 @Transactional
	@Override
	public MedPaquetes findOne(Long id) {
		return em.find(MedPaquetes.class, id);
	}
	 @Transactional
	@Override
	public void save(MedPaquetes medpaquetes) {
		if(medpaquetes.getMe_pa_id() != null && medpaquetes.getMe_pa_id() >0) {
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
			return em.createNativeQuery("select mepeapp_paquetes.me_pa_id,paquetes.paquete_id, paquetes.paquete_nombre from paquetes,mepeapp_paquetes where  paquetes.paquete_id=mepeapp_paquetes.paquete_id and mepeapp_paquetes.medicos_perfiles_id="+medicos_Perfil_Id).getResultList();
		}

}
