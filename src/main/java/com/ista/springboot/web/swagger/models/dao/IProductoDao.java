package com.ista.springboot.web.swagger.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.web.swagger.apirest.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

}
