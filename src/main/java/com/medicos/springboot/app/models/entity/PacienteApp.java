package com.medicos.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;


@Entity
@Table(name="paciente_app")
public class PacienteApp implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="paciente_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PacienteId;
	
	@Column(name="nombre")
	private String Nombre;
	
	@Column(name="medicos_id")
	private String MedicoId;
	
	@Column(name="apellido_paterno")
	private String ApellidoPaterno;
	
	@NotNull
	@Column(name="apellido_materno")
	private String ApellidoMaterno;
	
	@Column(name="fecha")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date Fecha;
	
	@Column(name="edad")
	private String Edad;
	

	public Long getPacienteId() {
		return PacienteId;
	}

	public void setPacienteId(Long pacienteId) {
		PacienteId = pacienteId;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getMedicoId() {
		return MedicoId;
	}

	public void setMedicoId(String medicoId) {
		MedicoId = medicoId;
	}

	public String getApellidoPaterno() {
		return ApellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		ApellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		ApellidoMaterno = apellidoMaterno;
	}

	
	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public String getEdad() {
		return Edad;
	}

	public void setEdad(String edad) {
		Edad = edad;
	}
	
}


