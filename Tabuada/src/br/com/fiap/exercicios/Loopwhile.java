package br.com.fiap.exercicios;

import java.util.Scanner;

public class Loopwhile {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int numero;
			
			System.out.println("Informe o número da tabuada desejada: ");
			numero = sc.nextInt();
			
			int multiplicacao = 1;
			
			while(multiplicacao <= 12) {
				int resultado = numero * multiplicacao;
				System.out.println(numero + "x" + multiplicacao + "=" + resultado);
				multiplicacao++;
			}
		}
	}
}

