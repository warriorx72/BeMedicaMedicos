package com.medicos.springboot.app.models.dao;
import java.util.List;

import com.medicos.springboot.app.models.entity.PacienteMedicoAp;

public interface IPacienteMedicoApDao {
	
    public List<PacienteMedicoAp> findAll();
	
	public PacienteMedicoAp findOne(Long AltaPacienteId); 

	public void save(PacienteMedicoAp pma);
	


}
