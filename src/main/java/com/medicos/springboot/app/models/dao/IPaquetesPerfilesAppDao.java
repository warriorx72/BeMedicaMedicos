package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.PaquetesPerfilesApp;
import com.medicos.springboot.app.models.entity.PaquetesPerfilesQ;

public interface IPaquetesPerfilesAppDao {

	public List<PaquetesPerfilesApp> findAll();
	
	public void save (PaquetesPerfilesApp paquetesPerfiles);
	
	public PaquetesPerfilesApp findOne (Long id );
	
	public void delete (Long id);
	
	
	public List<PaquetesPerfilesQ> findAllById(Long id);

	List<PaquetesPerfilesApp> findPaquetesPerfiles(Long id);

	
	
	
	
}
