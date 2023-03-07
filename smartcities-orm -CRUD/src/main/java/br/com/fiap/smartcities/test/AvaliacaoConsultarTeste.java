package br.com.fiap.smartcities.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.Avaliacao;

public class AvaliacaoConsultarTeste {
	
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities-orm");
		EntityManager em = fabrica.createEntityManager();
		
		Avaliacao avaliacao = em.find(Avaliacao.class, 1);
		
		System.out.println(avaliacao.getIdServico() + " " + avaliacao.getComentario());
		
		em.close();
		fabrica.close();
		
	}

}
