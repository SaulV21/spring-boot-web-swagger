package com.ista.springboot.web.swagger.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.web.swagger.apirest.models.entity.Vendedor;

public interface IVendedorDao extends CrudRepository<Vendedor, Long>{

}
