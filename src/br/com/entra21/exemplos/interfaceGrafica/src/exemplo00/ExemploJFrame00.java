package exemplo00;

import javax.swing.*;
import java.awt.*;

public class ExemploJFrame00 {
    public static void main(String[] args) {

        // Criação da tela
        JFrame frame = new JFrame();

        // Define o tamanho da janela. O primeiro parâmetro é o width (largura) e o segundo é o height (altura)
        frame.setSize(500, 500);

        // Define o layout
        frame.setLayout(null);

        // Definie a localização da aplicação na tela. Com valor null ele centraliza
        frame.setLocationRelativeTo(null);

        /* Define o que acontece quando o usuário clicar em fechar a aplicação
        *   JFrame.EXIT_ON_CLOSE -> quando fechar a tela ele encerra a aplicação
        * */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Definie o título da janela
        frame.setTitle("Hello World");

        // Define a cor do background da janela
        frame.getContentPane().setBackground(Color.red);

        // Apresenta a janela
        frame.setVisible(true);

    }
}
