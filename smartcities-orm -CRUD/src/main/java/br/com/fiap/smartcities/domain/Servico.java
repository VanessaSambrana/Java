package br.com.fiap.smartcities.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "TB_SERVICO")
public class Servico {
	
	@Id
	@SequenceGenerator(name="servico",sequenceName="sq_tb_servico",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="servico")
	@Column(name="id_servico")
	private Integer id;

	@Column(name="nm_municipio")
	private String nomeMunicipio;

	@Column(name="dc_descricao_servico")
	private String descricao;
	
	@Column(name="vl_preco")
	private double preco;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_execucao")
	private Calendar dataExecucao;
	
	@Column(name="st_status")
	private String status;
	
	@JoinColumn(name = "id_avaliacao_servico")
	@ManyToOne
	private Avaliacao avaliacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Calendar getDataExecucao() {
		return dataExecucao;
	}

	public void setDataExecucao(Calendar dataExecucao) {
		this.dataExecucao = dataExecucao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	

	public Servico() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Servico(int id, String nome) {
	      this.id = id;
	      this.nomeMunicipio = nome;
	   }

	public Servico(Integer id, String nomeMunicipio, String descricao, double preco, Calendar dataExecucao,
			String status, Avaliacao avaliacao) {
		super();
		this.id = id;
		this.nomeMunicipio = nomeMunicipio;
		this.descricao = descricao;
		this.preco = preco;
		this.dataExecucao = dataExecucao;
		this.status = status;
		this.avaliacao = avaliacao;
	}

	

}
