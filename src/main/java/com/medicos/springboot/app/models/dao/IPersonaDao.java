package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.Persona;

public interface IPersonaDao {
	
	public List<Persona> findAll();
	
	public void save (Persona persona);
	
	public Persona findOne (Long id );
	
	public void delete (Long id);

}
