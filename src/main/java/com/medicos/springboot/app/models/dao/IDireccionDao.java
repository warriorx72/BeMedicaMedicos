package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.Direccion;

public interface IDireccionDao {

	public List<Direccion> findAll();
	
	public Direccion findOne(Long id); 
	
	public void delete(Long id);
	
	void save(Direccion direccion);
}
