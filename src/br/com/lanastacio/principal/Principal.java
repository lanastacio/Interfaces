package br.com.lanastacio.principal;

import br.com.lanastacio.implementacoes.Corredor;
import br.com.lanastacio.implementacoes.CorredorParalimpico;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Vamos começar a São Silvestre");
		for (int i = 0; i<= 10; i++) {
			Corredor corredor = new Corredor("Gilson " + i);
			corredor.correr(10D);
			corredor.fazerMerda();
			corredor.correr(50D);
			corredor.caminhar();
			
		}
		System.out.println("Acabou a corrida de quem tem perna ");

		System.out.println("Começando a corrida das cadeiras");
		for (int i = 0; i <= 10; i++) {
			CorredorParalimpico deficiente = new CorredorParalimpico("Manquetola " + i);
			deficiente.andarDeCadeira();
		}
		System.out.println("Acabou a corrida das cadeiras");
	}

}
