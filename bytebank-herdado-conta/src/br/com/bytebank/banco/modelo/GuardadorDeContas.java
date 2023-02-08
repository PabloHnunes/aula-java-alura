package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int possicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.possicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[possicaoLivre] = ref;
		this.possicaoLivre++;
	}

	public int getQtdeElement() {
		
		return this.possicaoLivre;
	}

	public Conta getRef(int i) {
		
		return this.referencias[i];
	}
 }
