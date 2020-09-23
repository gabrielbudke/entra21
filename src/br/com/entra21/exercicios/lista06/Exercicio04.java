package br.com.entra21.exercicios.lista06;

import javax.swing.JOptionPane;

/**
 * 4. Desenvolver um programa que armazene o tamanho de 40 camisas, após isto apresentar:
 *    ➔ Tamanho de todas as camisas armazenadas
 *    ➔ Quantidade de camisas PP
 *    ➔ Quantidade de camisas P
 *    ➔ Quantidade de camisas M
 *    ➔ Quantidade de camisas G
 *    ➔ Quantidade de camisas GG
 *    ➔ Quantidade de camisas XG
 *    ➔ Quantidade de camisas XGG
 */
/**
 * @author Gabriel Sousa
 */

public class Exercicio04 {
    public static void main(String[] args) {

        int quantidadeCamisetasPP = 0, quantidadeCamisetasP = 0, 
            quantidadeCamisetasM = 0, quantidadeCamisetasG = 0, 
            quantidadeCamisetasGG = 0, quantidadeCamisetasXG = 0, 
            quantidadeCamisetasXGG = 0;


        String[] quantidadeCamisetas = new String[40];

        for(int i = 0; i < quantidadeCamisetas.length; i++) {
            
            String camiseta = JOptionPane.showInputDialog(null, "Escolha a camiseta", "CAMISETAS",
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[] {
                    "", "PP", "P", "M", "G", "GG", "XG", "XGG"
                }, "").toString();

            quantidadeCamisetas[i] = camiseta;
            
                switch (camiseta) {
                    case "PP":
                        quantidadeCamisetasPP++;
                        break;
                    case "P":
                        quantidadeCamisetasP++;
                        break;
                    case "M":
                        quantidadeCamisetasM++;
                        break;
                    case "G":
                        quantidadeCamisetasG++;
                        break;
                    case "GG":
                        quantidadeCamisetasGG++;
                        break;
                    case "XG":
                        quantidadeCamisetasXG++;
                        break;
                    case "XGG":
                        quantidadeCamisetasXGG++;
                        break;                    
                }

        }

        JOptionPane.showMessageDialog(null, "Tamanho de todas as camisas armazenadas" + "\n"
            + "Quantidade de camisas PP: " + quantidadeCamisetasPP + "\n"
            + "Quantidade de camisas P: " + quantidadeCamisetasP + "\n"
            + "Quantidade de camisas M: " + quantidadeCamisetasM + "\n"
            + "Quantidade de camisas G: " + quantidadeCamisetasG + "\n"
            + "Quantidade de camisas GG: " + quantidadeCamisetasGG + "\n"
            + "Quantidade de camisas XG: " + quantidadeCamisetasXG + "\n"
            + "Quantidade de camisas XGG: " + quantidadeCamisetasXGG + "\n");



        

        


    }
}
