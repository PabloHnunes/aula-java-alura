package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestArrayListEquals {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(11, 22);
		
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(23, 33);
		
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(23, 33);
		
		boolean exist = lista.contains(cc3);
		
		
		
		System.out.println(exist);
		
		
		for(Conta conta : lista) {
			if(conta.equals(cc3)) {
				System.out.println("Já tem essa conta!");
			}
		}
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
