package exercicio08;

import interfaces.IExercicioBase;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio08 implements IExercicioBase {

    private static final int WIDTH = 100;
    private static final int HEIGHT = 20;

    private JFrame frame;
    private JLabel labelNota1, labelNota2, labelNota3, labelNota4, labelMedia, labelResultado;
    private JTextField textFieldNota1, textFieldNota2, textFieldNota3, textFieldNota4;
    private JButton buttonCalcularMedia;

    public Exercicio08() {
        geraTela();
        instanciaComponentes();
        geraDimensoes();
        geraLocalizacao();
        actionCalcularMedia();
        adicionaComponentes();
        frame.setVisible(true);
    }

    @Override
    public void geraTela() {
        frame = new JFrame("Exercício 08");
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void instanciaComponentes() {
        labelNota1 = new JLabel("Nota 1:");
        labelNota2 = new JLabel("Nota 2:");
        labelNota3 = new JLabel("Nota 3:");
        labelNota4 = new JLabel("Nota 4:");
        labelMedia = new JLabel("Média:");
        labelResultado = new JLabel();

        textFieldNota1 = new JTextField();
        textFieldNota2 = new JTextField();
        textFieldNota3 = new JTextField();
        textFieldNota4 = new JTextField();

        buttonCalcularMedia = new JButton("Calcular média");
    }

    @Override
    public void geraDimensoes() {
        labelNota1.setSize(WIDTH, HEIGHT);
        labelNota2.setSize(WIDTH, HEIGHT);
        labelNota3.setSize(WIDTH, HEIGHT);
        labelNota4.setSize(WIDTH, HEIGHT);
        textFieldNota1.setSize(WIDTH, HEIGHT);
        textFieldNota2.setSize(WIDTH, HEIGHT);
        textFieldNota3.setSize(WIDTH, HEIGHT);
        textFieldNota4.setSize(WIDTH, HEIGHT);
        buttonCalcularMedia.setSize(WIDTH + 50, HEIGHT + 20);
        labelMedia.setSize(WIDTH, HEIGHT);
        labelResultado.setSize(WIDTH, HEIGHT);
    }

    @Override
    public void geraLocalizacao() {
        labelNota1.setLocation(10, 10);
        labelNota2.setLocation(10, labelNota1.getY() + 30);
        labelNota3.setLocation(10, labelNota2.getY() + 30);
        labelNota4.setLocation(10, labelNota3.getY() + 30);
        textFieldNota1.setLocation(60, labelNota1.getY());
        textFieldNota2.setLocation(60, labelNota2.getY());
        textFieldNota3.setLocation(60, labelNota3.getY());
        textFieldNota4.setLocation(60, labelNota4.getY());

        buttonCalcularMedia.setLocation(10, textFieldNota4.getY() + 30);

        labelMedia.setLocation(10, buttonCalcularMedia.getY() + buttonCalcularMedia.getHeight() + 20);
        labelResultado.setLocation(labelMedia.getWidth() + 10, labelMedia.getY());
    }

    @Override
    public void adicionaComponentes() {
        frame.add(labelNota1);
        frame.add(labelNota2);
        frame.add(labelNota3);
        frame.add(labelNota4);
        frame.add(textFieldNota1);
        frame.add(textFieldNota2);
        frame.add(textFieldNota3);
        frame.add(textFieldNota4);
        frame.add(buttonCalcularMedia);
        frame.add(labelMedia);
        frame.add(labelResultado);
    }

    private void actionCalcularMedia() {
        buttonCalcularMedia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double nota1 = Double.parseDouble(textFieldNota1.getText());
                    double nota2 = Double.parseDouble(textFieldNota2.getText());
                    double nota3 = Double.parseDouble(textFieldNota3.getText());
                    double nota4 = Double.parseDouble(textFieldNota4.getText());

                    double media = (nota1 + nota2 + nota3 + nota4) / 4;
                    labelResultado.setText(String.format("%.2f", media));
                    if(media < 5) {
                        labelResultado.setForeground(Color.decode("#ff0000"));
                    } else if (media < 7) {
                        labelResultado.setForeground(Color.decode("#ff5a00"));
                    } else {
                        labelResultado.setForeground(Color.decode("#00ff00"));
                    }
                } catch (NumberFormatException numberFormatException) {
                    JOptionPane.showMessageDialog(null, "Número inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
