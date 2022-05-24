package exercicio01;

import interfaces.IExercicioBase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 1. Crie um JFrame contendo os seguintes componentes:
 *      - JLabel para o nome
 *      - JLabel para o sobrenome
 *      - JTextFild para o nome
 *      - JTextFild para o sobrenome
 *      - JButton para concatenar o nome e sobrenome
 *
 *  Ao ocorrer o evento  do clique no botão, deve armazenar em duas variáveis os
 *  textos dos JTextField e apresentar o valores concatenados.
 *
 */

public class Exercicio01 implements IExercicioBase {

    private JFrame frame;
    private JLabel labelNome, labelSobrenome, labelNomeConcatenado;
    private JTextField textFieldNome, textFieldSobrenome;
    private JButton buttonConcatenar;

    public Exercicio01() {
        geraTela();
        instanciaComponentes();
        geraDimensoes();
        geraLocalizacao();
        estilizaComponente();
        actionButtonConcatenar();
        adicionaComponentes();
        frame.setVisible(true);
    }

    @Override
    public void geraTela() {
        frame = new JFrame("Exercício 01");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void instanciaComponentes() {
        labelNome = new JLabel("Nome:");
        textFieldNome = new JTextField();

        labelSobrenome = new JLabel("Sobrenome:");
        textFieldSobrenome = new JTextField();

        buttonConcatenar = new JButton("Concatenar!");

        labelNomeConcatenado = new JLabel("Seu nome aparecerá aqui!");

    }

    @Override
    public void geraDimensoes() {
        labelNome.setSize(100, 20);
        textFieldNome.setSize(150, 20);
        labelSobrenome.setSize(100, 20);
        textFieldSobrenome.setSize(150, 20);
        buttonConcatenar.setSize(120, 40);
        labelNomeConcatenado.setSize(300, 100);
    }

    @Override
    public void geraLocalizacao() {
        labelNome.setLocation(10, 10);
        textFieldNome.setLocation(10, 30);

        labelSobrenome.setLocation(180, 10);
        textFieldSobrenome.setLocation(180, 30);

        buttonConcatenar.setLocation(350, 10);

        labelNomeConcatenado.setLocation(10, 50);
    }

    public void estilizaComponente() {
        buttonConcatenar.setFocusPainted(false);
    }

    public void actionButtonConcatenar() {
        buttonConcatenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textFieldNome.getText();
                String sobrenome = textFieldSobrenome.getText();

                if(!nome.isEmpty() || !sobrenome.isEmpty()) {
                    String nomeConcatenado = nome + " " + sobrenome;
                    labelNomeConcatenado.setText(nomeConcatenado);
                }

            }
        });
    }

    @Override
    public void adicionaComponentes() {
        frame.add(labelNome);
        frame.add(textFieldNome);
        frame.add(labelSobrenome);
        frame.add(textFieldSobrenome);
        frame.add(buttonConcatenar);
        frame.add(labelNomeConcatenado);
    }
}
