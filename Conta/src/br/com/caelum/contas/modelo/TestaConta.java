package br.com.caelum.contas.modelo;

import javax.swing.JOptionPane;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		
		//Captura dos dados para criar uma nova conta
		String titular = JOptionPane.showInputDialog("Digite" + "o nome do titular da conta:");
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da agência:"));
		String agencia = JOptionPane.showInputDialog("Digite a agência da conta:");
		conta.setTitular(titular);
		conta.setNumeroConta(numero);
		conta.setAgencia(agencia);
		//conta.deposita(saldo);
		
		// Imprime os dados da conta
        JOptionPane.showMessageDialog(null, "Titular: " + conta.getTitular() + "\nAgência: " + conta.getAgencia() + "\nConta: " + conta.getNumeroConta());   
		
		
		//Deposito incial
		double depositoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito inicial"));
		conta.deposita(depositoInicial);
		
        
		//Menu de operações
        String menu = "Escolha uma operação: \n";
        menu += "1. Consultar saldo\n";
        menu += "2. Realizar depósito\n";
        menu += "3. Realizar saque\n";
        menu += "4. Transferir valor para outra conta\n";
        menu += "5. Visualizar dados da conta\n";
        menu += "6. Sair";
        
        int opcao;
        do {
        	opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        	switch(opcao) {
        	case 1:
        		JOptionPane.showMessageDialog(null, "Saldo atual: " + conta.getSaldo());
        		break;
        	case 2:
        		double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
        		conta.deposita(valorDeposito);
        		JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso!");
        		break;
        	case 3:
        		double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para saque: "));
        		if(conta.sacar(valorSaque)) {
        			JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
        		} else {
        			JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        		}
        		break;
        	case 4:
        		JOptionPane.showMessageDialog(null, "Essa funcionalidade ainda não foi implementada");
        		break;
        	case 5:
        		JOptionPane.showMessageDialog(null, conta.recuperaDadosParaImpressao());
        		break;
        	case 6:
        		JOptionPane.showMessageDialog(null, "Saindo da conta...");
        		break;
        	}
        }while (opcao != 6);
	}

}
