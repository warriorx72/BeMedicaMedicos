package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.MedPaquetes;

public interface IMedPaquetesDao {
	public List<MedPaquetes> findAll();

	public void save(MedPaquetes medpaquetes);
	
	public MedPaquetes findOne(Long id);
	
	public void delete(Long id);

	public List<Object> findAll2(Long medicos_Perfil_Id);
}
