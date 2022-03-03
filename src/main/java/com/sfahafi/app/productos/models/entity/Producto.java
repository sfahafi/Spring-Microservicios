package com.sfahafi.app.productos.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="productos")
public class Producto implements Serializable{
	
	/**
	 * Serial version generada "Es unico"
	 */
	private static final long serialVersionUID = -8608118154717783137L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private Double precio;
	
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Date getCreateAt() {
		return fechaCreacion;
	}
	public void setCreateAt(Date createAt) {
		this.fechaCreacion = createAt;
	}
	
	
	
}
