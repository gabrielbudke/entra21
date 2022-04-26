package exemplo08;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ExemploJTable00 {

    private JFrame frame;
    private JTable table;
    private DefaultTableModel defaultTableModel;
    private JScrollPane scrollPane;

    public ExemploJTable00() {
        geraTela();
        instanciaComponentes();
        geraDimensoes();
        geraLocalizacao();
        configurarTableModel();
        adicionaComponentes();

        frame.setVisible(true);
    }

    public void geraTela() {
        frame = new JFrame("ExemploJCheckBox00");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void instanciaComponentes() {
        table = new JTable();
        Object[] colums = new Object[] {
                "Nome", "Idade", "Altura"
        };

        scrollPane = new JScrollPane(table);
        defaultTableModel = new DefaultTableModel(colums, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    }

    public void configurarTableModel() {
        defaultTableModel.addRow(new Object[] {
                "Gustavo", "22", 1.68
        });

        defaultTableModel.addRow(new Object[] {
                "Leonardo", "21", 1.76
        });

        defaultTableModel.addRow(new Object[] {
                "Charles", "20", 1.75
        });

        table.setModel(defaultTableModel);
    }

    public void geraLocalizacao() {
        scrollPane.setLocation(10, 10);
    }

    public void geraDimensoes() {
        scrollPane.setSize(400, 400);
    }

    public void adicionaComponentes() {
        frame.add(scrollPane);
    }

}
