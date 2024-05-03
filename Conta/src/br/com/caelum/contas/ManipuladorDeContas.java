package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	private Conta conta;
	
	public void criarConta() {
		Conta conta = new Conta();
		conta.setAgencia("1234");
		conta.setNumeroConta(56479);
		conta.setTitular("Juliano Ferreira de Oliveira");		
	}
	public void deposita(Evento evento){
		double valorDigitado = evento.getDouble("valor");
		this.conta.deposita(valorDigitado);
		}

}
