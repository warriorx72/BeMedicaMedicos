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

@Entity
@Table(name="persona")
public class Persona implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@Column(name="persona_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PersonaId;

	@Column(name="persona_nombre")
	private String PersonaNombre;
	
	@Column(name="persona_ap")
	private String PersonaAp;
	
	@Column(name="persona_am")
	private String PersonaAm;
	
	@Column(name="persona_fecha_na")
	private String PersonaFechaNa;
	
	@Column(name="persona_rfc")
	private String PersonaRfc;
	
	@Column(name="persona_genero")
	private String PersonaGenero;
	
	@Column(name="persona_email")
	private String PersonaEmail;
	
	@Column(name="persona_tel_casa")
	private String PersonaTelCasa;
	
	@Column(name="persona_tel_cel")
	private String PersonaTelCel;

	@Column(name="PersonaTelOficina")
	private String persona_tel_oficina;
	
	@Column(name="persona_tel_exten")
	private String PersonaTelExten;

	@Column(name="id_direccion")
	private Long IdDireccion;

	public Long getPersonaId() {
		return PersonaId;
	}

	public void setPersonaId(Long personaId) {
		PersonaId = personaId;
	}

	public String getPersonaNombre() {
		return PersonaNombre;
	}

	public void setPersonaNombre(String personaNombre) {
		PersonaNombre = personaNombre;
	}

	public String getPersonaAp() {
		return PersonaAp;
	}

	public void setPersonaAp(String personaAp) {
		PersonaAp = personaAp;
	}

	public String getPersonaAm() {
		return PersonaAm;
	}

	public void setPersonaAm(String personaAm) {
		PersonaAm = personaAm;
	}

	public String getPersonaFechaNa() {
		return PersonaFechaNa;
	}

	public void setPersonaFechaNa(String personaFechaNa) {
		PersonaFechaNa = personaFechaNa;
	}

	public String getPersonaRfc() {
		return PersonaRfc;
	}

	public void setPersonaRfc(String personaRfc) {
		PersonaRfc = personaRfc;
	}

	public String getPersonaGenero() {
		return PersonaGenero;
	}

	public void setPersonaGenero(String personaGenero) {
		PersonaGenero = personaGenero;
	}

	public String getPersonaEmail() {
		return PersonaEmail;
	}

	public void setPersonaEmail(String personaEmail) {
		PersonaEmail = personaEmail;
	}

	public String getPersonaTelCasa() {
		return PersonaTelCasa;
	}

	public void setPersonaTelCasa(String personaTelCasa) {
		PersonaTelCasa = personaTelCasa;
	}

	public String getPersonaTelCel() {
		return PersonaTelCel;
	}

	public void setPersonaTelCel(String personaTelCel) {
		PersonaTelCel = personaTelCel;
	}

	public String getPersona_tel_oficina() {
		return persona_tel_oficina;
	}

	public void setPersona_tel_oficina(String persona_tel_oficina) {
		this.persona_tel_oficina = persona_tel_oficina;
	}

	public String getPersonaTelExten() {
		return PersonaTelExten;
	}

	public void setPersonaTelExten(String personaTelExten) {
		PersonaTelExten = personaTelExten;
	}

	public Long getIdDireccion() {
		return IdDireccion;
	}

	public void setIdDireccion(Long idDireccion) {
		IdDireccion = idDireccion;
	}
	
	
}
