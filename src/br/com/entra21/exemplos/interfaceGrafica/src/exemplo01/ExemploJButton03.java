package exemplo01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExemploJButton03 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Exemplo JButton 04");

        JButton button = new JButton("Não venha aqui!");
        button.setSize(400, 300);
        button.setLocation(10, 10);

        // Remove a borda ao redor do texto
        button.setFocusPainted(false);

        // Remove a borda ao redor do botão
        button.setBorderPainted(false);

        button.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(Color.decode("#ffe105"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(Color.decode("#23dd3f"));
            }

        });

        // frame.add(button);
        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
