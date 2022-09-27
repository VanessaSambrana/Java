package br.com.fiap.exercicios;

import java.util.Scanner;

public class LoopFor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe o número da tabuada desejada: ");
		numero = sc.nextInt();
		
		for (int i = 1; i <= 12; i++) {
			System.out.println(numero + "X" + i + "=" + (numero*i));

			
		}
		
	}
}	

