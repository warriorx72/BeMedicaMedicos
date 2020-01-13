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
@Table(name="paciente_medico_ap")
public class PacienteMedicoAp  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="paciente_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long AltaPacienteId;
	
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
	
	@Column(name="expediente")
	private String Expediente;
	
	@Column(name="sexo")
	private String Sexo;
	
	@Column(name="tension_arterial")
	private String TensionAterial;
	
	@Column(name="frecuencia_cardiaca")
	private String FrecuenciaCardiaca;
	
	@Column(name="peso")
	private String Peso;
	
	@Column(name="talla")
	private String Talla;
	
	@Column(name="temperatura")
	private String Temperatura;
	
	@Column(name="frecuencia_respiratoria")
	private String FrecuenciaRespiratoria;
	
	@Column(name="archivo")
	private String Archivo;
	
	

	public Long getAltaPacienteId() {
		return AltaPacienteId;
	}

	public void setAltaPacienteId(Long altaPacienteId) {
		AltaPacienteId = altaPacienteId;
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

	

	public String getExpediente() {
		return Expediente;
	}

	public void setExpediente(String expediente) {
		Expediente = expediente;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	

	public String getTensionAterial() {
		return TensionAterial;
	}

	public void setTensionAterial(String tensionAterial) {
		TensionAterial = tensionAterial;
	}

	public String getFrecuenciaCardiaca() {
		return FrecuenciaCardiaca;
	}

	public void setFrecuenciaCardiaca(String frecuenciaCardiaca) {
		FrecuenciaCardiaca = frecuenciaCardiaca;
	}

	public String getPeso() {
		return Peso;
	}

	public void setPeso(String peso) {
		Peso = peso;
	}

	public String getTalla() {
		return Talla;
	}

	public void setTalla(String talla) {
		Talla = talla;
	}

	public String getTemperatura() {
		return Temperatura;
	}

	public void setTemperatura(String temperatura) {
		Temperatura = temperatura;
	}

	public String getFrecuenciaRespiratoria() {
		return FrecuenciaRespiratoria;
	}

	public void setFrecuenciaRespiratoria(String frecuenciaRespiratoria) {
		FrecuenciaRespiratoria = frecuenciaRespiratoria;
	}

	public String getArchivo() {
		return Archivo;
	}

	public void setArchivo(String archivo) {
		Archivo = archivo;
	}
	
	
	
}


