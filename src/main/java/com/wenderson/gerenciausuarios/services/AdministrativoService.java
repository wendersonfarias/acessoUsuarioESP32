package com.wenderson.gerenciausuarios.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wenderson.gerenciausuarios.domain.Administrativo;
import com.wenderson.gerenciausuarios.repositories.AdministrativoRepository;

@Service
public class AdministrativoService {
	@Autowired
	private AdministrativoRepository administrativoRepository;
	
	public Boolean findById(String senha) {
		Optional<Administrativo> obj = administrativoRepository.findById(1);
		
		if(obj.get().getSenha().equals(senha)) {
			return true;
		}
		return false;
		
	}
	
	

}
