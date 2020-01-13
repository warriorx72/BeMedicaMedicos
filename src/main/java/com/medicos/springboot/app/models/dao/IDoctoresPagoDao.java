package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.DoctoresPago;

public interface IDoctoresPagoDao {
	
	public List<DoctoresPago>findAll();
	public DoctoresPago findOne(Long PagoId); 
	
	
	public void save(DoctoresPago doctoresPago);

}
