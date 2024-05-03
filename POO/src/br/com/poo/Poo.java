package br.com.poo;

public class Poo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanciar objeto pessoa
		Pessoa humano = new Pessoa();
		Pessoa humana = new Pessoa();
		
		//Definindo Valores do objeto
		humano.nome = "Fulano de Tal";
		humano.idade = 18;
		humano.cpf = "403.616.470-85";
		humano.rg = "4.985.982-02";
		humano.profissao = "Programador";
		humano.telefone = "(61) 93154-8596";
		humano.genero = 'M';
		humano.altura = 1.62;	
		
		/*//saida de dados -- 1ª AULA MOSTRANDO A SAÍDA DE DADOS SIMPLES
		System.out.println("Dados da humano:\n");
		System.out.println("Nome: " + humano.nome + ".");
		System.out.println("Idade: " + humano.idade + ".");
		System.out.println("Gênero: " + humano.genero + ".");
		System.out.println("Altura: " + humano.altura + ".");
		System.out.println("CPF: " + humano.cpf + ".");
		System.out.println("RG: " + humano.rg + ".");
		System.out.println("Telefone: " + humano.telefone + ".");
		System.out.println("Profissão: " + humano.profissao + ".");*/
		
		//Definindo Valores do objeto
		humana.nome = "Fulana de Tal";
		humana.idade = 19;
		humana.cpf = "358.615.550-60";
		humana.rg = "24.284.026-7";
		humana.profissao = "Analista";
		humana.telefone = "(61) 98114-8596";
		humana.genero = 'F';
		humana.altura = 1.58;	
				
		/*//saida de dados -- 1ª AULA MOSTRANDO A SAÍDA DE DADOS SIMPLES
		System.out.println("\nDados da humana:\n");
		System.out.println("Nome: " + humana.nome + ".");
		System.out.println("Idade: " + humana.idade + ".");
		System.out.println("Gênero: " + humana.genero + ".");
		System.out.println("Altura: " + humana.altura + ".");
		System.out.println("CPF: " + humana.cpf + ".");
		System.out.println("RG: " + humana.rg + ".");
		System.out.println("Telefone: " + humana.telefone + ".");
		System.out.println("Profissão: " + humana.profissao + ".");*/
		
		//Saida de Dados
		humano.cumprimentar();
		humana.retribuir(humano.nome);
		

	}

}
