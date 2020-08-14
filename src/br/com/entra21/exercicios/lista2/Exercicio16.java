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

        String escalaOrigem, escalaDestino;
        String mensagem = "";
        double temperaturaOrigem = 0;
        double temperaturaDestino = 0;
        
        // Lê a informação de qual temperatura o usuário quer converter
        temperaturaOrigem = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual temperatura quer converter?",
            "Conversor de temperatura!!", JOptionPane.QUESTION_MESSAGE));

        // Lê a escala de origem que o usuário escolheu
        escalaOrigem = JOptionPane.showInputDialog(null, "Escolha a escala de origem:", 
            "Conversor de temperatura!!", JOptionPane.QUESTION_MESSAGE, 
            null, 
            new Object[] {
                "", "Celsius", "Kelvin", "Fahrenheit" 
            }, "").toString();

        // Lê a escala de destino que o usuário escolheu
        escalaDestino = JOptionPane.showInputDialog(null, "Escolha a escala de destino:", 
            "Conversor de temperatura!!", JOptionPane.QUESTION_MESSAGE, null, 
            new Object[] { 
                "", "Celsius", "Kelvin", "Fahrenheit" 
            }, "").toString();

        mensagem = mensagem + "Conversão" + "\n";
        mensagem = mensagem + "Grau " + escalaOrigem + " --> " + "Grau " + escalaDestino + "\n";
        
        // Converte de Celsius para Fahrenheit
        if(escalaOrigem.equals("Celsius") && escalaDestino.equals("Fahrenheit")) {
            temperaturaDestino = (temperaturaOrigem * (9/5)) + 32;                        
            mensagem += temperaturaOrigem + " --> " + temperaturaDestino;
        
        // Converte de Fahrenheit para Celsius
        } else if (escalaOrigem.equals("Fahrenheit") && escalaDestino.equals("Celsius")) {
            temperaturaDestino = (temperaturaOrigem - 32) * 5/9;
            mensagem += temperaturaOrigem + " --> " + temperaturaDestino;

        // Converte de Celsius para Kelvin
        } else if (escalaOrigem.equals("Celsius") && escalaDestino.equals("Kelvin")) {
            temperaturaDestino = temperaturaOrigem + 273.15;
            mensagem += temperaturaOrigem + " --> " + temperaturaDestino;
        
        // Converte de Fahrenheit para Kelvin
        } else if (escalaOrigem.equals("Fahrenheit") && escalaDestino.equals("Kelvin")) {            
            temperaturaDestino = (temperaturaOrigem - 32) * (5/9) + 273.15;
            mensagem += temperaturaOrigem + " --> " + temperaturaDestino;

        // Converte de Kelvin para Celsius
        } else if (escalaOrigem.equals("Kelvin") && escalaDestino.equals("Celsius")) {
            temperaturaDestino = temperaturaOrigem - 273.15;
            mensagem += temperaturaOrigem + " --> " + temperaturaDestino;

        // Converte de Kelvin para Fahrenheit
        } else if (escalaOrigem.equals("Kelvin") && escalaDestino.equals("Fahrenheit")) {            
            temperaturaDestino = (temperaturaOrigem - 273.15) * (9/5) + 32;
            mensagem += temperaturaOrigem + " --> " + temperaturaDestino;
        }

        JOptionPane.showMessageDialog(null, mensagem);

    }
    
}