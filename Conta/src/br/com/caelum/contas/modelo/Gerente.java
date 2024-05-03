package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;			
		}else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	//outros metodos

	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}

}
