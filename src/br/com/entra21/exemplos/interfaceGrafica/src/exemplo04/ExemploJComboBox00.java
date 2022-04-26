package exemplo04;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJComboBox00 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Exemplo JComboBox 00");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelGame = new JLabel("Jogo:");
        labelGame.setSize(70, 20);;
        labelGame.setLocation(10, 10);
        frame.add(labelGame);

        JComboBox comboBoxGame = new JComboBox();
        comboBoxGame.setSize(200, 20);
        comboBoxGame.setLocation(85, 10);

        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel(new Object[] {
                "God of War", "Fortnite", "Minecraft", "Pokemon Go", "FarCry 5"
        });

        comboBoxGame.setModel(comboBoxModel);
        comboBoxGame.setSelectedIndex(-1);
        frame.add(comboBoxGame);

        JButton button = new JButton("Obter");
        button.setSize(150, 20);
        button.setLocation(45, 35);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comboBoxGame.getSelectedIndex() == -1) {
                    JOptionPane.showMessageDialog(null, "Selecione algum jogo!");
                    return;
                }

                String gameSelected = comboBoxGame.getSelectedItem().toString();
                JOptionPane.showMessageDialog(null, "Jogo escolhido: " + gameSelected);

            }
        });

        frame.add(button);
        frame.setVisible(true);

    }
}
