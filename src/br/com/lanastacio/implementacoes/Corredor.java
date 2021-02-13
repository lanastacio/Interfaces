package br.com.lanastacio.implementacoes;

import br.com.lanastacio.interfaces.Correr;

public class Corredor implements Correr {
	
	private String nomeCorredor;
	
	public Corredor(String nomeCorredor) {
		this.nomeCorredor = nomeCorredor;
	}

	public void fazerMerda() {
		System.out.println("Corredor pegou a rua errada");
	}
	
	@Override
	public void caminhar() {
		System.out.println(nomeCorredor + " parou de correr e está caminhando");
	}

	@Override
	public void correr(Double velocidade) {
		System.out.println(nomeCorredor +  " está na velocidade de " + velocidade);
	}

	public String getNomeCorredor() {
		return nomeCorredor;
	}

	public void setNomeCorredor(String nomeCorredor) {
		this.nomeCorredor = nomeCorredor;
	}
	
}
