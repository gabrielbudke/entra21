package exemplo06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJRadioButton00 {

    private JFrame frame;
    private JLabel label;
    private JRadioButton radioButtonPreto, radioButtonBranco, radioButtonRosa, radioButtonAzul;
    private ButtonGroup buttonGroupCor;
    private JButton buttonSalvar, buttonLimparSelecao;

    public ExemploJRadioButton00() {
        geraTela();
        instanciaComponentes();
        geraDimensoes();
        geraLocalizacao();
        defineButtonGroupParaJRadioButton();
        estilizaRadioButtons();
        adicionaAcaoBotoes();
        adicionaComponentes();
        frame.setVisible(true);
    }

    private void geraTela(){
        frame = new JFrame("ExemploJRadioButton");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void instanciaComponentes() {
        label = new JLabel("Cor:");
        radioButtonPreto = new JRadioButton("Preto");
        radioButtonBranco = new JRadioButton("Branco");
        radioButtonRosa = new JRadioButton("Rosa");
        radioButtonAzul = new JRadioButton("Azul");
        buttonGroupCor = new ButtonGroup();
        buttonSalvar = new JButton("Salvar");
        buttonLimparSelecao = new JButton("Limpar Seleção");
    }

    private void geraDimensoes() {
        label.setSize(40, 20);
        radioButtonPreto.setSize(100, 20);
        radioButtonBranco.setSize(100, 20);
        radioButtonRosa.setSize(100, 20);
        radioButtonAzul.setSize(100, 20);
        buttonSalvar.setSize(100, 20);
        buttonLimparSelecao.setSize(100, 20);
    }

    private void geraLocalizacao() {
        label.setLocation(10, 10);
        radioButtonPreto.setLocation(10, 35);
        radioButtonBranco.setLocation(115, 35);
        radioButtonRosa.setLocation(220, 35);
        radioButtonAzul.setLocation(325, 35);
        buttonSalvar.setLocation(10, 70);
        buttonLimparSelecao.setLocation(120, 70);
    }

    private void defineButtonGroupParaJRadioButton() {
        buttonGroupCor.add(radioButtonBranco);
        buttonGroupCor.add(radioButtonPreto);
        buttonGroupCor.add(radioButtonRosa);
        buttonGroupCor.add(radioButtonAzul);
    }

    private void adicionaAcaoBotoes() {

        buttonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(radioButtonPreto.isSelected()) {
                    frame.getContentPane().setBackground(Color.black);
                    defineCorDoTexto(Color.white);
                    return;
                }

                if(radioButtonBranco.isSelected()) {
                    frame.getContentPane().setBackground(Color.white);
                    defineCorDoTexto(Color.black);
                    return;
                }

                if(radioButtonRosa.isSelected()) {
                    frame.getContentPane().setBackground(Color.decode("#FF009D"));
                    defineCorDoTexto(Color.black);
                    return;
                }

                if(radioButtonAzul.isSelected()) {
                    frame.getContentPane().setBackground(Color.decode("#1472e3"));
                    defineCorDoTexto(Color.black);
                    return;
                }
            }
        });

        buttonLimparSelecao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGroupCor.clearSelection();
                defineCorDoTexto(Color.white);
            }
        });

    }

    private void defineCorDoTexto(Color cor) {
        radioButtonRosa.setForeground(cor);
        radioButtonBranco.setForeground(cor);
        radioButtonPreto.setForeground(cor);
        radioButtonAzul.setForeground(cor);
        label.setForeground(cor);
    }

    private void estilizaRadioButtons() {
        radioButtonBranco.setContentAreaFilled(false);
        radioButtonPreto.setContentAreaFilled(false);
        radioButtonRosa.setContentAreaFilled(false);
        radioButtonAzul.setContentAreaFilled(false);
    }

    private void adicionaComponentes() {
        frame.add(label);
        frame.add(radioButtonPreto);
        frame.add(radioButtonBranco);
        frame.add(radioButtonRosa);
        frame.add(radioButtonAzul);
        frame.add(buttonSalvar);
        frame.add(buttonLimparSelecao);
    }
}
