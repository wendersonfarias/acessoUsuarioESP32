package com.wenderson.gerenciausuarios.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wenderson.gerenciausuarios.domain.Usuario;
import com.wenderson.gerenciausuarios.repositories.UsuarioRepository;
import com.wenderson.gerenciausuarios.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario findById(Integer id) {
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.orElseThrow( () ->new ObjectNotFoundException("Usuario nao encontrado! id: "+id));
		
	}
	
	public Usuario findByMatricula(String matricula) {
		Optional<Usuario> obj = usuarioRepository.findByMatricula(matricula);
		return obj.orElseThrow( () ->new ObjectNotFoundException("Usuario nao encontrado! id: "+matricula));
		
	}
	
	public Usuario createUsuario(Usuario usuario) {
		usuario.setId(null);
		return usuarioRepository.save(usuario);
		
	}

	public List<Usuario> findAll() {
		
		return usuarioRepository.findAll();
	}

}
