package org.aquariando.model.vo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="Aquario")
@Table(name="AQUARIO")
@SequenceGenerator(name = "AQUARIO_SEQUENCE", sequenceName = "AQUARIO_SEQUENCE", allocationSize = 1, initialValue = 0)
public class AquarioVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3137179319736562917L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="AQUARIO_SEQUENCE")
	@Column(name="ID_AQUARIO")
	private Integer idAquario;
	
	@Column(name="LARGURA")
	private Float largura;
	
	@Column(name="ALTURA")
	private Float altura;
	
	@Column(name="COMPRIMENTO")
	private Float comprimento;
	
	@Column(name="ESPESSURA")
	private Float espessura;
	
	@Column(name="LITRAGEM")
	private Float litragem;
	
	@Column(name="ID_USUARIO")
	private UsuarioVO usuario;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="ID_AQUARIO")
	private List<ParametroVO> parametros;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="ID_AQUARIO")
	private List<IluminacaoVO> iluminacao;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="ID_AQUARIO")
	private List<FloraVO> flora;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="ID_AQUARIO")
	private List<FaunaVO> fauna;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="ID_AQUARIO")
	private List<EquipamentoVO> equipamentos;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="ID_AQUARIO")
	private List<SuprimentoVO> suprimentos;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="ID_AQUARIO")
	private List<FiltragemVO> filtragem;
	
	public Integer getId() {
		return idAquario;
	}
	public void setId(Integer idAquario) {
		this.idAquario = idAquario;
	}
	public Float getLargura() {
		return largura;
	}
	public void setLargura(Float largura) {
		this.largura = largura;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	public Float getComprimento() {
		return comprimento;
	}
	public void setComprimento(Float comprimento) {
		this.comprimento = comprimento;
	}
	public UsuarioVO getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioVO usuario) {
		this.usuario = usuario;
	}
	public Float getEspessura() {
		return espessura;
	}
	public void setEspessura(Float espessura) {
		this.espessura = espessura;
	}
	public Float getLitragem() {
		return litragem;
	}
	public void setLitragem(Float litragem) {
		this.litragem = litragem;
	}
	public List<ParametroVO> getParametros() {
		return parametros;
	}
	public void setParametros(List<ParametroVO> parametros) {
		this.parametros = parametros;
	}
	public List<IluminacaoVO> getIluminacao() {
		return iluminacao;
	}
	public void setIluminacao(List<IluminacaoVO> iluminacao) {
		this.iluminacao = iluminacao;
	}
	public List<FloraVO> getFlora() {
		return flora;
	}
	public void setFlora(List<FloraVO> flora) {
		this.flora = flora;
	}
	public List<FaunaVO> getFauna() {
		return fauna;
	}
	public void setFauna(List<FaunaVO> fauna) {
		this.fauna = fauna;
	}
	public List<EquipamentoVO> getEquipamentos() {
		return equipamentos;
	}
	public void setEquipamentos(List<EquipamentoVO> equipamentos) {
		this.equipamentos = equipamentos;
	}
	public List<SuprimentoVO> getSuprimentos() {
		return suprimentos;
	}
	public void setSuprimentos(List<SuprimentoVO> suprimentos) {
		this.suprimentos = suprimentos;
	}
	public List<FiltragemVO> getFiltragem() {
		return filtragem;
	}
	public void setFiltragem(List<FiltragemVO> filtragem) {
		this.filtragem = filtragem;
	}
	
}
