package com.ipn.mx.modelo.dao;

import java.util.List;

import com.ipn.mx.modelo.entidades.Producto;

public interface IProductoDAO {

	List<Producto> findAll();

	Object findById(Long id);

	Producto save(Producto producto);

	void deleteById(Long id);

}
