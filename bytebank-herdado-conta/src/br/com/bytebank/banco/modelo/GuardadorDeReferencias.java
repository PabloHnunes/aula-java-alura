package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

	private Object[] referencias;
	private int possicaoLivre;
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.possicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[possicaoLivre] = ref;
		this.possicaoLivre++;
	}

	public int getQtdeElement() {
		
		return this.possicaoLivre;
	}

	public Object getRef(int i) {
		
		return this.referencias[i];
	}
 }
