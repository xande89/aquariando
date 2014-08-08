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
@Table(name="ILUMINACAO")
public class IluminacaoVO extends AbstractVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2629133498383133749L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="ID_AQUARIO")
	private Integer idAquario;
	
	@Column(name="QTD_LAMPADAS")
	private Integer quantidadeLampadas;
	
	@Column(name="TP_LAMPADAS")
	private String tipoLampada;
	
	@Column(name="INTENSIDADE")
	private String intensidade;
	
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
	public Integer getQuantidadeLampadas() {
		return quantidadeLampadas;
	}
	public void setQuantidadeLampadas(Integer quantidadeLampadas) {
		this.quantidadeLampadas = quantidadeLampadas;
	}
	public String getTipoLampada() {
		return tipoLampada;
	}
	public void setTipoLampada(String tipoLampada) {
		this.tipoLampada = tipoLampada;
	}
	public String getIntensidade() {
		return intensidade;
	}
	public void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
}
