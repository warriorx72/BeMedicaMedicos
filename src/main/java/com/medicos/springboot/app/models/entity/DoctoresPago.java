package com.medicos.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctores_pago")
public class DoctoresPago implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="pago_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PagoId;
	
	@Column(name="cuenta_bancaria")
	private String Cuenta;
	
	@Column(name="clave_inter")
	private String Clave;
	
	@Column(name="num_tarjeta")
	private String Tarjeta;
	
	@Column(name="banco")
	private String Banco;
	
	@Column(name="fecha_pago")
	private Date fecha;
	
	@Column(name="doctor_id")
	private String DoctorId;
	
	/*METODOS*/
	
	

	

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getPagoId() {
		return PagoId;
	}
	public void setPagoId(Long pagoId) {
		PagoId = pagoId;
	}

	public String getCuenta() {
		return Cuenta;
	}

	public void setCuenta(String cuenta) {
		Cuenta = cuenta;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}

	public String getTarjeta() {
		return Tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		Tarjeta = tarjeta;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

	public String getDoctorId() {
		return DoctorId;
	}

	public void setDoctorId(String doctorId) {
		DoctorId = doctorId;
	}
}
