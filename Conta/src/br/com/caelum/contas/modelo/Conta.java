package br.com.caelum.contas.modelo;

public class Conta {
	//Definir Atributos
	private String titular;
	private String agencia;
	private Data dataAbertura;
	private int numeroConta;
	private double saldo;
	private double rendimento;
	private double valor;
	
	public Conta(){
		System.out.println("Construindo uma conta");
	}
	Conta(String titular, int numero, String agencia){
		this.titular = titular;
		this.setNumeroConta(numero);
		this.setAgencia(agencia);
		this.setDataAbertura(dataAbertura);
		this.setSaldo(1000);
		this.setValor(100);
	}
	//métodos
	//Sacar
	public boolean sacar(double valor) {
		if(valor > 0 && valor <= getSaldo()) {
			setSaldo(getSaldo() - valor);
			System.out.println("Saque de R$ " + valor + "realizado com sucesso.");
		}
		else {
			System.out.println("Saldo insuficiente ou valor informado inválido para realizar o saque.");
		}
	}
	//Rendimento
	public void rendimento() {
		rendimento = (getSaldo() * 0.1);
		System.out.println("O valor do rendimento é: R$ " + rendimento + ".");
	}
	//Imprimir Dados na Tela
	String recuperaDadosParaImpressao() {
		String dados = "\nTitular: " + this.getTitular();
		dados += "\nAgência " + this.getNumeroConta();
		dados += "\nSaldo " + this.getSaldo();
		dados += "\nData de abertura da conta: " + this.getDataAbertura().formatada();
		
		return dados;
	}
	
	//Data Abertura
	public Data getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void deposita(double depositoInicial) {
		this.saldo += valor;
		
	}

}
