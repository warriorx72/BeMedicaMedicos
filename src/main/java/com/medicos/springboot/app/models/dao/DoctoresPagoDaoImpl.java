package com.medicos.springboot.app.models.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;




import com.medicos.springboot.app.models.entity.DoctoresPago;

@Repository
public class DoctoresPagoDaoImpl implements IDoctoresPagoDao {

	
	@PersistenceContext
	private EntityManager em;
	@Transactional(readOnly =true)
	@SuppressWarnings("unchecked")
	
	
	@Override
	public List<DoctoresPago> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("From DoctoresPago").getResultList();
	}
	
	@Override
	@Transactional(readOnly =true)
	public DoctoresPago findOne(Long PagoId) {
		// TODO Auto-generated method stub
		return em.find(DoctoresPago.class, PagoId);
		}
	@Override
	@Transactional
	public void save(DoctoresPago doctoresPago) {
		if(doctoresPago.getDoctorId() != null && doctoresPago.getPagoId() >0) {
			em.merge(doctoresPago);
		}else{
			em.persist(doctoresPago);	
		}//end_else
		
	}//end_save

}
