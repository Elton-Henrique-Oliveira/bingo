package jogo;

import java.util.Scanner;

public class Sistema {
	Scanner teclado = new Scanner(System.in);
	TabelaBingo tabela = new TabelaBingo();

	public void iniciarSistema(){
		tabela.gerarNumeros();
		int op = -1;
		op = menuPrincipal();
		while(op != 0){
			op = (int)teclado.nextInt();
			switch(op){
			case 1:
				mostrarTabelaAtual();
				break;
			case 2:
				//biblioteca.listarAcervo();
				break;
			case 3:
				//imprimirPublicacao();
				break;
			case 0:
				System.out.println("Finalizando o sistema");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}

	public void mostrarTabelaAtual() {
		System.out.println(" - B- - I- - N- - G- - O-");
		for (int k = 0; k < 5; k++) {
			System.out.print(" -" + (tabela.tabela[0][k] < 10 ? " " : "") + tabela.tabela[0][k] + "- ");
			System.out.print("-" + tabela.tabela[1][k] + "- ");
			if (k == 2) {
				System.out.print("-XX- ");
			}else {
				System.out.print("-" + tabela.tabela[2][k] + "- ");
			}
			System.out.print("-" + tabela.tabela[3][k] + "- ");
			System.out.print("-" + tabela.tabela[4][k] + "-\n");
		}
	}
	
	public int menuPrincipal(){
		System.out.println("---------------MENU-----------------");
		System.out.println("  1 - Mostrar tabela atual");
		//System.out.println("  2 - Listar Acervo");
		//System.out.println("  3 - Imprimir Publicação");
		System.out.println("  0 - Sair");
		System.out.println("------------------------------------");
		System.out.println("Digite opção:");
		int op = Integer.parseInt(teclado.nextLine());
		return op;
	}
}
