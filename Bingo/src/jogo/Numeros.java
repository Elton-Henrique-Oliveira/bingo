package jogo;

import java.util.Random;

public class Numeros {
	public int resultado[][] = new int[16][6];
	
	public Numeros() {
		int contador = 0;
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 15; k++) {
				contador++;
				resultado[k][i] = contador;
			}
		}
	}
	
	public void listaAtual() {
		int contador = 0;
		for (int i = 0; i < 15; i++) {
			for (int k = 0; k < 5; k++) {
				System.out.print(resultado[i][k] + " ");
			}
			System.out.println("");
		}
	}
	
	public boolean adicionarNumero(int numero) {
		boolean contem = true;
		numero = numero - 1;
		int coluna = (int)numero % 15;
		int linha = numero / 15;
		if (resultado[coluna][linha] == 0) {
			contem = false;
		} else {
			resultado[coluna][linha] = 0;
		}
		
		return contem;
	}
	
	public void gerarNumero() {
		Random aleatorio = new Random();
		adicionarNumero(aleatorio.nextInt((75 - 1) + 1));
	}
}
