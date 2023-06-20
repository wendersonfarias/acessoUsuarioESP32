package com.wenderson.gerenciausuarios.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenderson.gerenciausuarios.services.AdministrativoService;

@RestController
@RequestMapping(value = "/adm")
public class AdministraticoResource {

	@Autowired
	AdministrativoService service;

	@GetMapping(value="/{senha}")
	public ResponseEntity<Boolean> verificaSenha(@PathVariable String senha){
		Boolean resposta = this.service.findById(senha);
		
		return ResponseEntity.ok().body(resposta);
	}
	
	
}
