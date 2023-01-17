package com.ista.springboot.web.swagger.apirest.models.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ista.springboot.web.swagger.apirest.models.entity.Usuario;


public interface IUsuarioService {

	public Iterable <Usuario> findAll();
	
	public Page<Usuario> findAll(Pageable pageable);
	
	public Usuario save(Usuario cliente);
	
	public Optional<Usuario> findbyId(Long id);
	
	public void delete(Long id);
}
