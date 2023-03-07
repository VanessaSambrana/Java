package br.com.fiap.smartcities.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CAMBIO_SOCIAL")
public class CambioSocial {
	
	@Id
	@SequenceGenerator(name="cambio_social",sequenceName="sq_tb_cambio_social",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cambio_social")
	@Column(name="id_cambio_social")
	private Integer id;
	
	@Column(name="id_moeda")
	private Integer idMoeda;
	
	@Column(name="id_produto")
	private Integer idProduto;
	
	@Column(name="qt_quantidade")
	private Integer quantidade;
	
	@Column(name="dt_data_transacao")
	private Calendar dataTransacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdMoeda() {
		return idMoeda;
	}

	public void setIdMoeda(Integer idMoeda) {
		this.idMoeda = idMoeda;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Calendar getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(Calendar dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public CambioSocial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CambioSocial(Integer id, Integer idMoeda, Integer idProduto, Integer quantidade, Calendar dataTransacao) {
		super();
		this.id = id;
		this.idMoeda = idMoeda;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.dataTransacao = dataTransacao;
	}

}
