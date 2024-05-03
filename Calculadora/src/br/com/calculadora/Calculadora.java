package br.com.calculadora;

//Importar biblioteca
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciar Objeto
		Scanner leia = new Scanner(System.in);
		
		//declaração variaveis
		double x, y, result;
		int opcao;
		
		//Faça enquanto
		do {
			//entrada de dados
			System.out.println("Informe o 1º número:");
			x = leia.nextDouble();
			System.out.println("Informe o 2º número:");
			y = leia.nextDouble();
			
			//Limpeza de buffer
			leia.nextLine();
			
			//mostrar as opções
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Soma.");
			System.out.println("2 - Subtração.");
			System.out.println("3 - Multiplicação.");
			System.out.println("4 - Divisão.");
			System.out.println("5 - Sair.");
			opcao = leia.nextInt();
			
			//escolha caso
			switch(opcao) {
			case 1:
				result = x + y;
				System.out.println("A soma é: " + result + ".");
				break;
			case 2:
				result = x - y;
				System.out.println("A subtração é: " + result + ".");
				break;
			case 3:
				result = x * y;
				System.out.println("A multiplicação é: " + result + "." );
				break;
			case 4:
				result = x / y;
				System.out.println("A divisão é: " + result + ".");
				break;
			case 5:
				System.out.println("Programa encerrado.");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
			
			
		} while (opcao != 5);

	}
	
	
}
