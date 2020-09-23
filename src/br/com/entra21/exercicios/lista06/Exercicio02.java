package br.com.entra21.exercicios.lista06;

import javax.swing.JOptionPane;
/**
 * 2. Desenvolver um programa que armazene 7 idades, armazenar em um vetor, 
 *    solicitando ao usuário e ao final apresentar as idades ao usuário.
 */
/**
 * @author Gabriel Sousa
 */
public class Exercicio02 {
    
    public static void main(String[] args) {

        int[] idades = new int[7];
        String texto = "Idades cadastradas:" + "\n";

        for(int i = 0; i < idades.length; i++) {
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite " + (i + 1) + "° idade:"));

            if(idades[i] > 150) {
                JOptionPane.showMessageDialog(null, "Você não é imortal jovem!", "",
                    JOptionPane.WARNING_MESSAGE);

                    texto += (i + 1) + "° idade: Idade inválida!" + "\n";

                continue;
            }

            texto += (i + 1) + "° idade: " + idades[i] + "\n";
        }        

        JOptionPane.showMessageDialog(null, texto);

    }   
}
