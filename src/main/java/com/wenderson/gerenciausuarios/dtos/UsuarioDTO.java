package com.wenderson.gerenciausuarios.dtos;



import java.io.Serializable;

import javax.persistence.Column;

import com.wenderson.gerenciausuarios.domain.Usuario;


public class UsuarioDTO implements Serializable {
	private static final long serialVersionUID = 653495207641280524L;

	protected Integer id;

	@Column(unique = true)
	protected String matricula;

	protected char ativo;

	public UsuarioDTO() {
		super();
	}

	public UsuarioDTO(Usuario usuario) {
		super();
		this.id = usuario.getId();
		this.matricula = usuario.getMatricula();
		this.ativo = usuario.getAtivo();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public char getAtivo() {
		return ativo;
	}

	public void setAtivo(char ativo) {
		this.ativo = ativo;
	}

}
