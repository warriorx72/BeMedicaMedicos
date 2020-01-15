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
}
	