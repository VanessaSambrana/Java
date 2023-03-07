package br.com.fiap.smartcities.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRODUTOS")
public class Produtos {
	
	@Id
	@SequenceGenerator(name="produtos",sequenceName="sq_tb_produtos",allocationSize=1)
	@Column(name="nm_nome_produto")
	private String nomeProduto;
	
	@Column(name="dc_descricao_produto")
	private String descricaoProduto;
	
	@Column(name="vl_produto")
	private Double valorProduto;
	
	@Column(name="es_estoque_produto")
	private Integer estoqueProduto;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public Double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public Integer getEstoqueProduto() {
		return estoqueProduto;
	}

	public void setEstoqueProduto(Integer estoqueProduto) {
		this.estoqueProduto = estoqueProduto;
	}
	
	public Produtos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produtos(String nomeProduto, String descricaoProduto, Double valorProduto, Integer estoqueProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoProduto;
		this.valorProduto = valorProduto;
		this.estoqueProduto = estoqueProduto;
	}

}
