package com.medicos.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="direccion")
public class Direccion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@Column(name="direccion_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long DireccionId;

	@Column(name="direccion_estado")
	private String DireccionEstado;
	
	@Column(name="direccion_municipio")
	private String DireccionMunicipio;
	
	@Column(name="direccion_colonia")
	private String DireccionColonia;
	
	@Column(name="direccion_postal")
	private String DireccionPostal;
	
	@Column(name="direccion_calle")
	private String DireccionCalle;
	
	@Column(name="direccion_numero_ext")
	private String DireccionNumeroExt;

	@Column(name="direccion_num_inter")
	private String DireccionNumInter;

	public Long getDireccionId() {
		return DireccionId;
	}

	public void setDireccionId(Long direccionId) {
		DireccionId = direccionId;
	}

	public String getDireccionEstado() {
		return DireccionEstado;
	}

	public void setDireccionEstado(String direccionEstado) {
		DireccionEstado = direccionEstado;
	}

	public String getDireccionMunicipio() {
		return DireccionMunicipio;
	}

	public void setDireccionMunicipio(String direccionMunicipio) {
		DireccionMunicipio = direccionMunicipio;
	}

	public String getDireccionColonia() {
		return DireccionColonia;
	}

	public void setDireccionColonia(String direccionColonia) {
		DireccionColonia = direccionColonia;
	}

	public String getDireccionPostal() {
		return DireccionPostal;
	}

	public void setDireccionPostal(String direccionPostal) {
		DireccionPostal = direccionPostal;
	}

	public String getDireccionCalle() {
		return DireccionCalle;
	}

	public void setDireccionCalle(String direccionCalle) {
		DireccionCalle = direccionCalle;
	}

	public String getDireccionNumeroExt() {
		return DireccionNumeroExt;
	}

	public void setDireccionNumeroExt(String direccionNumeroExt) {
		DireccionNumeroExt = direccionNumeroExt;
	}

	public String getDireccionNumInter() {
		return DireccionNumInter;
	}

	public void setDireccionNumInter(String direccionNumInter) {
		DireccionNumInter = direccionNumInter;
	}
}
