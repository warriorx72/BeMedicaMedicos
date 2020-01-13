package com.medicos.springboot.app.models.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paciente_medico_ap")
public class AltaPaciente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="paciente_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long AltaPacienteId;
	
	@Column(name="persona_id")
	private Long PersonaId;
	
	@Column(name="medicos_id")
	private Long MedicosId;
	
	@Column(name="estado_civil")
	private String EstadoCivil;
	
	@Column(name="expediente")
	private String Expediente;
	
	@Column(name="tension_arterial")
	private String TensionArterial;
	
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
	
	
	public Long getPersonaId() {
		return PersonaId;
	}

	public void setPersonaId(Long personaId) {
		PersonaId = personaId;
	}

	public Long getAltaPacienteId() {
		return AltaPacienteId;
	}

	public void setAltaPacienteId(Long altaPacienteId) {
		AltaPacienteId = altaPacienteId;
	}	
	

	public String getExpediente() {
		return Expediente;
	}

	public void setExpediente(String expediente) {
		Expediente = expediente;
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

	public Long getMedicosId() {
		return MedicosId;
	}

	public void setMedicosId(Long medicosId) {
		MedicosId = medicosId;
	}

	public String getEstadoCivil() {
		return EstadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		EstadoCivil = estadoCivil;
	}

	public String getTensionArterial() {
		return TensionArterial;
	}

	public void setTensionArterial(String tensionArterial) {
		TensionArterial = tensionArterial;
	}

	public String getFrecuenciaCardiaca() {
		return FrecuenciaCardiaca;
	}

	public void setFrecuenciaCardiaca(String frecuenciaCardiaca) {
		FrecuenciaCardiaca = frecuenciaCardiaca;
	}

	public String getFrecuenciaRespiratoria() {
		return FrecuenciaRespiratoria;
	}

	public void setFrecuenciaRespiratoria(String frecuenciaRespiratoria) {
		FrecuenciaRespiratoria = frecuenciaRespiratoria;
	}

}
	