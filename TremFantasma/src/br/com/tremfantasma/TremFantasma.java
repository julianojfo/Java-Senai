package br.com.tremfantasma;

//importar classe Scanner
import java.util.Scanner;

public class TremFantasma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar objetos
		Scanner leia = new Scanner(System.in);
		Pessoa pagante = new Pessoa();
		
		//Entrada de dados
		System.out.println("Informe o nome:");
		pagante.nome = leia.nextLine();
		System.out.println("Informe a idade:");
		pagante.idade = leia.nextInt();
		System.out.println("Informe a altura:");
		pagante.altura = leia.nextDouble();
		
		//verificar idade e a altura
		if (pagante.idade >= 12 && pagante.altura >= 1.2) {
			//para entrar nesse bloco, as 2 condições devem ser verdadeiras utilizando um AND = &&
			System.out.println("Pague o valor de R$ 15,00.");
			pagante.dinheiro = leia.nextDouble();
			System.out.println(pagante.pagar(pagante.dinheiro));
		}
		else {
			System.out.println("Entrada proibida.");
		}

	}

}
