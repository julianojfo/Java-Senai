package br.com.conta;

public class Conta {
	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

	void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

}
