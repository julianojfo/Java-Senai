package br.com.conta;

//importar classe Scanner
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciar objetos
		Scanner leia = new Scanner(System.in);
		Conta minhaConta = new Conta();
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.setDataAbertura(new Data());
		Fibonacci fibonacci = new Fibonacci();
		
		//Verificar metodos modo juliano old
		//depositar
		c1.depositar(1000.0);
		//sacar
		c1.sacar(500.0);
		//rendimento
		c1.rendimento();
		//nome titular
		c1.setTitular("Juliano Ferreira");
		//numero da conta
		c1.setNumeroConta(0001);
		//agencia
		c1.setAgencia("1010-2");
		
		c1.getDataAbertura().preencherData(21, 3, 2024);	
		System.out.println(c1.recuperaDadosParaImpressao());
		
		
		//Informações conta c2
		c2.setTitular("Juliano Ferreira");
		c2.setSaldo(500);
		
		if (c1 == c2) {
			System.out.println("Contas iguais.");
		} else {
			System.out.println("Contas diferentes.");
		}
		
		//fibonacci normal
		for (int i = 1; i <= 6; i ++) {
			int resultado = fibonacci.calculaFibonacci(i);
			System.out.println(resultado);
		}
		
		
	}

}
