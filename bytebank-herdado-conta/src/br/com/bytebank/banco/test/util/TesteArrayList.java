package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(11, 22);
		
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(23, 33);
		
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println(lista.size());
		
		Conta cc3 = new ContaCorrente(111, 232);
		
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(233, 323);
		
		lista.add(cc4);
		
		//estilo legado de for para rodar uma lista
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		//estilo simplificado de for(foreach)
		for(Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
