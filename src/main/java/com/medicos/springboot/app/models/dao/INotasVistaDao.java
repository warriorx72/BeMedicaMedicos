package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.NotasVista;

public interface INotasVistaDao {
	
	public List<NotasVista> findAll();

}
