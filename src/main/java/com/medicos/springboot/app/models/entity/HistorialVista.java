package com.medicos.springboot.app.models.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="historial_vista")
public class HistorialVista implements Serializable{
	
		private static final long serialVersionUID = 1L;
	
		@Id
		@Column(name="paciente_id")
		private Long PacienteId;
		
		@Column(name="Expediente")
		private String NumExpediente;

		@Column(name="Pacientes")
		private String NomPacientes;
		
		@Column(name="medicos_id")
		private Long MedicosId;
		
	

		
		
		public Long getMedicosId() {
			return MedicosId;
		}

		public void setMedicosId(Long medicosId) {
			MedicosId = medicosId;
		}

		public String getNumExpediente() {
			return NumExpediente;
		}

		public void setNumExpediente(String numExpediente) {
			NumExpediente = numExpediente;
		}

		public String getNomPacientes() {
			return NomPacientes;
		}

		public void setNomPacientes(String nomPacientes) {
			NomPacientes = nomPacientes;
		}

		public Long getPacienteId() {
			return PacienteId;
		}

		public void setPacienteId(Long pacienteId) {
			PacienteId = pacienteId;
		}
	}



