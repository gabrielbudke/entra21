package br.com.entra21.exercicios.lista2;

import javax.swing.JOptionPane;

/**
 * 9.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio09{
    public static void main(String[] args){
     
    int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro Número"));
    int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo Número"));
    int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Terceiro Número"));
    int numero4 = Integer.parseInt(JOptionPane.showInputDialog("Quarto Número"));

    if(numero1 == numero2 && numero2 == numero3 && numero3 == numero4){
        JOptionPane.showMessageDialog(null, "Pode ser Quadrado Perfeito");
    }else{
        JOptionPane.showMessageDialog(null, "Não pode ser um quadrado");
    }


    }
}