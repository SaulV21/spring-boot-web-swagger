package com.ista.springboot.web.swagger.apirest.models.service;

import java.util.List;

import com.ista.springboot.web.swagger.apirest.models.entity.Cliente;


public interface IClienteService {

	public List <Cliente> findAll();
	
	public Cliente save(Cliente cliente);
	
	public Cliente findbyId(Long id);
	
	public void delete(Long id);
}
