package exemplo03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJTextField00 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Exemplo JTextField 00");

        JLabel labelName = new JLabel();
        labelName.setText("Nome:");
        labelName.setSize(70, 20);
        labelName.setLocation(10, 10);
        frame.add(labelName);

        JTextField textFieldName = new JTextField();
        textFieldName.setSize(200, 20);
        textFieldName.setLocation(10, 35);
        frame.add(textFieldName);

        JLabel labelAge = new JLabel("Idade:");
        labelAge.setSize(70, 20);
        labelAge.setLocation(10, 60);
        frame.add(labelAge);

        JTextField textFieldAge = new JTextField();
        textFieldAge.setSize(200, 20);
        textFieldAge.setLocation(10, 85);
        frame.add(textFieldAge);

        JLabel labelHeight = new JLabel("Altura:");
        labelHeight.setSize(70, 20);
        labelHeight.setLocation(220, 60);
        frame.add(labelHeight);

        JTextField textFieldHeight = new JTextField();
        textFieldHeight.setSize(200, 20);
        textFieldHeight.setLocation(220, 85);
        frame.add(textFieldHeight);

        JLabel labelWeight = new JLabel("Peso:");
        labelWeight.setSize(70, 20);
        labelWeight.setLocation(220, 10);
        frame.add(labelWeight);

        JTextField textFieldWeight = new JTextField();
        textFieldWeight.setSize(200, 20);
        textFieldWeight.setLocation(220, 35);
        frame.add(textFieldWeight);

        JButton button = new JButton("Calcular");
        button.setSize(400, 300);
        button.setLocation(45, 145);

        // Para alterar a fonte
        button.setFont(new Font("Magneto Negrito", 0, 26));

        // Para alterar a cor de fundo
        button.setBackground(Color.decode("#f4424e"));

        // Alterar a cor da fonte
        button.setForeground(Color.decode("#f4e841"));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textFieldName.getText();
                int age = Byte.parseByte(textFieldAge.getText());
                float weight = Float.parseFloat(textFieldWeight.getText());
                float height = Float.parseFloat(textFieldHeight.getText());

                float imc = weight/(height * height);

                JOptionPane.showMessageDialog(null,
                        "Nome: " + name +
                                "\nIdade: " + age +
                                "\nAltura: " + height +
                                "\nPeso: " + weight +
                                "\nIMC: " + imc);
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
