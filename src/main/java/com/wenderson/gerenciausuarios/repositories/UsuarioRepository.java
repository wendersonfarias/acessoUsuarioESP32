package com.wenderson.gerenciausuarios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wenderson.gerenciausuarios.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
