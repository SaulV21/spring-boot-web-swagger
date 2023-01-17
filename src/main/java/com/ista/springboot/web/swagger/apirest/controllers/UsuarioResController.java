package com.ista.springboot.web.swagger.apirest.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ista.springboot.web.swagger.apirest.models.entity.Usuario;
import com.ista.springboot.web.swagger.apirest.models.service.IUsuarioService;



@CrossOrigin (origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioResController {
	@Autowired
	private IUsuarioService usuarioService;
	
	//listar
	@GetMapping
	public List <Usuario> listar() {
		List<Usuario> usuarios = StreamSupport.stream(
				usuarioService.findAll().spliterator(),false)
				.collect(Collectors.toList());
		return usuarios;
	}
	
	//Buscar 
		@GetMapping("/{id}")
		public ResponseEntity<?> show(@PathVariable(value="id") Long idcli) {
			Optional<Usuario> ucliente=usuarioService.findbyId(idcli);
			if(!ucliente.isPresent()) {
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok(ucliente);
		}
	
	//editar
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Usuario user, @PathVariable (value="id") Long idcli) {
		Optional<Usuario> userAct=usuarioService.findbyId(idcli);
		if(!userAct.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		userAct.get().setNombre(user.getNombre());
		userAct.get().setApellido(user.getApellido());
		userAct.get().setEmail(user.getEmail());
		userAct.get().setEnabled(user.getEnabled());
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(userAct.get()));
	}
	
	
	//guardar
		@PostMapping
	    public ResponseEntity<?> guardar(@RequestBody Usuario u){
	          return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(u));
	    }
	
	//borrar
	@DeleteMapping ("/{id}")
	public ResponseEntity<?> delete(@PathVariable (value="id") Long id) {
		if(!usuarioService.findbyId(id).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		usuarioService.delete(id);
		return ResponseEntity.ok().build();
	}
	
}
