package br.com.fiap.smartcities.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PESSOA_JURIDICA")
public class PessoaJuridica {
	
	@Id
	@SequenceGenerator(name="pessoa_juridica",sequenceName="sq_tb_pessoa_juridica",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pessoa_juridica")
	@Column(name="id_pessoa_juridica")
	private Integer id;
	
	@Column(name="nm_nomeEmpresa")
	private String nomeEmpresa;
	
	@Column(name="dc_cnpj")
	private Integer CNPJ;
	
	@Column(name="tf_telefone")
	private Integer telefone;
	
	@Column(name="end_endereco")
	private String endereco;
	
	@Column(name="end_email")
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public Integer getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(Integer cNPJ) {
		CNPJ = cNPJ;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaJuridica(Integer id, String nomeEmpresa, Integer cNPJ, Integer telefone, String endereco,
			String email) {
		super();
		this.id = id;
		this.nomeEmpresa = nomeEmpresa;
		CNPJ = cNPJ;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
	}

}
