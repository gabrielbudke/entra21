package br.com.entra21.exercicios.lista2;

import javax.swing.JOptionPane;

/**
 * 16. Faça um sistema que realize a conversão da temperatura, solicite os seguintes dados:
 *      ● Temperatura;
 *      ● Escala da temperatura de origem;
 *      ● Escala da temperatura de destino;
 */
public class Exercicio16 {
    public static void main(String[] args) {
        
        double temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual temperatura quer converter?",
            "Conversor de temperatura!!", JOptionPane.QUESTION_MESSAGE));

        String escalaOrigem = JOptionPane.showInputDialog(null, "Escolha a escala de origem:", 
            "Conversor de temperatura!!", JOptionPane.QUESTION_MESSAGE, 
            null, 
            new Object[] {
                "", "Celsius", "Kelvin", "Fahrenheit" 
            }, "").toString();

        String escalaDestino = JOptionPane.showInputDialog(null, "Escolha a escala de destino:", 
            "Conversor de temperatura!!", JOptionPane.QUESTION_MESSAGE, null, 
            new Object[] { 
                "", "Celsius", "Kelvin", "Fahrenheit" 
            }, "").toString();

        if(escalaOrigem.equals("Celsius") && escalaDestino.equals("Fahrenheit")) {
            temperatura = (temperatura * (9/5)) + 32;
        } else if (escalaOrigem.equals("Fahrenheit") && escalaDestino.equals("Celsius")) {
            temperatura = (temperatura - 32) * 5/9;
        }



    }
    
}