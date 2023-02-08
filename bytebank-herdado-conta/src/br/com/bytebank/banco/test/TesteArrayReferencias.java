package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Pablo H. H. Nunes");
		cliente.setProfissao("Programador");
		cliente.setCpf("080.557.459.00");
		
		referencias[2] = cliente.getNome();
		
		System.out.println(referencias[0]);
		System.out.println(referencias[2]);
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast (força o tipo para o compilador sem generics)
		
		//Referencia ao mesmo objeto
		System.out.println(cc2);
		System.out.println(ref);
	}

}

