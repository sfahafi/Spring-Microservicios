package com.sfahafi.app.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sfahafi.app.productos.models.entity.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Long> {

}
