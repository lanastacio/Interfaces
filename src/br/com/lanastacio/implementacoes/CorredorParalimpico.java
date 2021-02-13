package br.com.lanastacio.implementacoes;

import br.com.lanastacio.interfaces.Cadeirante;

public class CorredorParalimpico implements Cadeirante {

	private String nome;
	
	public CorredorParalimpico(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public void andarDeCadeira() {
		System.out.println(nome + " participante correndo na cadeira");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
