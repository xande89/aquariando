package org.aquariando.model.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class UsuarioVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7085238025170118798L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="NOME",length=48)
	@NotEmpty
	@Size(max=48)
	private String nome;
	
	@Column(name="EMAIL",length=48)
	@NotEmpty
	@Size(max=48)
	private String email;
	
	@Column(name="SENHA",length=48)
	@NotEmpty
	@Size(max=48)
	private String senha;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
