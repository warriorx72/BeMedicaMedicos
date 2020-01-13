package com.medicos.springboot.app.models.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="evolucion")
public class Evolucion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="evolucion_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long EvolucionId;
	
	@Column(name="paciente_id")
	private Long PacienteId;
	
	@Column(name="evolucion_evolucion")
	private String Evolu;
	
	@Column(name="evolucion_previos")
	private String Previos;
	
	@Column(name="evolucion_clinicos")
	private String Clinicos;
	
	@Column(name="evolucion_pronostico")
	private String Pronostico;
	
	@Column(name="evolucion_terapeutica")
	private String Terapeutica;
	
	

	public Long getEvolucionId() {
		return EvolucionId;
	}

	public void setEvolucionId(Long evolucionId) {
		EvolucionId = evolucionId;
	}

	public Long getPacienteId() {
		return PacienteId;
	}

	public void setPacienteId(Long pacienteId) {
		PacienteId = pacienteId;
	}

	
	public String getEvolu() {
		return Evolu;
	}

	public void setEvolu(String evolu) {
		Evolu = evolu;
	}

	public String getPrevios() {
		return Previos;
	}

	public void setPrevios(String previos) {
		Previos = previos;
	}

	public String getClinicos() {
		return Clinicos;
	}

	public void setClinicos(String clinicos) {
		Clinicos = clinicos;
	}

	public String getPronostico() {
		return Pronostico;
	}

	public void setPronostico(String pronostico) {
		Pronostico = pronostico;
	}

	public String getTerapeutica() {
		return Terapeutica;
	}

	public void setTerapeutica(String terapeutica) {
		Terapeutica = terapeutica;
	}

	
}
