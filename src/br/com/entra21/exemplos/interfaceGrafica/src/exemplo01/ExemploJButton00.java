package exemplo01;

import javax.swing.*;

public class ExemploJButton00 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Exemplo JButton 01");

        JButton button = new JButton();
        button.setText("Não clique aqui!");
        button.setSize(200, 20);
        button.setLocation(10, 10);

        frame.add(button);
        frame.setVisible(true);

    }
}
