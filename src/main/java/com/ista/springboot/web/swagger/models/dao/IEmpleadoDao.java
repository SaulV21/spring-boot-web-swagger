package com.ista.springboot.web.swagger.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.web.swagger.apirest.models.entity.Empleado;

public interface IEmpleadoDao extends CrudRepository<Empleado, Long>{

}
