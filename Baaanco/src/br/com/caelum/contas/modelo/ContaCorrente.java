package br.com.caelum.contas.modelo;

import br.com.caelum.javafx.api.util.Evento;

public class ContaCorrente extends Conta {
	
	
	public void criaConta(Evento evento){
		String tipo = evento.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente")) {
		//complete o código
		}
	}

}
