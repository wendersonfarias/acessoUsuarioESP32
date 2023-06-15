package com.wenderson.gerenciausuarios.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.wenderson.gerenciausuarios.domain.Usuario;
import com.wenderson.gerenciausuarios.repositories.UsuarioRepository;

@Service
public class DBService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Bean
	public void instanciaDb() {
		Usuario usuario = new Usuario(null, "123456", "1542", 'a');
		Usuario usuario1 = new Usuario(null, "123457", "1543", 'a');

		usuarioRepository.saveAll(Arrays.asList(usuario, usuario1));

	}
}
