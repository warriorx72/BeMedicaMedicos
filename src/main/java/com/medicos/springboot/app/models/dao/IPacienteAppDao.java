package com.medicos.springboot.app.models.dao;
import java.util.List;

import com.medicos.springboot.app.models.entity.PacienteApp;

public interface IPacienteAppDao {
	
    public List<PacienteApp> findAll();
	
	public PacienteApp findOne(Long PacienteId); 

	public void save(PacienteApp pma);
}
