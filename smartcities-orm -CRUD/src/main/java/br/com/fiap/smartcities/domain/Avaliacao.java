package br.com.fiap.smartcities.domain;

import java.util.Calendar;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_AVALIACAO")
public class Avaliacao {
	
	@Id
	@SequenceGenerator(name="avaliacao",sequenceName="sq_tb_avaliacao",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="avaliacao")
	@Column(name="id_avaliacao_servico")
	private Integer idServico;

	@Column(name="id_pedido")
	private Integer pedido;

	@Column(name="nt_nota")
	private Integer nota;
	
	@Column(name="cm_comentario")
	private String comentario;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_avaliacao")
	private Calendar dataAvaliacao;
	
	@OneToMany(mappedBy = "avaliacao")
	private Collection<Servico> servicos;

	public Integer getIdServico() {
		return idServico;
	}

	public void setIdServico(Integer idServico) {
		this.idServico = idServico;
	}

	public Integer getPedido() {
		return pedido;
	}

	public void setPedido(Integer pedido) {
		this.pedido = pedido;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Calendar getDataAvaliacao() {
		return dataAvaliacao;
	}

	public void setDataAvaliacao(Calendar dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}

	public Collection<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(Collection<Servico> servicos) {
		this.servicos = servicos;
	}

	
	public Avaliacao() {
		super();
	}
	
	public Avaliacao(String comentario) {
	      this.comentario = comentario;
	   }

	public Avaliacao(Integer idServico, Integer pedido, Integer nota, String comentario, Calendar dataAvaliacao,
			Collection<Servico> servicos) {
		super();
		this.idServico = idServico;
		this.pedido = pedido;
		this.nota = nota;
		this.comentario = comentario;
		this.dataAvaliacao = dataAvaliacao;
		this.servicos = servicos;
	}
	
	
	
}
