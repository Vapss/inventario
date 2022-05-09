package com.ipn.mx.modelo.entidades;
import java.util.*;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Categoria")

public class Categoria implements Serializable {
	
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategoria;
	
	@NotEmpty (message = "No vacio")
	@Size(min = 5, max = 50, message ="Debe estar entre 5 y 50 ")
	@NotBlank(message = "Es Obligatorio")
	@Column(name = "nombreCategoria", length= 50, nullable = false)
	private String nombreCategoria;
	
	
	@NotEmpty (message = "No vacio")
	@Size(min = 5, max = 150, message ="Debe estar entre 5 y 150 ")
	@NotBlank(message = "Es Obligatorio")
	@Column(name = "nombreCategoria", length= 50, nullable = false)
	private String descripcionCategoria;
	
	
	@JsonIgnoreProperties(value = {"idCategoria","hibernateLazyInitializer","handler"}, allowGetters=true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idCategoria", cascade = CascadeType.ALL) 
	private List<Producto> losProductos;
	
}
