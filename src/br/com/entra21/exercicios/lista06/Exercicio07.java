package br.com.entra21.exercicios.lista06;

import javax.swing.JOptionPane;

/**
 * 7. Solicite ao usuário 20 caracteres armazenando em um vetor. 
 *    Após isto verifique e apresente os itens abaixo:
 * 
 *    ➔ Quantas são as consoantes
 *    ➔ Quantas são as vogais;
 *    ➔ Quantos são caracteres especiais.
 *    ➔ Quais são as consoantes;
 *    ➔ Quais são as vogais;
 *    ➔ Quais são os caracteres especiais. 
 * 
 */
/**
 * @author Gabriel B Sousa
 */

public class Exercicio07 {
    public static void main(String[] args) {
        
        char[] caracteres = new char[20];
        char[] vogais = { 'A', 'E', 'I', 'O', 'U' };
        char[] consoantes = { 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q',
                                'R', 'S', 'T', 'V', 'X', 'W', 'Y', 'Z' };

        int quantidadeVogais = 0, quantidadeConsoantes = 0, quantidadeCaracteresEspeciais = 0;

        String vogaisInformadas = "[", consoantesInformadas = "[", caracteresEspeciaisInformados = "[";

        for (int indiceCaracteres = 0; indiceCaracteres < caracteres.length; indiceCaracteres++) {

            caracteres[indiceCaracteres] = JOptionPane.showInputDialog("Digite um caractere:").trim().toUpperCase().charAt(0);

            boolean temVogal = false;
            boolean temConsoante = false;

            for (int indiceVogais = 0; indiceVogais < vogais.length; indiceVogais++) {
                if(caracteres[indiceCaracteres] == vogais[indiceVogais]) {
                    quantidadeVogais++;
                    temVogal = true;
                    vogaisInformadas+= " " + caracteres[indiceCaracteres] + " ";                    
                    break;
                } else {
                    temVogal = false;
                }
            }

            for (int indiceConsoantes = 0; indiceConsoantes < consoantes.length; indiceConsoantes++) {
                if(caracteres[indiceCaracteres] == consoantes[indiceConsoantes]) {
                    quantidadeConsoantes++;
                    temConsoante = true;
                    consoantesInformadas+= " " + caracteres[indiceCaracteres] + " ";
                    break;
                } else {
                    temConsoante = false;
                }
            }

            if(!temVogal && !temConsoante) {
                quantidadeCaracteresEspeciais++;
                caracteresEspeciaisInformados+= " " + caracteres[indiceCaracteres] + " ";
            }

        }

        vogaisInformadas += "]";
        consoantesInformadas += "]";
        caracteresEspeciaisInformados += "]";

        JOptionPane.showMessageDialog(null, 
            "Quantidade de vogais: " + quantidadeVogais 
            + "\nQuantidade de consoantes: " + quantidadeConsoantes
            + "\nQuantidade de caracteres especiais: " + quantidadeCaracteresEspeciais
            + "\nEssas são as vogais: " + vogaisInformadas
            + "\nEssas são as consoantes: " + consoantesInformadas
            + "\nEssas são os caracteres especiais: " + caracteresEspeciaisInformados, "EXERCICIO 07", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
