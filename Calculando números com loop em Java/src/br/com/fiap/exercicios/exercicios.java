package br.com.fiap.exercicios;

import java.util.Scanner;

public class exercicios {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero[]  = new int[20];
		int soma = 0;
		int total = 0;
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite um numero");
			numero[i] = sc.nextInt();	
		}
		
		for (int i = 0; i < numero.length; i++) {
			soma += numero[i];
		}
		
		System.out.println("A soma é " + soma);
	}
}	





