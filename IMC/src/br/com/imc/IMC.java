package br.com.imc;

//importar Classe Scanner
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie um programa que calcule o IMC do usuário e retorne o diagnóstico da saúde do usuário, se está abaixo do peso, no peso ideal, se está acima do peso ou se está obeso
		double imc;
				
		//Instanciar objetos
		Scanner leia = new Scanner(System.in);
		Pessoa paciente = new Pessoa();
		
		//Entrada de Dados
		System.out.println("Informe seu nome:");
		paciente.nome = leia.nextLine();
		System.out.println("Informe seu peso:");
		paciente.peso = leia.nextDouble();
		System.out.println("Informe sua altura:");
		paciente.altura = leia.nextDouble();
		
		//processamento de dados IMC 
		imc = paciente.peso / (paciente.altura * paciente.altura);
		
		if (imc <= 18.5) {
			System.out.println("Seu imc é: " + imc + " Você está abaixo do peso ideal");
		}
		else if (imc >= 18.5 && imc <= 24.9){
			System.out.println("Seu imc é: " + imc + " Você está com peso normal");
		}
		else if (imc >= 25 && imc <= 29.9){
			System.out.println("Seu imc é: " + imc + " Você está com sobrepeso");
		}
		else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Seu imc é: " + imc + " Você está com Obesidade Grau I");
		}
		else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Seu imc é: " + imc + " Você está com Obesidade Grau II");
		}
		else if (imc >= 40) {
			System.out.println("Seu imc é: " + imc + " Você está com Obesidade Grau III");
		}
		
		leia.close();
		

	}

}
