package exercicio06;

import interfaces.IExercicioBase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio06 implements IExercicioBase {

    private JFrame frame;
    private JLabel labelNome, labelPeso, labelAltura;
    private JTextField textFieldNome, textFieldPeso, textFieldAltura;
    private JButton buttonCalcularIMC;

    public Exercicio06() {
        geraTela();
        instanciaComponentes();
        geraDimensoes();
        geraLocalizacao();
        actionButtonCalculcarIMC();
        adicionaComponentes();
        frame.setVisible(true);
    }

    @Override
    public void geraTela() {
        frame = new JFrame("Exercicio 06");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void instanciaComponentes() {
        labelNome = new JLabel("Nome:");
        textFieldNome = new JTextField();
        labelPeso = new JLabel("Peso:");
        textFieldPeso = new JTextField();
        labelAltura = new JLabel("Altura:");
        textFieldAltura = new JTextField();
        buttonCalcularIMC = new JButton("Calcular IMC!");
    }

    @Override
    public void geraDimensoes() {
        labelNome.setSize(100, 20);
        textFieldNome.setSize(150, 20);
        labelPeso.setSize(50, 20);
        textFieldPeso.setSize(50, 20);
        labelAltura.setSize(50, 20);
        textFieldAltura.setSize(50, 20);
        buttonCalcularIMC.setSize(270, 20);
    }

    @Override
    public void geraLocalizacao() {
        labelNome.setLocation(10, 10);
        textFieldNome.setLocation(10, 30);
        labelPeso.setLocation(170, 10);
        textFieldPeso.setLocation(170, 30);
        labelAltura.setLocation(230, 10);
        textFieldAltura.setLocation(230, 30);
        buttonCalcularIMC.setLocation(10, 60);
    }

    @Override
    public void adicionaComponentes() {
        frame.add(labelNome);
        frame.add(textFieldNome);
        frame.add(labelPeso);
        frame.add(textFieldPeso);
        frame.add(labelAltura);
        frame.add(textFieldAltura);
        frame.add(buttonCalcularIMC);
    }

    private void actionButtonCalculcarIMC() {
        buttonCalcularIMC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(textFieldNome.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "É necessário informar o nome da pessoa!", null, JOptionPane.WARNING_MESSAGE);
                    return;
                }

                String nome = textFieldNome.getText().trim();
                String classificacao = "";

                try {

                    double altura = Double.parseDouble(textFieldAltura.getText().trim());
                    double peso = Double.parseDouble(textFieldPeso.getText().trim());

                    double imc = peso / (altura * altura);

                    if(imc <= 9.99) {
                        classificacao = "Desnutrição Grau V";
                    } else if(imc <= 12.9) {
                        classificacao = "Desnutrição Grau IV";
                    } else if(imc <= 15.9) {
                        classificacao = "Desnutrição Grau III";
                    } else if(imc <= 16.9) {
                        classificacao = "Desnutrição Grau II";
                    } else if(imc <= 18.4) {
                        classificacao = "Desnutrição Grau I";
                    } else if(imc <= 24.9) {
                        classificacao = "Normal";
                    } else if(imc <= 29.9) {
                        classificacao = "Pré-obesidade";
                    } else if(imc <= 34.5) {
                        classificacao = "Obesidade Grau I";
                    } else if(imc <= 39.9) {
                        classificacao = "Obesidade Grau II";
                    } else {
                        classificacao = "Obesidade Grau III";
                    }

                    JOptionPane.showMessageDialog(null, "Nome: " + nome +
                            "\nClassificação do IMC: " + classificacao);

                    textFieldNome.setText("");
                    textFieldAltura.setText("");
                    textFieldPeso.setText("");

                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "O peso ou a altura estão inválidos!", null, JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }
}
