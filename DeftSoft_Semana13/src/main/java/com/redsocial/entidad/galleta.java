package com.redsocial.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name = "galleta")
public class galleta {
	
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idgalleta")
	private int idgalleta;
    
    @Column(name = "nombre")
	private String nombre;
    
    @Column(name = "stock")
	private int stock;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fechaVencimiento")
	private Date fechaVencimiento;
    
    
    //LAZY--perezoso --va a traer categoria cuando se lo piden (Mejor perfomance)
    //EAGER--ansioso-- va a traer categoria inmediatamente
    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "idcategoria")
	private categoria categoria;
	
	public int getIdgalleta() {
		return idgalleta;
	}
	public void setIdgalleta(int idgalleta) {
		this.idgalleta = idgalleta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(categoria categoria) {
		this.categoria = categoria;
	}
}
