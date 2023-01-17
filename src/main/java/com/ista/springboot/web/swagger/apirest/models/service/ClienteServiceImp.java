package com.ista.springboot.web.swagger.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.web.swagger.apirest.models.entity.Cliente;
import com.ista.springboot.web.swagger.models.dao.IClienteDao;

@Service
public class ClienteServiceImp implements IClienteService {
	@Autowired //inyectamos las dependencias
	private IClienteDao ClienteDao;//instanciamos con el IClienteDao
	
	@Override
	@Transactional (readOnly = true)//los datos que me devuelve sean utilizados solo para escritura
	
	public List<Cliente> findAll() {
		return (List<Cliente>) ClienteDao.findAll();//consulta todos los clientes y retorna
	}
	
	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return ClienteDao.save(cliente);
	}
	
	@Override
	@Transactional (readOnly = true)
	public Cliente findbyId(Long id) {
		return ClienteDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		ClienteDao.deleteById(id);
	}
	
}
