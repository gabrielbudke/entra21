package br.com.entra21.exercicios.lista04;

import javax.swing.JOptionPane;
/**
 * 6. Solicite a idade de 9 pessoas, apresente ao final a pessoa com a maior idade.
 */
/**
 * @author Gabriel B Sousa
 */

public class Exercicio06 {
    public static void main(String[] args) {
        
        int maiorIdade = 0;        
        int[] idades = new int[9];
        
        idades[0] = Integer.parseInt(JOptionPane.showInputDialog("Idade da 1º pessoa: "));
        idades[1] = Integer.parseInt(JOptionPane.showInputDialog("Idade da 2º pessoa: "));
        idades[2] = Integer.parseInt(JOptionPane.showInputDialog("Idade da 3º pessoa: "));
        idades[3] = Integer.parseInt(JOptionPane.showInputDialog("Idade da 4º pessoa: "));
        idades[4] = Integer.parseInt(JOptionPane.showInputDialog("Idade da 5º pessoa: "));
        idades[5] = Integer.parseInt(JOptionPane.showInputDialog("Idade da 6º pessoa: "));
        idades[6] = Integer.parseInt(JOptionPane.showInputDialog("Idade da 7º pessoa: "));
        idades[7] = Integer.parseInt(JOptionPane.showInputDialog("Idade da 8º pessoa: "));
        idades[8] = Integer.parseInt(JOptionPane.showInputDialog("Idade da 9º pessoa: "));

        if(idades[0] > maiorIdade) {
            maiorIdade = idades[0];
        }

        if(idades[1] > maiorIdade) {
            maiorIdade = idades[1];
        }

        if(idades[2] > maiorIdade) {
            maiorIdade = idades[2];
        }

        if(idades[3] > maiorIdade) {
            maiorIdade = idades[3];
        }

        if(idades[4] > maiorIdade) {
            maiorIdade = idades[4];
        }

        if(idades[5] > maiorIdade) {
            maiorIdade = idades[5];
        }
        
        if(idades[6] > maiorIdade) {
            maiorIdade = idades[6];
        }
        
        if(idades[7] > maiorIdade) {
            maiorIdade = idades[7];
        }
        
        if(idades[8] > maiorIdade) {
            maiorIdade = idades[8];
        }


        JOptionPane.showMessageDialog(null, "Maior idade: " + maiorIdade);










    }
    
}