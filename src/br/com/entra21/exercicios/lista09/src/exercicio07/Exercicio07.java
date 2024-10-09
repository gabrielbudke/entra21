package exercicio07;

import interfaces.IExercicioBase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio07 implements IExercicioBase {

    private static final int WIDTH = 150;
    private static final int HEIGHT = 20;

    private double valorHora;

    private JFrame frame;
    private JLabel labelName, labelCargo, labelQuantidadeHoras,
            labelInss, labelSindicato, labelTransporte, labelRefeicao, labelEducacao;

    private JTextField textFieldName, textFieldQuantidadeHora,
            textFieldInss, textFieldSindicato, textFieldTransporte,
            textFieldRefeicao, textFieldEducacao;

    private JTextArea textAreaResultado;
    private JScrollPane scrollPaneResultado;
    private JComboBox comboBoxCargo;

    private JButton buttonProcessar;

    public Exercicio07() {
        geraTela();
        instanciaComponentes();
        geraDimensoes();
        geraLocalizacao();
        carregaAcoes();
        adicionaComponentes();

        frame.setVisible(true);
    }

    @Override
    public void geraTela() {
        frame = new JFrame("Exercício 07");
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void instanciaComponentes() {
        labelName = new JLabel("Nome:");
        textFieldName = new JTextField();

        labelCargo = new JLabel("Cargo:");
        comboBoxCargo = new JComboBox();

        DefaultComboBoxModel defaultComboBoxCargoModel = new DefaultComboBoxModel(new Object[]{
                "", "Programador Júnior", "Programador Pleno", "Programador Sênior"
        });

        comboBoxCargo.setModel(defaultComboBoxCargoModel);

        labelQuantidadeHoras = new JLabel("Quantidade de horas:");
        textFieldQuantidadeHora = new JTextField();

        labelInss = new JLabel("Valor do INSS:");
        textFieldInss = new JTextField();

        labelSindicato = new JLabel("Contribuição Sindical:");
        textFieldSindicato = new JTextField();

        labelTransporte = new JLabel("Vale Transporte:");
        textFieldTransporte = new JTextField();

        labelRefeicao = new JLabel("Auxílio Refeição:");
        textFieldRefeicao = new JTextField();

        labelEducacao = new JLabel("Auxílio Educação:");
        textFieldEducacao = new JTextField();

        buttonProcessar = new JButton("Processar");

        textAreaResultado = new JTextArea();
        scrollPaneResultado = new JScrollPane(textAreaResultado);

    }

    @Override
    public void geraDimensoes() {
        labelName.setSize(WIDTH, HEIGHT);
        textFieldName.setSize(WIDTH + 150, HEIGHT);

        labelCargo.setSize(WIDTH, HEIGHT);
        comboBoxCargo.setSize(WIDTH + 150, HEIGHT);

        labelQuantidadeHoras.setSize(WIDTH, HEIGHT);
        textFieldQuantidadeHora.setSize(WIDTH, HEIGHT);

        labelInss.setSize(WIDTH, HEIGHT);
        textFieldInss.setSize(WIDTH, HEIGHT);
        // formattedTextFieldValor.setSize(WIDTH, HEIGHT);

        labelSindicato.setSize(WIDTH, HEIGHT);
        textFieldSindicato.setSize(WIDTH, HEIGHT);

        labelTransporte.setSize(WIDTH, HEIGHT);
        textFieldTransporte.setSize(WIDTH, HEIGHT);

        labelRefeicao.setSize(WIDTH, HEIGHT);
        textFieldRefeicao.setSize(WIDTH, HEIGHT);

        labelEducacao.setSize(WIDTH, HEIGHT);
        textFieldEducacao.setSize(WIDTH, HEIGHT);

        buttonProcessar.setSize(frame.getWidth() - 40, HEIGHT + 20);

        scrollPaneResultado.setSize(frame.getWidth() - 40, 200);
    }

    @Override
    public void geraLocalizacao() {
        labelName.setLocation(10, 10);
        textFieldName.setLocation(labelName.getX(), labelName.getY() + labelName.getHeight());

        labelCargo.setLocation(textFieldName.getX(), textFieldName.getY() + textFieldName.getHeight() + 5);
        comboBoxCargo.setLocation(labelCargo.getX(), labelCargo.getY() + labelCargo.getHeight());

        labelQuantidadeHoras.setLocation(comboBoxCargo.getX(), comboBoxCargo.getY() + comboBoxCargo.getHeight() + 5);
        textFieldQuantidadeHora.setLocation(labelQuantidadeHoras.getX(), labelQuantidadeHoras.getY() + labelQuantidadeHoras.getHeight());

        labelInss.setLocation(labelQuantidadeHoras.getX() + textFieldQuantidadeHora.getWidth() + 5, labelQuantidadeHoras.getY());
        textFieldInss.setLocation(textFieldQuantidadeHora.getX() + textFieldQuantidadeHora.getWidth() + 5, textFieldQuantidadeHora.getY());

        labelSindicato.setLocation(labelInss.getX() + textFieldInss.getWidth() + 5, labelInss.getY());
        textFieldSindicato.setLocation(textFieldInss.getX() + textFieldInss.getWidth() + 5, textFieldInss.getY());

        labelTransporte.setLocation(textFieldQuantidadeHora.getX(), textFieldQuantidadeHora.getY() + textFieldQuantidadeHora.getHeight() + 5);
        textFieldTransporte.setLocation(labelTransporte.getX(), labelTransporte.getY() + labelTransporte.getHeight());

        labelRefeicao.setLocation(labelTransporte.getX() + labelTransporte.getWidth() + 5, labelTransporte.getY());
        textFieldRefeicao.setLocation(textFieldTransporte.getX() + textFieldTransporte.getWidth() + 5, textFieldTransporte.getY());

        labelEducacao.setLocation(labelRefeicao.getX() + labelRefeicao.getWidth() + 5, labelRefeicao.getY());
        textFieldEducacao.setLocation(textFieldRefeicao.getX() + textFieldRefeicao.getWidth() + 5, textFieldRefeicao.getY());

        buttonProcessar.setLocation(10, textFieldEducacao.getY() + textFieldEducacao.getHeight() + 20);

        scrollPaneResultado.setLocation(10, buttonProcessar.getY() + buttonProcessar.getHeight() + 20);

    }

    @Override
    public void adicionaComponentes() {
        frame.add(labelName);
        frame.add(textFieldName);
        frame.add(labelCargo);
        frame.add(comboBoxCargo);
        frame.add(labelQuantidadeHoras);
        frame.add(textFieldQuantidadeHora);
        frame.add(labelInss);
        frame.add(textFieldInss);
        frame.add(labelSindicato);
        frame.add(textFieldSindicato);
        frame.add(labelTransporte);
        frame.add(textFieldTransporte);
        frame.add(labelRefeicao);
        frame.add(textFieldRefeicao);
        frame.add(labelEducacao);
        frame.add(textFieldEducacao);
        frame.add(buttonProcessar);
        frame.add(scrollPaneResultado);

    }

    private void carregaAcoes() {
        buttonProcessar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    int quantidadeHoras = 0;

                    String nome = textFieldName.getText();
                    String cargo = comboBoxCargo.getSelectedItem().toString();
                    System.out.println(comboBoxCargo.getSelectedIndex());

                    // Verifica se o nome está vazio
                    if(nome.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "É necessário informar seu nome!", "Alerta", JOptionPane.WARNING_MESSAGE);
                        textFieldName.requestFocus();
                        return;
                    }

                    // Verifica se o cargo foi escolhido
                    if(cargo.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "É necessário escolher um cargo!", "Alerta", JOptionPane.WARNING_MESSAGE);
                        comboBoxCargo.showPopup();
                        return;
                    }

                    if (cargo.equalsIgnoreCase("Programador Júnior")) {
                        valorHora = 10;
                    } else if (cargo.equalsIgnoreCase("Programador Pleno")) {
                        valorHora = 12;
                    } else {
                        valorHora = 18;
                    }

                    try {
                        if (textFieldQuantidadeHora.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "É necessário informar quantidade de horas!", "Alerta", JOptionPane.WARNING_MESSAGE);
                            textFieldQuantidadeHora.requestFocus();
                            return;
                        }

                        quantidadeHoras = Integer.parseInt(textFieldQuantidadeHora.getText().trim());

                    } catch (Exception exception) {
                        System.out.println("[ERROR]: " + exception.getMessage());
                        JOptionPane.showMessageDialog(null, "Houve um erro ao processar ficha financeira: \n" + exception,
                                "ERRO", JOptionPane.ERROR_MESSAGE);
                    }

                    double valorInss = Double.parseDouble(!textFieldInss.getText().isEmpty() ? textFieldInss.getText() : "0");
                    double valorSindicato = Double.parseDouble(!textFieldSindicato.getText().isEmpty() ? textFieldSindicato.getText() : "0");
                    double valorTransporte = Double.parseDouble(!textFieldTransporte.getText().isEmpty() ? textFieldTransporte.getText() : "0");
                    double valorRefeicao = Double.parseDouble(!textFieldRefeicao.getText().isEmpty() ? textFieldRefeicao.getText() : "0");
                    double valorEducacao = Double.parseDouble(!textFieldRefeicao.getText().isEmpty() ? textFieldRefeicao.getText() : "0");

                    double salarioBruto = calcularSalario(valorHora, quantidadeHoras);
                    double salarioTotal = salarioBruto + valorInss + valorSindicato + valorTransporte + valorRefeicao + valorEducacao;

                    textAreaResultado.setText("Salário: R$" + String.format("%.2f", salarioTotal));

                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Houve um erro ao processar ficha financeira: \n" + exception,
                            "ERRO", JOptionPane.ERROR_MESSAGE);
                    System.out.println("[ERROR]: Houve um erro ao processar ficha financeira: " + exception);
                }

            }
        });
    }

    private double calcularSalario(double valorHora, int quantidadeHoras) {
        return valorHora * quantidadeHoras;
    }

}
