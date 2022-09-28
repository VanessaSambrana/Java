package br.com.fiap.exercicios;

import java.util.Scanner;

public class NomesSalários {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario = 0;
		int contador = 0;
		int cont = 0;
		String opcao = "s";
		String nome = null;
		
		do {	
			  System.out.println("Digite o nome: ");
			  nome += sc.next();
			  cont += 1;
			
			  System.out.println("Digite o salário: ");
			  salario += sc.nextDouble();
			  contador += 1;
			  
			  System.out.println("Deseja informar outro funcionário? (s/n)");
			  opcao = sc.next();
			  System.out.println(opcao);
			} 
		while(opcao.equals("s"));
			
		  System.out.println("A quantidade de pessoas informadas foram: " + cont);
		  System.out.println("A média salarial entre elas é de: " + salario/contador);
		  sc.close();
	}
}
