package com.ipn.mx.modelo.dao;

import java.util.List;

import com.ipn.mx.modelo.entidades.Categoria;

public interface ICategoriaDAO {

	List<Categoria> findAll();

	Object findById(Long id);

	void deleteById(Long id);

	Categoria save(Categoria categoria);

}
