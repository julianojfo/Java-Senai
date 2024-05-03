package br.com.caelum.contas.modelo;

public class TestaGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente();
		//podemos chamar métodos de funcionários
		gerente.setNome("João da Silva");
		//e também métodos de gerente
		gerente.setSenha(4231);

	}

}
