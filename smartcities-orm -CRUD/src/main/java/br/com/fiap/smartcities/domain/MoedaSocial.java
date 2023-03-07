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
@Table(name = "TB_MOEDA_SOCIAL")
public class MoedaSocial {
	
	@Id
	@SequenceGenerator(name="moeda_social",sequenceName="sq_tb_moeda_social",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="moeda_social")
	@Column(name="id_moeda_social")
	private Integer id;
	
	@Column(name="nm_nome_moeda")
	private String nomeMoeda;
	
	@Column(name="vl_cotacao_moeda")
	private Double cotacaoMoeda;
	
	@Column(name="dt_lancamento")
	private Calendar dataLancamento;
	
	@Column(name="st_status_moeda")
	private Double statusMoeda;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeMoeda() {
		return nomeMoeda;
	}

	public void setNomeMoeda(String nomeMoeda) {
		this.nomeMoeda = nomeMoeda;
	}

	public Double getCotacaoMoeda() {
		return cotacaoMoeda;
	}

	public void setCotacaoMoeda(Double cotacaoMoeda) {
		this.cotacaoMoeda = cotacaoMoeda;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Double getStatusMoeda() {
		return statusMoeda;
	}

	public void setStatusMoeda(Double statusMoeda) {
		this.statusMoeda = statusMoeda;
	}

	public MoedaSocial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MoedaSocial(Integer id, String nomeMoeda, Double cotacaoMoeda, Calendar dataLancamento, Double statusMoeda) {
		super();
		this.id = id;
		this.nomeMoeda = nomeMoeda;
		this.cotacaoMoeda = cotacaoMoeda;
		this.dataLancamento = dataLancamento;
		this.statusMoeda = statusMoeda;
	}

}
