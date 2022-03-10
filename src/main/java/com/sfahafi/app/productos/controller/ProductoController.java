package com.sfahafi.app.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sfahafi.app.productos.models.entity.Producto;
import com.sfahafi.app.productos.service.IProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	private IProductoService ips;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return ips.buscarTodos();
	}
	
	@GetMapping("/buscar/{id}")
	public Producto detalle(@PathVariable Long id) {
		return ips.buscarPorId(id);
	}

}
