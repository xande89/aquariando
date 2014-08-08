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
@Table(name="FILTRAGEM")
public class FiltragemVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3237322532182181762L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="ID_AQUARIO")
	private Integer idAquario;
	
	@Column(name="TP_FILTRO")
	private String tipoFiltro;
	
	@Column(name="VAZAO")
	private Integer vazao;
	
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

	public String getTipoFiltro() {
		return tipoFiltro;
	}

	public void setTipoFiltro(String tipoFiltro) {
		this.tipoFiltro = tipoFiltro;
	}

	public Integer getVazao() {
		return vazao;
	}

	public void setVazao(Integer vazao) {
		this.vazao = vazao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
