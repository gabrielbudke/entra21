package exemplo05;

import javax.swing.*;

public class ExemploJTextArea00 {

    private JFrame frame;
    private JLabel label;
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public ExemploJTextArea00() {
        geraTela();
        instaciaComponentes();
        geraDimensoes();
        geraLocalizacao();
        configuraJScrollPane();
        adicionaComponentes();
        frame.setVisible(true);
    }

    private void geraTela() {
        frame = new JFrame("ExemploJTextArea");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    private void instaciaComponentes() {
        label = new JLabel("Descrição:");
        textArea = new JTextArea();
        scrollPane = new JScrollPane();
    }

    private void geraDimensoes() {
        label.setSize(70, 20);
        scrollPane.setSize(450, 410);
    }

    private void geraLocalizacao() {
        label.setLocation(10, 10);
        scrollPane.setLocation(10, 35);
    }

    private void configuraJScrollPane() {
        scrollPane.setViewportView(textArea);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        textArea.setLineWrap(true);
    }

    private void adicionaComponentes() {
        frame.add(label);
        frame.add(scrollPane);
    }
}
