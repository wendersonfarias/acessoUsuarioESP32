package com.wenderson.gerenciausuarios.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenderson.gerenciausuarios.domain.Usuario;
import com.wenderson.gerenciausuarios.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Usuario> findbyId(@PathVariable Integer id){
		Usuario obj = this.usuarioService.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}
}
