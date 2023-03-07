package br.com.fiap.smartcities.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.Servico;

public class ServicoConsultarTeste {
	
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities-orm");
		EntityManager em = fabrica.createEntityManager();
		
		Servico servico = em.find(Servico.class, 1);
		
		System.out.println(servico.getId() + " " + servico.getNomeMunicipio());
		
		em.close();
		fabrica.close();
		
	}

}
