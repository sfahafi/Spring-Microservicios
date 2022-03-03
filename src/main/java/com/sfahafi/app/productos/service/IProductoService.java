package com.sfahafi.app.productos.service;

import java.util.List;

import com.sfahafi.app.productos.models.entity.Producto;

public interface IProductoService {

	
	public List<Producto> buscarTodos();
	public Producto buscarPorId(Long id);
}
