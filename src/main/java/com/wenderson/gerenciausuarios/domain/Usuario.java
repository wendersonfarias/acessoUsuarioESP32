package com.wenderson.gerenciausuarios.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 653495207641280524L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	
	@Column(unique = true)
	protected String matricula;
	
	@NotBlank
	protected String senha;
	
	@NotBlank
	protected char ativo;
	
	public Usuario() {
		super();
	}

	public Usuario(Integer id, String matricula, String senha, char ativo) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.senha = senha;
		this.ativo = ativo;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public char getAtivo() {
		return ativo;
	}

	public void setAtivo(char ativo) {
		this.ativo = ativo;
	}
	
	
	
	
	
	
}
