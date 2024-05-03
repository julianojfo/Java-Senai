package br.com.conta;

public class Fibonacci {
	/*
	//metodo
	public int calculaFibonacci(int n) {
		if (n <= 2) {
			return 1;
		} else {
			return calculaFibonacci(n-1) + calculaFibonacci(n-2);
		}
	}
	*/
	//fibonacci ternario
	public int calculaFibonacci(int n) {
		return (n <=2) ? 1 : calculaFibonacci(n-1) + calculaFibonacci(n-2);
	}
	

}
