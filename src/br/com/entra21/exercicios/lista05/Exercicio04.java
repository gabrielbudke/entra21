package br.com.entra21.exercicios.lista05;
/**
 * 4. Faça um algoritmo que apresente o quadrado abaixo:
 * 		* * * * * * * * * * * * * * * * * * * *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		*                                     *
 * 		* * * * * * * * * * * * * * * * * * * *
 * 
 * 
 * 4.1 Desafio de quadrado
 * 
 * 		* * * * * * * * * * *
 * 		* *       *       * *
 * 		*   *     *     *   *
 * 		*     *   *   *     *
 * 		*       * * *       *
 * 		* * * * * * * * * * *
 * 		*       * * *       *
 * 		*     *   *   *     *
 * 		*   *     *     *   *
 * 		* *       *       * *
 * 		* * * * * * * * * * *
 * 
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio04 {
	public static void main(String[] args) {
		
		String quadrado_1 = "";
		String quadrado_2 = "";
		
		// 1° Quadrado
		for (int linha = 0; linha < 11; linha++) {
			for (int coluna = 0; coluna < 11; coluna++) {

				if(linha == 0 || linha == 10 || coluna == 0 || coluna == 10) {
					quadrado_1 += "* ";	
				} else {
					quadrado_1 += "  ";
				}

			}

			quadrado_1 += "\n";
		}

		System.out.println(quadrado_1);

		// 2° Quadrado 
		for (int linha = 0; linha < 11; linha++) {
			for (int coluna = 0; coluna < 11; coluna++) {
				
				if ((linha == 0) || (linha == 10) || (coluna == 0) || (coluna == 10)) {
					quadrado_2 += "* ";
				} 
				else if ((linha == coluna) || ((linha + coluna) == 10) || (linha == 5) || (coluna == 5)) {
					quadrado_2 += "* ";
				} else {
					quadrado_2 += "  ";
				}
				
			}
			
			quadrado_2 += "\n";

		}

		System.out.println(quadrado_2);


		/*
		for(int linha = 0; linha < 21; linha++) { 
			for(int coluna = 0; coluna < 21; coluna++) {
				
				if(linha == 0 || linha == 20 || coluna == 0 || coluna == 20) {
					texto +="* ";
				
				} else if(linha == coluna || linha + coluna == 20 || coluna == 10 || linha == 10) {
					texto += "* ";				
				} else {
					texto += "  ";
				}			
			}
			
			texto += "\n";		
		}
		
		System.out.println(texto);*/
		
	}

}