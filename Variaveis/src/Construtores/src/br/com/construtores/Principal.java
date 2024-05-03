package br.com.construtores;

// importa a biblioteca de entrada de dados
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// instanciando os objetos
		Scanner leia = new Scanner(System.in);
		Pessoa programador = new Pessoa();
		Pessoa usuario = new Pessoa(1, "Masculino");
		Pessoa npc = new Pessoa(2, "Leia", "999.999.999-99", "Bancaria", "Virtual", 18);
				
		// entrada de dados
		System.out.println("Informe o nome:");
		usuario.nome = leia.nextLine();
		System.out.println("Informe o CPF:");
		usuario.cpf = leia.nextLine();
		System.out.println("Informe a profissao:");
		usuario.profissao = leia.nextLine();
		System.out.println("Informe a idade:");
		usuario.idade = leia.nextInt();
		
		leia.nextLine();
		
		// entrada de dados
		System.out.println("Informe o nome do programador:");
		programador.nome = leia.nextLine();
		System.out.println("Informe o CPF do programador:");
		programador.cpf = leia.nextLine();
		System.out.println("Informe a profissao do programador:");
		programador.profissao = leia.nextLine();
		System.out.println("Informe a idade do programador:");
		programador.idade = leia.nextInt();
		
				
				
		//Saida de dados
		System.out.println("Nome do usuario: " + usuario.nome + ".");
		System.out.println("CPF do usuario: " + usuario.cpf + ".");
		System.out.println("Profissão do usuario: " + usuario.profissao + ".");
		System.out.println("Genero do usuario: " + usuario.genero + ".");
		System.out.println("Idade do usuario: " + usuario.idade + ".");
			
		//Saida de dados do npc
		System.out.println("Nome do NPC: " + npc.nome + ".");
		System.out.println("CPF do NPC: " + npc.cpf + ".");
		System.out.println("Profissão do NPC: " + npc.profissao + ".");
		System.out.println("Genero do NPC: " + npc.genero + ".");
		System.out.println("Idade do NPC: " + npc.idade + ".");
		
		//Saida de dados programador
		System.out.println("Nome do usuario: " + programador.nome + ".");
		System.out.println("CPF do usuario: " + programador.cpf + ".");
		System.out.println("Profissão do usuario: " + programador.profissao + ".");
		System.out.println("Genero do usuario: " + programador.genero + ".");
		System.out.println("Idade do usuario: " + programador.idade + ".");
				
		//fecha o objeto leia
		leia.close();
	

	}

}
