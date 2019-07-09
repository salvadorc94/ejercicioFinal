package com.uca.capas.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public",name="contribuyente")
public class Contribuyente {
	
	@Id
	@GeneratedValue(generator="contribuyente_c_contribuyente_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="contribuyente_c_contribuyente_seq",sequenceName="public.contribuyente_c_contribuyente_seq",allocationSize=1)
	@Column(name="c_contribuyente")
	private int c_contribuyente;
	
	@NotEmpty(message="Ingrese un nombre")
	@NotNull
	@Size(min = 1, max = 30, message= "Nombre no puede exceder 30 caracteres")
	@Column(name="s_nombre")
	private String s_nombre;
	
	@NotEmpty(message="Ingrese un apellido")
	@NotNull
	@Size(min = 1, max = 30, message= "Apellido no puede exceder 30 caracteres")
	@Column(name="s_apellido")
	private String s_apellido;
	
	@NotEmpty(message="Ingrese un NIT")
	@NotNull
	@Size(min = 1, max = 14, message= "NIT no puede exceder 14 caracteres")
	@Column(name="s_nit")
	private String s_nit;
	
	@Column(name="f_fecha_ingreso")
	private Date f_fecha_ingreso;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c_importancia")
	private Importancia importancia;

	public String getDelegateFecha() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dateString = format.format(f_fecha_ingreso);
		return dateString;
	}
	
	public int getC_contribuyente() {
		return c_contribuyente;
	}

	public void setC_contribuyente(int c_contribuyente) {
		this.c_contribuyente = c_contribuyente;
	}

	public String getS_nombre() {
		return s_nombre;
	}

	public void setS_nombre(String s_nombre) {
		this.s_nombre = s_nombre;
	}

	public String getS_apellido() {
		return s_apellido;
	}

	public void setS_apellido(String s_apellido) {
		this.s_apellido = s_apellido;
	}

	public String getS_nit() {
		return s_nit;
	}

	public void setS_nit(String s_nit) {
		this.s_nit = s_nit;
	}

	public Date getF_fecha_ingreso() {
		return f_fecha_ingreso;
	}

	public void setF_fecha_ingreso(Date f_fecha_ingreso) {
		this.f_fecha_ingreso = f_fecha_ingreso;
	}

	public Importancia getImportancia() {
		return importancia;
	}

	public void setImportancia(Importancia importancia) {
		this.importancia = importancia;
	}

	

	
	
	
}
