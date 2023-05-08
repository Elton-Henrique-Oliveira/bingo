package jogo;

import java.util.Arrays;
import java.util.Random;

public class TabelaBingo {
	public int tabela[][] = new int[5][5];
	Numeros numero = new Numeros();
    
    public void gerarNumeros() {
    	int coluna = 1;
    	int numeros[] = new int[5];
    	Random aleatorio = new Random();
    	int[] intervalo = new int[2];
    	for (int i = 0; i < 5; i++) {
    		intervalo = getIntervalo(coluna);
    		numeros[i] = aleatorio.nextInt((intervalo[1] - intervalo[0]) + 1) + intervalo[0];
    		if (numero.adicionarNumero(numeros[i]) == false) {
    			i--;
    			continue;
    		}
    		if (i == 4) {
    			Arrays.sort(numeros);
    			switch (coluna) {
	    			case 1:
	    				for (int k = 0; k < 5; k++) {
	    					this.tabela[0][k] = numeros[k];
	    				}
	    				break;
	    			case 2:
	    				for (int k = 0; k < 5; k++) {
	    					this.tabela[1][k] = numeros[k];
	    				}
	    				break;
	    			case 3:
	    				for (int k = 0; k < 5; k++) {
	    					this.tabela[2][k] = numeros[k];
	    				}
	    				break;
	    			case 4:
	    				for (int k = 0; k < 5; k++) {
	    					this.tabela[3][k] = numeros[k];
	    				}
	    				break;
	    			case 5:
	    				for (int k = 0; k < 5; k++) {
	    					this.tabela[4][k] = numeros[k];
	    				}
	    				break;
    			}
    			coluna++;
    			Arrays.fill(numeros, 0);
    			if (coluna <= 5) {
    				i = -1;
    			}
    		}
    	}
    	numero.listaAtual();
    }
    
    public int[] getIntervalo(int coluna) {
    	int[] resultado = new int[2];
    	switch (coluna) {
	    	case 1:
	    		resultado[0] = 1;
	    		resultado[1] = 15;
	    		break;
	    	case 2:
	    		resultado[0] = 16;
	    		resultado[1] = 30;
	    		break;
	    	case 3:
	    		resultado[0] = 31;
	    		resultado[1] = 45;
	    		break;
	    	case 4:
	    		resultado[0] = 46;
	    		resultado[1] = 60;
	    		break;
	    	case 5:
	    		resultado[0] = 61;
	    		resultado[1] = 75;
	    		break;
    	}
    	return resultado;
    }
    
    public int getNumeroTabela(int coluna, int linha) {
    	int resultado = this.tabela[coluna][linha];
    	return resultado;
    }
}
