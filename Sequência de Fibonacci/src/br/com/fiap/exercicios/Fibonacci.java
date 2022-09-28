package br.com.fiap.exercicios;

public class Fibonacci {
	public static void main(String[] args) {
		
		int fibonacciA = 0;
		int fibonacciB = 1;
		int guardar;
		
		for (int i = 0; i <= 30; i++) {
			System.out.println(fibonacciA);
			guardar = fibonacciA;
			fibonacciA = fibonacciA + fibonacciB;
			fibonacciB = guardar;
			
		}
	}
}
