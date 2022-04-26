package exemplo01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJButton02 {
    static boolean somar = false;
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Exemplo JButton 03");

        JButton button = new JButton();
        button.setText("Não clique aqui!");
        button.setSize(200, 20);
        button.setLocation(10, 20);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                button.setLocation(button.getX() + 20, button.getY() + 20);
                System.out.println(button.getLocation().getX());

                if(button.getHeight() - 5 <= 0) {
                    somar = true;
                }

                if(!somar) {
                    button.setSize(button.getWidth(), button.getHeight() - 5);
                } else {
                    button.setSize(button.getWidth(), button.getHeight() + 5);
                }

            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
