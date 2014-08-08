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
@Table(name="PARAMETRO")
public class ParametroVO extends AbstractVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6338291373491556133L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	
	@Column (name = "ID_AQUARIO")
	private Integer aquario;
	
	public Integer getAquario() {
		return aquario;
	}
	public void setAquario(Integer aquario) {
		this.aquario = aquario;
	}
	@Column(name="KH")
	private Float kh;
	
	@Column(name="GH")
	private Float gh;
	
	@Column(name="PH")
	private Float ph;
	
	@Column(name="DATA")
	private Date data;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getKh() {
		return kh;
	}
	public void setKh(Float kh) {
		this.kh = kh;
	}
	public Float getGh() {
		return gh;
	}
	public void setGh(Float gh) {
		this.gh = gh;
	}
	public Float getPh() {
		return ph;
	}
	public void setPh(Float ph) {
		this.ph = ph;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
