package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.MedEstudios;


public interface IMedEstudiosDao {
	public List<MedEstudios> findAll();

	public void save(MedEstudios medestudios);
	
	public MedEstudios findOne(Long id);
	
	public void delete(Long id);

	public List<Object> findAll2(Long medicos_Perfil_Id);

}
