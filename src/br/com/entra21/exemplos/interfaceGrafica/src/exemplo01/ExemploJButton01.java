package exemplo01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJButton01 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Exemplo JButton 02");

        JButton button = new JButton();
        button.setText("Não clique aqui!");
        button.setSize(200, 20);
        button.setLocation(10, 10);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Eu avisei para não clicar!", "AVISO", JOptionPane.WARNING_MESSAGE);
            }
        });

        frame.add(button);
        frame.setVisible(true);

    }
}
