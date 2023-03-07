package br.com.fiap.smartcities.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.Avaliacao;

public class AvaliacaoInserirTeste {
	
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities-orm");
		EntityManager em = fabrica.createEntityManager();
		
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setComentario("Muito bom");
		
		try {
			em.persist(avaliacao);
			em.getTransaction().begin();
			em.getTransaction().commit();
			}catch (Exception e) {
				if (em.getTransaction().isActive()) {
					em.getTransaction().rollback();
				}
			}
			
			em.close();
			fabrica.close();
		
	}
	
}
