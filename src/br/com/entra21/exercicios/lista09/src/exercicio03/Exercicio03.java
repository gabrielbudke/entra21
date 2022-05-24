package exercicio03;

import interfaces.IExercicioBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio03 implements IExercicioBase {

    private JFrame frame;
    private JLabel labelNumero, labelTabuada;
    private JTextField textFieldNumero;
    private JButton buttonGerarTabuada;
    private JTextArea textAreaTabuada;
    private JScrollPane scrollPaneTabuada;

    public Exercicio03() {
        geraTela();
        instanciaComponentes();
        geraDimensoes();
        geraLocalizacao();
        configuraJScrollPane();
        estilizaComponente();
        actionButtonGerarTabuada();
        adicionaComponentes();
        frame.setVisible(true);
    }

    @Override
    public void geraTela() {
        frame = new JFrame("Exercício 03");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void instanciaComponentes() {
        labelNumero = new JLabel("Número:");
        textFieldNumero = new JTextField();
        buttonGerarTabuada = new JButton("Gerar tabuada!");
        labelTabuada = new JLabel("Tabuada:");
        textAreaTabuada = new JTextArea();
        scrollPaneTabuada = new JScrollPane();
    }

    @Override
    public void geraDimensoes() {
        labelNumero.setSize(100, 20);
        textFieldNumero.setSize(150, 20);
        buttonGerarTabuada.setSize(120, 40);
        scrollPaneTabuada.setSize(290, 300);
    }

    @Override
    public void geraLocalizacao() {
        labelNumero.setLocation(10, 10);
        textFieldNumero.setLocation(10, 30);
        buttonGerarTabuada.setLocation(180, 10);
        scrollPaneTabuada.setLocation(10, 60);
    }

    public void configuraJScrollPane() {
        scrollPaneTabuada.setViewportView(textAreaTabuada);
        scrollPaneTabuada.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneTabuada.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        textAreaTabuada.setEditable(false);
        textAreaTabuada.setBackground(Color.LIGHT_GRAY);
        textAreaTabuada.setLineWrap(true);
    }

    public void estilizaComponente() {
        buttonGerarTabuada.setFocusPainted(false);
    }

    @Override
    public void adicionaComponentes() {
        frame.add(labelNumero);
        frame.add(textFieldNumero);
        frame.add(buttonGerarTabuada);
        frame.add(scrollPaneTabuada);
    }

    public void actionButtonGerarTabuada() {
        buttonGerarTabuada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(textFieldNumero.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "É necessário informar um número para gerar a tabuada!", null, JOptionPane.WARNING_MESSAGE);
                    return;
                }

                String tabuada = "Tabuada:";

                try {
                    int numero = Integer.parseInt(textFieldNumero.getText());

                    for (int i = 0; i <= 10; i++) {
                        tabuada += "\n" + numero + " x " + i + " = " + (numero * i);
                    }

                    textAreaTabuada.setText(tabuada);

                } catch (Exception exception) {
                    System.out.println(exception);
                }

            }
        });
    }
}
