package br.com.meupet;

public class MeuPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanciar objeto pessoa
		Animal pet = new Animal();
		
		//Definindo Valores Objeto
		pet.nome = "Choji";
		pet.tipoAnimal = "Cachorro";
		pet.raca = "Shitzu";
		pet.nomeDono = "Juliano";
		pet.idade = 2;
		
		//Saida de dados
		
		pet.apresentar();
		pet.emitirSom();
				
	}

}
