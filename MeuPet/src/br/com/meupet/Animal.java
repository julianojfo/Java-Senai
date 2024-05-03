package br.com.meupet;

public class Animal {
	//atributos
	public String nome;
	public String tipoAnimal;
	public String raca;
	public String nomeDono;
	public int idade;
	
	//metodo
	public void apresentar() {
		System.out.println("Olá, segue a lista com os dados do pet: " + "\nNome: " + this.nome + ".\n" + "Tipo do Animal: " + this.tipoAnimal + ".\n" + "Raça: " + this.raca + ".\n" + "Nome do dono: " + this.nomeDono + ".\n" + "Idade: " + this.idade + ".\n" );
	}
	
	public void emitirSom() {
		System.out.println("Au! Au! Grrrr!");
	}

}