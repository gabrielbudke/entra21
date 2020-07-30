package br.com.entra21.exercicios.lista2;

import javax.swing.JOptionPane;

/**
 * 7.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio07{
    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));

        if ( numero == 0){
            JOptionPane.showMessageDialog(null, "Número Neutro");
        }else if ( numero %2 == 0){
            JOptionPane.showMessageDialog(null, "Número Par");
        }else{
            JOptionPane.showMessageDialog(null, "Número Ímpar");
        }
    
        if (numero >= 1){
            JOptionPane.showMessageDialog(null, "Número Positivo");
        }else if (numero <= -1){
            JOptionPane.showMessageDialog(null, "Número Negativo");
        }

        if (numero > 10){
            JOptionPane.showMessageDialog(null, "Maior que Dez");
        }else{
            JOptionPane.showMessageDialog(null, "Menor que Dez");
        }

        if (numero <= 50){
            JOptionPane.showMessageDialog(null, "Menor ou igual a Cinquenta");
        }else{
            JOptionPane.showMessageDialog(null, "Maior que CInquenta");
        }

        if (numero < -10){
            JOptionPane.showMessageDialog(null, "Menor que -10");
        }else{
            JOptionPane.showMessageDialog(null, "Maior que -10");
        }

        if (numero >= 30){
            JOptionPane.showMessageDialog(null, "Maior Igual a 30"); 
        }else{
            JOptionPane.showMessageDialog(null, "Menor que 30");
        }
 
        if(numero != 1){
            JOptionPane.showMessageDialog(null, "Diferente de 1");
        }else{
            JOptionPane.showMessageDialog(null, "Número Igual a Zero");
        }


    }
}