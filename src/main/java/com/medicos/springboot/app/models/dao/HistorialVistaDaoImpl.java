package com.medicos.springboot.app.models.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.medicos.springboot.app.models.entity.HistorialVista;


@Repository
public class HistorialVistaDaoImpl implements IHistorialVistaDao {
	
	@PersistenceContext
	private EntityManager em;
	@Transactional(readOnly =true)
	@SuppressWarnings("unchecked")
	@Override
	
	public List<HistorialVista> findAll() {
	return em.createQuery("From HistorialVista").getResultList();
	}
}


