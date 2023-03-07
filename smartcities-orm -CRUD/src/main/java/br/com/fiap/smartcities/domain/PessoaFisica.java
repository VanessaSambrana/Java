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
@Table(name = "TB_PESSOA_FISICA")
public class PessoaFisica {
	
	@Id
	@SequenceGenerator(name="pessoa_fisica",sequenceName="sq_tb_pessoa_fisica",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pessoa_fisica")
	@Column(name="id_pessoa_física")
	private Integer id;
	
	@Column(name="nm_nome")
	private String Nome;
	
	@Column(name="dc_cpf")
	private Integer CPF;
	
	@Column(name="dt_nascimento")
	private Calendar dataNascimento;
	
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

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Integer getCPF() {
		return CPF;
	}

	public void setCPF(Integer cPF) {
		CPF = cPF;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(Integer id, String nome, Integer cPF, Calendar dataNascimento, Integer telefone, String endereco,
			String email) {
		super();
		this.id = id;
		Nome = nome;
		CPF = cPF;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
	}
	

}
