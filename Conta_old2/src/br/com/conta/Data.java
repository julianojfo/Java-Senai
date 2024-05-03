package br.com.conta;

public class Data {
	
	//definir atributos
	
	private int dia;
	private int mes;
	private int ano;
	private Data dataAbertura;
	
	//metodos
	void preencherData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String formatada() {
		return this.dia + "/" + this.mes + "/" + this.ano + ".";
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

}
