package com.ista.springboot.web.swagger.apirest.models.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.web.swagger.apirest.models.entity.Usuario;
import com.ista.springboot.web.swagger.models.dao.IUsuarioDao;

@Service
public class UsuarioServiceImp implements IUsuarioService {
	@Autowired //inyectamos las dependencias
	private IUsuarioDao ClienteDao;//instanciamos con el IClienteDao
	
	@Override
	@Transactional (readOnly = true)//los datos que me devuelve sean utilizados solo para escritura
	
	public Iterable<Usuario> findAll() {
		return ClienteDao.findAll();//consulta todos los clientes y retorna
	}
	
	@Override
	@Transactional
	public Usuario save(Usuario cliente) {
		return ClienteDao.save(cliente);
	}
	
	
	@Override
	@Transactional
	public void delete(Long id) {
		ClienteDao.deleteById(id);
	}

	@Override
	@Transactional (readOnly = true)
	public Page<Usuario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return ClienteDao.findAll(pageable);
	}

	@Override
	@Transactional (readOnly = true)
	public Optional<Usuario> findbyId(Long id) {
		// TODO Auto-generated method stub
		return ClienteDao.findById(id);
	}
	
}
