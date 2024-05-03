package br.com.entrada;

public class Pessoa {
	
	//atributos
	public String nome;
	public String cidade;
	public String profissao;
	public int idade;
	
	//metodos
	public void apresentar() {
		System.out.println("Olá, me chamo " + this.nome + ".");
	}
	
	public void responderCumprimento(String nome) {
		System.out.println("Olá " + nome + ", me chamo " + this.nome + ".");
	}
	
	public void responderCidade() {
		System.out.println("Moro na cidade " + this.cidade + ".");
	}
	
	public void responderProfissao() {
		System.out.println("Trabalho como " + this.profissao + ".");
	}
	
	public void responderIdade() {
		System.out.println("Eu tenho " + this.idade + " anos.");
	}
	
	public void perguntarNome() {
		System.out.println("Qual é o seu nome?");
	}
	
	public void perguntarCidade(String nome) {
		System.out.println("Onde você mora, " + nome + "?");
	}
	
	public void perguntarProfissao(String nome) {
		System.out.println("Trabalha como quê, " + nome + "?");
	}
	
	public void perguntarIdade(String nome) {
		System.out.println("Qual sua idade, " + nome + "?");
	}
	

}
