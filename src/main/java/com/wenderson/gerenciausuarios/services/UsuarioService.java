package com.wenderson.gerenciausuarios.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wenderson.gerenciausuarios.domain.Usuario;
import com.wenderson.gerenciausuarios.repositories.UsuarioRepository;
import com.wenderson.gerenciausuarios.services.exceptions.DataIntegrityViolationException;
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
		validaPorMatricula(usuario);
		usuario.setId(null);
		return usuarioRepository.save(usuario);
		
	}

	private void validaPorMatricula(Usuario usuario) {
		Optional<Usuario> obj = usuarioRepository.findByMatricula(usuario.getMatricula());
		if(obj.isPresent() && obj.get().getMatricula() != usuario.getMatricula() ) {
			throw new DataIntegrityViolationException("MATRICULA ja cadastrada no sistema!");
		}
	}

	public List<Usuario> findAll() {
		
		return usuarioRepository.findAll();
	}

	public Usuario update(@Valid Usuario usuario) {
		Usuario user = findByMatricula(usuario.getMatricula());
		user.setAtivo(usuario.getAtivo());
		return usuarioRepository.save(user);
	}

	public void delete(String matricula) {
		Usuario user = findByMatricula(matricula);
		usuarioRepository.deleteById(user.getId());
	}

}
