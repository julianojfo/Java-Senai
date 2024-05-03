package br.com.heranca;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		PessoaFisica usuario = new PessoaFisica();
		PessoaJuridica empresa = new PessoaJuridica();
		
		// entrada de dados da pessoa fisica
		System.out.println("Informe o nome: ");
		usuario.nome = leia.nextLine();
		System.out.println("Informe o cpf: ");
		usuario.cpf = leia.nextLine();
		System.out.println("Informe o endereço: ");
		usuario.endereco = leia.nextLine();
		System.out.println("Informe o telefone: ");
		usuario.telefone = leia.nextLine();
		System.out.println("Informe o email: ");
		usuario.email = leia.nextLine();
		
		// entrada de dados da pessoa juridica
		System.out.println("\nInforme a Razão Social da Empresa: ");
		empresa.razaoSocial = leia.nextLine();
		System.out.println("\nInforme o nome fantasia: ");
		empresa.nomeFantasia = leia.nextLine();
		System.out.println("\nInforme o CNPJ: ");
		empresa.cnpj = leia.nextLine();
		System.out.println("\nInforme o endereço da empresa: ");
		empresa.endereco = leia.nextLine();
		System.out.println("\nInforme o telefone da empresa: ");
		empresa.telefone = leia.nextLine();
		System.out.println("\nInforme o email da empresa: ");
		empresa.email = leia.nextLine();
		
		leia.nextLine();
				
				
		//Saida de dados da pessoa fisica
		System.out.println("Nome do usuario: " + usuario.nome + ".");
		System.out.println("CPF do usuario: " + usuario.cpf + ".");
		System.out.println("Endereco do usuario: " + usuario.endereco + ".");
		System.out.println("Telefone do usuario: " + usuario.telefone + ".");
		System.out.println("email do usuario: " + usuario.email + ".");
			
		
		//Saida de dados da pessoa juridica
		System.out.println("Razão Social da Empresa: " + empresa.razaoSocial + ".");
		System.out.println("Nome Fantasia da empresa: " + empresa.nomeFantasia + ".");
		System.out.println("Numero do cnpj: " + empresa.cnpj + ".");
		System.out.println("Endereço da empresa: " + empresa.endereco + ".");
		System.out.println("Telefone da empresa: " + empresa.telefone + ".");
		System.out.println("Email da empresa: " + empresa.email + ".");
				
		//fecha o objeto leia
		leia.close();
		
		

	}

}
