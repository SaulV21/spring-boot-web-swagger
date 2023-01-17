package com.ista.springboot.web.swagger.apirest.models.service;

import java.util.List;

import com.ista.springboot.web.swagger.apirest.models.entity.Empleado;

public interface IEmpleadoService {
public List <Empleado> findAll();
public Empleado save(Empleado empleado);
public Empleado findbyId(Long id);
public void delete(Long id);
}
