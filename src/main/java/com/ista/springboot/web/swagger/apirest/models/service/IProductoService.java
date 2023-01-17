package com.ista.springboot.web.swagger.apirest.models.service;

import java.util.List;

import com.ista.springboot.web.swagger.apirest.models.entity.Producto;

public interface IProductoService {
public List<Producto> findAll();
public Producto save(Producto producto);
public Producto findbyId(Long id);
public void delete(Long id);
}
