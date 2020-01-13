package com.medicos.springboot.app.models.dao;
import java.util.List;
import com.medicos.springboot.app.models.entity.Evolucion;

public interface IEvolucionDao {
	
	public List<Evolucion> findAll();
	
	public Evolucion findOne(Long EvolucionId); 
	
	public void save(Evolucion evolucion);

}
