package exercicio05;

import interfaces.IExercicioBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 5. Crie um JFrame contendo os seguintes componentes:
 *      - Jlabel para número 1
 *      - JLabel para número 2
 *      - JLabel para resultado
 *      - JTextField para número 1
 *      - JTextField para número 2
 *      - JTextArea para resultado
 *      - JScrollPane para resultado
 *      - JButton para somar
 *      - JButton para subtrair
 *      - JButton para multiplicar
 *      - JButton para dividir
 *
 *  Somar: Ao ocorrer o evento do clique no botão, deve-se obter o número 1 e
 *  o número 2, realize a soma desses números e apresente no
 *  JTextArea do resultado.
 *
 *  Subtrair: Ao ocorrer o evento do clique no botão, deve-se obter o número 1 e
 *  o número 2, realize a subtração desses números e apresente no
 *  JTextArea do resultado.
 *
 *  Multiplicar: Ao ocorrer o evento do clique no botão, deve-se obter o número 1
 *  e o número 2, realize a multiplicação desses números e apresente no
 *  JTextArea do resultado.
 *
 *  Dividir: Ao ocorrer o evento do clique no botão, deve-se obter o número 1 e
 *  o número 2, realize a divisão desses números e apresente no JTextArea do resultado.
 */

public class Exercicio05 implements IExercicioBase {

    private JFrame frame;
    private JLabel labelNumero1, labelNumero2, labelResultado;
    private JTextField textFieldNumero1, textFieldNumero2;
    private JButton buttonSomar, buttonSubtrair, buttonDividir, buttonMultiplicar;
    private JTextArea textAreaResultado;
    private JScrollPane scrollPaneResultado;

    public Exercicio05() {
        geraTela();
        instanciaComponentes();
        geraDimensoes();
        geraLocalizacao();
        configuraJScrollPane();
        actionButtonSomar();
        actionButtonSubtrair();
        actionButtonMultiplicar();
        actionButtonDividir();
        adicionaComponentes();
        frame.setVisible(true);
    }

    @Override
    public void geraTela() {
        frame = new JFrame("Exercicio 05");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void instanciaComponentes() {
        labelNumero1 = new JLabel("Número 1:");
        textFieldNumero1 = new JTextField();
        labelNumero2 = new JLabel("Número 2:");
        textFieldNumero2 = new JTextField();
        labelResultado = new JLabel("Resultado:");
        textAreaResultado = new JTextArea();
        scrollPaneResultado = new JScrollPane();
        buttonSomar = new JButton("Somar");
        buttonSubtrair = new JButton("Subtrair");
        buttonDividir = new JButton("Dividir");
        buttonMultiplicar = new JButton("Multiplicar");
    }

    @Override
    public void geraDimensoes() {
        labelNumero1.setSize(100, 20);
        textFieldNumero1.setSize(100, 20);
        labelNumero2.setSize(100, 20);
        textFieldNumero2.setSize(100, 20);
        labelResultado.setSize(100, 20);
        scrollPaneResultado.setSize(100, 40);
        buttonSomar.setSize(170, 20);
        buttonSubtrair.setSize(170, 20);
        buttonMultiplicar.setSize(170, 20);
        buttonDividir.setSize(170, 20);
    }

    @Override
    public void geraLocalizacao() {
        labelNumero1.setLocation(10, 10);
        textFieldNumero1.setLocation(80, 10);
        labelNumero2.setLocation(10, 40);
        textFieldNumero2.setLocation(80, 40);
        labelResultado.setLocation(210, 10);
        scrollPaneResultado.setLocation(210, 40);
        buttonSomar.setLocation(10, 70);
        buttonSubtrair.setLocation(10, 100);
        buttonMultiplicar.setLocation(10, 130);
        buttonDividir.setLocation(10, 160);
    }

    @Override
    public void adicionaComponentes() {
        frame.add(labelNumero1);
        frame.add(textFieldNumero1);
        frame.add(labelNumero2);
        frame.add(textFieldNumero2);
        frame.add(labelResultado);
        frame.add(scrollPaneResultado);
        frame.add(buttonSomar);
        frame.add(buttonSubtrair);
        frame.add(buttonMultiplicar);
        frame.add(buttonDividir);
    }

    public void configuraJScrollPane() {
        scrollPaneResultado.setViewportView(textAreaResultado);
        scrollPaneResultado.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        textAreaResultado.setEditable(false);
        textAreaResultado.setBackground(Color.LIGHT_GRAY);
    }

    private void actionButtonSomar() {
        buttonSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(textFieldNumero1.getText().trim().isEmpty() || textFieldNumero2.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "É necessário informar os dois números para somar!", null, JOptionPane.WARNING_MESSAGE);
                    return;
                }

                try {
                    double numero1 = Double.parseDouble(textFieldNumero1.getText()) ;
                    double numero2 = Double.parseDouble(textFieldNumero2.getText());

                    double resultado = numero1 + numero2;

                    textAreaResultado.setText(String.valueOf(resultado));

                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "O número informado não é válido!", null, JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }

    private void actionButtonSubtrair() {
        buttonSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(textFieldNumero1.getText().trim().isEmpty() || textFieldNumero2.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "É necessário informar os dois números para subtrair!", null, JOptionPane.WARNING_MESSAGE);
                    return;
                }

                try {
                    double numero1 = Double.parseDouble(textFieldNumero1.getText());
                    double numero2 = Double.parseDouble(textFieldNumero2.getText());

                    double resultado = numero1 - numero2;

                    textAreaResultado.setText(String.valueOf(resultado));

                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "O número informado não é válido!", null, JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }

    private void actionButtonMultiplicar() {
        buttonMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(textFieldNumero1.getText().trim().isEmpty() || textFieldNumero2.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "É necessário informar os dois números para multiplicar!", null, JOptionPane.WARNING_MESSAGE);
                    return;
                }



                try {
                    double numero1 = Double.parseDouble(textFieldNumero1.getText());
                    double numero2 = Double.parseDouble(textFieldNumero2.getText());

                    double resultado = numero1 * numero2;

                    textAreaResultado.setText(String.valueOf(resultado));

                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "O número informado não é válido!", null, JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }

    private void actionButtonDividir() {
        buttonDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(textFieldNumero1.getText().trim().isEmpty() || textFieldNumero2.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "É necessário informar os dois números para multiplicar!", null, JOptionPane.WARNING_MESSAGE);
                    return;
                }

                try {
                    double numero1 = Double.parseDouble(textFieldNumero1.getText());
                    double numero2 = Double.parseDouble(textFieldNumero2.getText());

                    if((numero1 == 0) || (numero2 == 0)) {
                        JOptionPane.showMessageDialog(null, "Não é possível fazer divisão por 0!", null, JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    double resultado = numero1 / numero2;

                    textAreaResultado.setText(String.valueOf(resultado));

                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "O número informado não é válido!", null, JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

}
