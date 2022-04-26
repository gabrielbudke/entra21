package exemplo07;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJCheckBox00 implements ExemploJCheckBox00Base {

    private JFrame frame;
    private JCheckBox checkBoxAceitoTermo, checkBoxLiTermo;
    private JButton buttonSalvar, buttonLimpar;


    public ExemploJCheckBox00() {
        geraTela();
        instanciaComponentes();
        geraDimensoes();
        geraLocalizacao();
        adicionaComponentes();
        acaoBotaoSalvar();
        acaoBotaoLimpar();
        frame.setVisible(true);
    }

    @Override
    public void geraTela() {
        frame = new JFrame("ExemploJCheckBox00");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void instanciaComponentes() {
        checkBoxAceitoTermo = new JCheckBox("Eu aceito o termo");
        checkBoxLiTermo = new JCheckBox("Eu li os termos");
        buttonSalvar = new JButton("Salvar");
        buttonLimpar = new JButton("Limpar");
    }

    @Override
    public void geraLocalizacao() {
        checkBoxAceitoTermo.setLocation(10, 10);
        checkBoxLiTermo.setLocation(170, 10);
        buttonSalvar.setLocation(10, 40);
        buttonLimpar.setLocation(120, 40);
    }

    @Override
    public void geraDimensoes() {
        checkBoxAceitoTermo.setSize(150, 20);
        checkBoxLiTermo.setSize(150, 20);
        buttonSalvar.setSize(100, 20);
        buttonLimpar.setSize(100, 20);
    }

    public void acaoBotaoSalvar() {
        buttonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!checkBoxLiTermo.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Você precisa ler o termo!");
                    return;
                }

                if(!checkBoxAceitoTermo.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Você precisa aceitar o termo!");
                    return;
                }

                JOptionPane.showMessageDialog(null, "Muito bem, você está de parabéns!");

            }
        });
    }

    public void acaoBotaoLimpar() {
        buttonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkBoxAceitoTermo.setSelected(false);
                checkBoxLiTermo.setSelected(false);
            }
        });
    }

    @Override
    public void adicionaComponentes() {
        frame.add(checkBoxAceitoTermo);
        frame.add(checkBoxLiTermo);
        frame.add(buttonSalvar);
        frame.add(buttonLimpar);
    }
}
