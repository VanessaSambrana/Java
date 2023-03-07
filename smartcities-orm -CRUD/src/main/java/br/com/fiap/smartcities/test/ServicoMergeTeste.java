package br.com.fiap.smartcities.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.Servico;

public class ServicoMergeTeste {
	
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities-orm");
		EntityManager em = fabrica.createEntityManager();
		
		Servico servico = new Servico(1, "Itanhaem");
		
		System.out.println(servico.getId() + " " + servico.getNomeMunicipio());
		
		em.merge(servico);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
		
	}

}
