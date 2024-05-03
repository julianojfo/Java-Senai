package br.com.poo;

public class Pessoa {
	//atributos
	public String nome;
	public String cpf;
	public String rg;
	public String profissao;
	public String telefone;
	public char genero;
	public int idade;
	public double altura;
	
	//métodos -- métodos são as ações
	public void cumprimentar() {
		System.out.println("Olá, meu nome é: " + this.nome + ".");
		System.out.println("Tenho " + this.idade + " anos, trabalho como " + this.profissao + " e tenho " + this.altura + " metros de altura.");
	}
	
	public void retribuir(String nome) {
		System.out.println("Olá " + nome + ". Eu sou " + this.nome + ".");
		System.out.println("É um prazer. Tenho " + this.idade + " anos e trabalho como " + this.profissao + ".");
	}
	
}
