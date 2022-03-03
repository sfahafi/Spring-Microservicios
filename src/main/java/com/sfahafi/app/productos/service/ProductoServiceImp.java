package com.sfahafi.app.productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sfahafi.app.productos.models.entity.Producto;
import com.sfahafi.app.productos.repository.IProductoRepository;

@Service
public class ProductoServiceImp implements IProductoService{
	
	@Autowired
	private IProductoRepository ipr;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> buscarTodos() {
		return (List<Producto>) ipr.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto buscarPorId(Long id) {
		return ipr.findById(id).orElse(null);
	}


}
