package com.ipn.mx.modelo.service;

import java.io.ByteArrayInputStream;
import java.util.List;

import com.ipn.mx.modelo.entidades.Categoria;
import com.ipn.mx.modelo.entidades.Producto;

public interface IProductoService {
	public List<Producto> findAll();
	public Categoria findById(Long id);
	public Categoria save(Producto producto);
	public void delete(long id);
	
	public ByteArrayInputStream reporte(List<Producto> productos);
}
