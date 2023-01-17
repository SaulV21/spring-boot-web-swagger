package com.ista.springboot.web.swagger.apirest.models.service;

import java.util.List;

import com.ista.springboot.web.swagger.apirest.models.entity.Vendedor;

public interface IVendedorService {
public List<Vendedor> findAll();
public Vendedor save(Vendedor vendedor);
public Vendedor findbyId(Long id);
public void delete(Long id);
}
