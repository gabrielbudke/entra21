package exemplo02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJLabel00 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Exemplo JLabel 00");

        JLabel label = new JLabel();
        label.setText("Nome");
        label.setSize(80, 20);
        label.setLocation(50, 50);

        JButton button = new JButton();
        button.setText("Alterar label");
        button.setSize(200, 25);
        button.setLocation(10, 10);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("alterado");
            }
        });

        frame.add(label);
        frame.add(button);
        frame.setVisible(true);


    }
}
