package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.MedPerfiles;

public interface IMedPerfilesDao {
	public List<MedPerfiles> findAll();

	public void save(MedPerfiles medperfiles);
	
	public MedPerfiles findOne(Long id);
	
	public void delete(Long id);

	public List<Object> findAll2(Long medicos_Perfil_Id);
}
