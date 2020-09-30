package br.com.entra21.exercicios.lista06;

import javax.swing.JOptionPane;

/**
 * 10. Crie um vetor para guardar 10 nomes, solicite-os e apresente:
 * 
 *     ➔ Todos os nomes;
 *     ➔ Nome com o maior nome;
 *     ➔ Nome com o menor nome;
 *     ➔ Quantidade de pessoas que contém o nome começando com S;
 *     ➔ Quantidade de pessoas que contém o nome começando com A;
 *     ➔ Quantidade de pessoas que o último sobrenome é Silva. 
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio10 {
    public static void main(String[] args) {
        
        String[] nomes = new String[10];

        int qtdMaiorNome = Integer.MIN_VALUE;
        int qtdMenorNome = Integer.MAX_VALUE;
        int qtdNomesComecamComS = 0;
        int qtdNomesComecamComA = 0;
        int qtdNomesComSobrenomeSilva = 0;

        String textoNomes = "Todos os nomes: ";
        String maiorNome = "";
        String menorNome = "";

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog((i + 1) + "° nome para guardar:").trim().toUpperCase();

            if ((i + 1) == nomes.length) {
                textoNomes += nomes[i];
            } else {
                textoNomes += nomes[i] + ", ";            
            }

            // Verifica o maior nome
            if(nomes[i].length() > qtdMaiorNome) {
                qtdMaiorNome = nomes[i].length();
                maiorNome = nomes[i];
            }

            // Verifica o menor nome
            if (nomes[i].length() < qtdMenorNome) {
                qtdMenorNome = nomes[i].length();
                menorNome = nomes[i];
            }

            switch (nomes[i].charAt(0)) {
                case 'S':
                    qtdNomesComecamComS++;                                    
                    break;
                case 'A':
                    qtdNomesComecamComA++;
                    break;
                default:
                    break;
            }

            // Verifica se o última sobrenome é SILVA
            if (nomes[i].endsWith("SILVA")) {
                qtdNomesComSobrenomeSilva++;
            }

        }

        JOptionPane.showMessageDialog(null, textoNomes
            + "\nMaior nome: " + maiorNome
            + "\nMenor nome: " + menorNome
            + "\nQuantidade de pessoas que contém o nome começando com S: " + qtdNomesComecamComS
            + "\nQuantidade de pessoas que contém o nome começando com A: " + qtdNomesComecamComA
            + "\nQuantidade de pessoas que o último sobrenome é Silva: " + qtdNomesComSobrenomeSilva, 
            "EXERCICIO 10", JOptionPane.INFORMATION_MESSAGE);


    }
}