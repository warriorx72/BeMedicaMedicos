package com.medicos.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="notas_vista")
public class NotasVista implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@Column(name="evolucion_id")
	private Long EvolucionId;
	
	
	@Column(name="id")
	private Long PacienteId;
	
	@Column(name="Expediente")
	private String NumExpediente;

	@Column(name="nombre")
	private String Nombre;
	
	@Column(name="paterno")
	private String apellido_paterno;
	
	@Column(name="materno")
	private String apellido_materno;

	@Column(name="fecha_evo")
	private Date Fecha;
	
	
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

	public String getNumExpediente() {
		return NumExpediente;
	}

	public void setNumExpediente(String numExpediente) {
		NumExpediente = numExpediente;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	
	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
	
	

	
}
