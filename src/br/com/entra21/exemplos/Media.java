package br.com.entra21.exemplos;

import javax.swing.JOptionPane;

public class Media {
    public static void main(String[] args) {
        
        double nota_1 = 8.75;
        double nota_2 = 7.5;
        double nota_3 = 9;
        double nota_4 = 10.0;

        double media = (nota_1 + nota_2 + nota_3 + nota_4) / 4;

        JOptionPane.showMessageDialog(null, "Média: " + media, 
            "CALCULO DE MÉDIA", JOptionPane.INFORMATION_MESSAGE);

    }
}