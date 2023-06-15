package com.wenderson.gerenciausuarios.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenderson.gerenciausuarios.domain.Usuario;
import com.wenderson.gerenciausuarios.dtos.UsuarioDTO;
import com.wenderson.gerenciausuarios.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

	@Autowired
	UsuarioService service;
	
	@GetMapping(value="/{matricula}")
	public ResponseEntity<Usuario> findbyMatricula(@PathVariable String matricula){
		Usuario obj = this.service.findByMatricula(matricula);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value="/busca-usuario/{id}")
	public ResponseEntity<Usuario> findbyIdFront(@PathVariable Integer id){
		Usuario obj = this.service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> findAll(){
		List<Usuario> lista = service.findAll();
		List<UsuarioDTO> listaDTO = lista.stream().map(usuario -> new UsuarioDTO(usuario)).collect(Collectors.toList());
			
		return ResponseEntity.ok().body(listaDTO);
		
	}
}
