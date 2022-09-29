package br.com.fiap.exercicios;

import java.util.Scanner;

public class MediaTemperatura {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int temperatura[] = new int[24];
		int soma = 0;
		
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("Digite a temperatura atual");
			temperatura[i] = sc.nextInt();	
		}
		
		for (int i = 0; i < temperatura.length; i++) {
			soma += temperatura[i];
		}
		
		System.out.println("A média de temperatura durante o dia foi de: " + soma/temperatura.length);

	}	
}
