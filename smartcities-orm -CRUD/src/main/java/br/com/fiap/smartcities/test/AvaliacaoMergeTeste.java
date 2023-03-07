package br.com.fiap.smartcities.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.Avaliacao;

public class AvaliacaoMergeTeste {
	
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities-orm");
		EntityManager em = fabrica.createEntityManager();
		
		Avaliacao avaliacao = new Avaliacao("Ruim");
		
		System.out.println(avaliacao.getIdServico() + " " + avaliacao.getComentario());
		
		em.merge(avaliacao);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
		
	}

}
