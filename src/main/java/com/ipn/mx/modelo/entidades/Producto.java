package com.ipn.mx.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table (name = "Producto")
public class Producto implements Serializable {
	
	/*
	 * 
	 */

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProducto;
	
	
	
	@NotEmpty (message = "No vacio")
	@Size(min = 5, max = 50, message ="Debe estar entre 5 y 50 ")
	@NotBlank(message = "Es Obligatorio")
	@Column(name = "nombreProducto", length= 50, nullable = false)
	private String nombreProducto;
	
	
	@NotEmpty (message = "No vacio")
	@Size(min = 5, max = 50, message ="Debe estar entre 5 y 50 ")
	@NotBlank(message = "Es Obligatorio")
	@Column(name = "descripcionProducto", length= 50, nullable = false)
	private String descripcionProducto;
	
	
	@NotEmpty (message = "No vacio")
	@Size(min = 5, max = 50, message ="Debe estar entre 5 y 50 ")
	@NotBlank(message = "Es Obligatorio")
	@Column(name = "precioProducto", length= 50, nullable = false)
	private double precioProducto;
	
	
	@NotEmpty (message = "No vacio")
	@Size(min = 5, max = 50, message ="Debe estar entre 5 y 50 ")
	@NotBlank(message = "Es Obligatorio")
	@Column(name = "existencia", length= 50, nullable = false)
	private int existencia;
	
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;
	
	@ManyToOne
	@JoinColumn(name = "idCategoria")
	private Categoria idCategoria;
	
	@PrePersist
	public void prePersist(){
		this.fechaCreacion = new Date();
	}
	
	

}
