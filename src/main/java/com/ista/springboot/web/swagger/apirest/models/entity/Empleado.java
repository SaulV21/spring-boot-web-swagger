package com.ista.springboot.web.swagger.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Empleados")
public class Empleado implements Serializable {
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="ID")
private Long id_empleado;
private String nombre;
private String apellido;
private String CI;
private Date fecha_n;
private String direccion;
private String sexo;
private Integer salario;
private Integer superci;
private Integer dno;


public Long getId_empleado() {
	return id_empleado;
}
public void setId_empleado(Long id_empleado) {
	this.id_empleado = id_empleado;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getCI() {
	return CI;
}
public void setCI(String cI) {
	CI = cI;
}
public Date getFecha_n() {
	return fecha_n;
}
public void setFecha_n(Date fecha_n) {
	this.fecha_n = fecha_n;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public Integer getSalario() {
	return salario;
}
public void setSalario(Integer salario) {
	this.salario = salario;
}
public Integer getSuperci() {
	return superci;
}
public void setSuperci(Integer superci) {
	this.superci = superci;
}
public Integer getDno() {
	return dno;
}
public void setDno(Integer dno) {
	this.dno = dno;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}

}
