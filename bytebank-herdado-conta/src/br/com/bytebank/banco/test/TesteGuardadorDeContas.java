package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(11, 22);
		
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(23, 33);
		
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQtdeElement();
		
		System.out.println(tamanho);
		
		Conta ref = guardador.getRef(0);
		
		System.out.println(ref);

	}

}
