package com.ista.springboot.web.swagger.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.ista.springboot.web.swagger.apirest.models.entity.Cliente;
import com.ista.springboot.web.swagger.apirest.models.service.IClienteService;



@CrossOrigin (origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteResController {
	@Autowired
	private IClienteService clienteService;
	
	//listar cliente
	@GetMapping("/clientes")
	public List <Cliente> indext() {
		return clienteService.findAll();
	}
	
	//Buscar cliente
		@GetMapping("/buscar/{id}")
		public Cliente show(@PathVariable Long id) {
			return clienteService.findbyId(id);
		}
	
	//editar cliente
	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
		Cliente clienteActual=clienteService.findbyId(id);
		clienteActual.setApellido(cliente.getApellido());
		clienteActual.setNombre(cliente.getNombre());
		clienteActual.setEmail(cliente.getEmail());
		return clienteService.save(clienteActual);
	}
	
	
	//guardar cliente
		@PostMapping("/guardar")
		@ResponseStatus(HttpStatus.CREATED)
	    public Cliente guardar(@RequestBody Cliente u){
	          return clienteService.save(u);
	    }
	
	//borrar cliente
	@DeleteMapping ("/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.delete(id);
	}
	
}
