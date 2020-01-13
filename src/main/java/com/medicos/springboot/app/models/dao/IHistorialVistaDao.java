package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.HistorialVista;

public interface IHistorialVistaDao {

	public List<HistorialVista> findAll();
	
	

}
