package exercicio02;

import interfaces.IExercicioBase;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 2. Crie um JFrame contendo os seguintes componentes:
 *      - JLabel para o número
 *      - JTextFild para o número
 *      - JButton para multiplicar o número por 50
 *
 *  Ao ocorrer o evento do clique no botão, deve-se obter o número do
 *  campo de número e multiplicar o mesmo por 50 e apresentar o
 *  resultado para o usuário.
 *
 */

public class Exercicio02 implements IExercicioBase {

    private JFrame frame;
    private JLabel labelNumero;
    private JTextField textFieldNumero;
    private JButton buttonMultiplicarPor50;

    public Exercicio02() {
        geraTela();
        instanciaComponentes();
        geraDimensoes();
        geraLocalizacao();
        actionButtonMultiplicarPor50();
        adicionaComponentes();
        frame.setVisible(true);
    }

    @Override
    public void geraTela() {
        frame = new JFrame("Exercício 02");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void instanciaComponentes() {
        labelNumero = new JLabel("Número:");
        textFieldNumero = new JTextField();
        buttonMultiplicarPor50 = new JButton("Multiplicar por 50!");
    }

    @Override
    public void geraDimensoes() {
        labelNumero.setSize(100, 20);
        textFieldNumero.setSize(150, 20);
        buttonMultiplicarPor50.setSize(150, 20);
    }

    @Override
    public void geraLocalizacao() {
        labelNumero.setLocation(10, 10);
        textFieldNumero.setLocation(10, 30);
        buttonMultiplicarPor50.setLocation(10, 60);
    }

    public void actionButtonMultiplicarPor50() {
        buttonMultiplicarPor50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(textFieldNumero.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "É necessário informar um número para multiplicar!", null, JOptionPane.WARNING_MESSAGE);
                    return;
                }

                try {
                    int numero = Integer.parseInt(textFieldNumero.getText());
                    int multiplicadoPor50 = numero * 50;
                    JOptionPane.showMessageDialog(null, "Resultado: " + multiplicadoPor50);
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Houve um problema ao multiplicar!", null, JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }

    @Override
    public void adicionaComponentes() {
        frame.add(labelNumero);
        frame.add(textFieldNumero);
        frame.add(buttonMultiplicarPor50);
    }
}
