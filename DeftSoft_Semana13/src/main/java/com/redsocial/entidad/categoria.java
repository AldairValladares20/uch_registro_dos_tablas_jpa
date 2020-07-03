package com.redsocial.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table (name = "categoria")
public class categoria {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idcategoria")
	private int idcategoria;
	
    @Column(name = "nombre")
	private String nombre;
    
    @OneToMany(mappedBy = "categoria")
    private List<galleta> galletas;
	 
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	};
}
