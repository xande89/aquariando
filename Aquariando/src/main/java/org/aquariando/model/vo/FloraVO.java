package org.aquariando.model.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FLORA")
public class FloraVO extends AbstractVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 105064040287407102L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="ID_AQUARIO")
	private Integer idAquario;
	
	@Column(name="DESCRICAO")
	private String descricao;
	
	@Column(name="DATA")
	private Date data;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdAquario() {
		return idAquario;
	}

	public void setIdAquario(Integer idAquario) {
		this.idAquario = idAquario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
