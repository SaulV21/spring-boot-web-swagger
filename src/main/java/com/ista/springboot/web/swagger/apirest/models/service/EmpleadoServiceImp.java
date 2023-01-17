package com.ista.springboot.web.swagger.apirest.models.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.web.swagger.apirest.models.entity.Empleado;
import com.ista.springboot.web.swagger.models.dao.IEmpleadoDao;

@Service
public class EmpleadoServiceImp implements IEmpleadoService {

	@Autowired
	private IEmpleadoDao EmpleadoDao;
	
	@Override
	@Transactional (readOnly=true)
	public List<Empleado> findAll() {
		
		return (List<Empleado>) EmpleadoDao.findAll();
	}

	@Override
	@Transactional
	public Empleado save(Empleado empleado) {
		
		return EmpleadoDao.save(empleado);
	}

	@Override
	@Transactional (readOnly = true)
	public Empleado findbyId(Long id) {

		return EmpleadoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		EmpleadoDao.deleteById(id);
		
	}

}
