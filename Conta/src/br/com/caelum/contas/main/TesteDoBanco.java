package br.com.caelum.contas.main;
import br.com.caelum.contas.Banco;

public class TesteDoBanco {

	public static void main(String[] args) {
		br.com.caelum.contas.Banco meuBanco = new br.com.caelum.contas.Banco();
		meuBanco.nome = "Banco do Jujuzera";
		System.out.println(meuBanco.nome);
		}

}
