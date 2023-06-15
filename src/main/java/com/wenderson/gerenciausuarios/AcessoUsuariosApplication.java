package com.wenderson.gerenciausuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wenderson.gerenciausuarios.domain.Usuario;
import com.wenderson.gerenciausuarios.repositories.UsuarioRepository;

@SpringBootApplication
public class AcessoUsuariosApplication implements CommandLineRunner{
	@Autowired
	private UsuarioRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AcessoUsuariosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario user = new Usuario(null, "123546", "1234",	'a');
		userRepository.save(user);
		
	}

}
