package exercicio04;

import interfaces.IExercicioBase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 4. Crie um JFrame contendo os seguintes componentes:
 *      - JLabel para o número
 *      - JTextFild para o número
 *      - JButton para verificar
 *
 *  Ao ocorrer o evento do clique no botão, deve-se obter o número digitado no campo
 *  de número e verificar de acordo com os itens abaixo:
 *      - Par / Impar
 *      - Positivo / Negativo
 *
 *  Obs.: Deve apresentar em um único JOptionPane a mensagem.
 *  Exemplo: 2 é um número par e positiv
 */

public class Exercicio04 implements IExercicioBase {

    private JFrame frame;
    private JLabel labelNumero;
    private JTextField textFieldNumero;
    private JButton buttonVerificar;

    public Exercicio04() {
        geraTela();
        instanciaComponentes();
        geraDimensoes();
        geraLocalizacao();
        estilizaCompomentes();
        actionButtonVerificar();
        adicionaComponentes();
        frame.setVisible(true);
    }

    @Override
    public void geraTela() {
        frame = new JFrame("Exercício 04");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void instanciaComponentes() {
        labelNumero = new JLabel("Número:");
        textFieldNumero = new JTextField();
        buttonVerificar = new JButton("Verificar!");
    }

    @Override
    public void geraDimensoes() {
        labelNumero.setSize(100, 20);
        textFieldNumero.setSize(100, 20);
        buttonVerificar.setSize(100, 20);
    }

    @Override
    public void geraLocalizacao() {
        labelNumero.setLocation(10, 10);
        textFieldNumero.setLocation(10, 30);
        buttonVerificar.setLocation(10, 60);
    }

    public void estilizaCompomentes() {
        buttonVerificar.setFocusPainted(false);
    }

    @Override
    public void adicionaComponentes() {
        frame.add(labelNumero);
        frame.add(textFieldNumero);
        frame.add(buttonVerificar);
    }

    private void actionButtonVerificar() {
        buttonVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(textFieldNumero.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "É necessário informar um número para verficação!", null, JOptionPane.WARNING_MESSAGE);
                    return;
                }

                try {
                    int numero = Integer.parseInt(textFieldNumero.getText());
                    String mensagemVerificacao = "O número " + numero + " é ";

                    if(numero > 0) {
                        mensagemVerificacao += "positivo";
                    } else {
                        mensagemVerificacao += "negativo";
                    }

                    mensagemVerificacao += " e ";

                    if (numero % 2 == 0) {
                        mensagemVerificacao += "par!";
                    } else {
                        mensagemVerificacao += "ímpar!";
                    }

                    JOptionPane.showMessageDialog(null, mensagemVerificacao);

                } catch (NumberFormatException numberFormatException) {
                    JOptionPane.showMessageDialog(null, "O número informado não é válido!", null, JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }
}
