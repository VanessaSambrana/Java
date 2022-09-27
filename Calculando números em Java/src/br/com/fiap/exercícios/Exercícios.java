package br.com.fiap.exercícios;

import java.util.Scanner;

public class Exercícios {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcao;
		do {
			System.out.println("Digite um numero");
			int n1 = sc.nextInt();
			System.out.println("Digite outro numero");
			int n2 = sc.nextInt();
			int soma = n1 + n2;
			System.out.println("A soma é " + soma);
			System.out.println("Deseja somar outro numero? (s/n)");
			opcao = sc.next();
		}
		while(opcao.equals("S"));
		sc.close();
	}
		
}
