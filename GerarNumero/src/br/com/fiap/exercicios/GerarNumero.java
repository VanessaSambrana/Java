package br.com.fiap.exercicios;

import java.util.Random;

public class GerarNumero {
	public static void main(String[] args) {

		Random random = new Random();
		
		int numero[] = new int[15];
		
		for (int i = 1; i <= numero.length; i++) {
			int numeroInteiro = random.nextInt(100);
			System.out.println(i + " " + "número inteiro = " + numeroInteiro);
		}
	}	
}
	
