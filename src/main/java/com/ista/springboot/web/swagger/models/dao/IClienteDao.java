package com.ista.springboot.web.swagger.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.web.swagger.apirest.models.entity.Cliente;


public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
