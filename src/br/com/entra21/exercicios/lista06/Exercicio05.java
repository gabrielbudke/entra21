package br.com.entra21.exercicios.lista06;

import javax.swing.JOptionPane;

/**
 * 5. A empresa GameVicio precisa armazenar os jogos que tem em estoque, para tal 
 *    deve-se armazenar o nome e a quantidade de jogos. Para tal utilize um vetor 
 *    para o nome dos jogos e outro vetor para a quantidade de jogos.
 * 
 *    Ao final apresente o nome concatenado com a quantidade. 
 *      
 *    Exemplo:
 *      Nome               Unidades
 *      Horizon Zero Dawn  190
 *      God Of War         350
 *      Spider-Man         59
 *      Injustice          227
 *      Crash Bandicoot    41
 *      Grand Theft Auto V 12O
 * 
 *    Observação: A quantidade de jogos que serão cadastrados é o usuário que irá definir;
 * 
 */

/**
 * @author Gabriel B Sousa
 */
public class Exercicio05 {
    public static void main(String[] args) {
        
        int quantidadeDeRegistros = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de jogos quer cadastra?"));

        String[] nomeDoJogo = new String[quantidadeDeRegistros];
        int[] quantidadeDoJogo = new int[quantidadeDeRegistros];
        String menu = "";
        
        menu+= "NOME            | QUANTIDADE" + "\n";

        for (int i = 0; i < quantidadeDoJogo.length; i++) {
            nomeDoJogo[i] = JOptionPane.showInputDialog("Qual o nome do jogo:");
            quantidadeDoJogo[i] = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade do jogo: " + nomeDoJogo[i]));
            menu+= nomeDoJogo[i] + "          " + quantidadeDoJogo[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, menu, "CADASTRO DE JOGOS", JOptionPane.INFORMATION_MESSAGE);



        



    }
}
