package view;

import bean.CustomerBean;
import bean.util.CustomerUtil;
import dao.CustomerDao;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Logger;

public class CustomerScreen implements IBaseGUI {

    Logger logger = Logger.getLogger(getClass().getName());

    private JFrame frame;
    private JLabel labelId;
    private JLabel labelName;
    private JLabel labelDateOfBirth;
    private JLabel labelDocument;
    private JTextField textFieldId;
    private JTextField textFieldName;
    private JFormattedTextField formattedTextFieldDateOfBirth;
    private JFormattedTextField formattedTextFieldDocument;
    private JButton buttonSalvar;
    private JButton buttonEditar;
    private JButton buttonExcluir;
    private JTable customerTable;
    private DefaultTableModel defaultTableModelCustomer;
    private JScrollPane scrollPaneCustomerTable;

    public CustomerScreen() {
        instanciaComponentes();
        geraTela();
        geraDimensoes();
        geraLocalizacao();
        configuraJFormattedTextFields();
        adicionaComponentes();
        configuraJTableModel();
        acaoTeclas();
        acaoBotaoSalvar();
        acaoBotaoEditar();
        acaoBotaoExcluir();
        customizarButtons();
        populateCustomerTable();
        frame.setVisible(true);
    }

    private void acaoTeclas() {
        textFieldName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { // method is empty

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    formattedTextFieldDateOfBirth.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) { // method is empty

            }
        });

        formattedTextFieldDateOfBirth.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { // method is empty

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    formattedTextFieldDocument.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) { // method is empty

            }
        });
    }

    private void customizarButtons() {
        buttonExcluir.setBackground(Color.decode("#C82333"));
        buttonExcluir.setForeground(Color.decode("#F0F0F0"));

        buttonEditar.setBackground(Color.decode("#0069D9"));
        buttonEditar.setForeground(Color.decode("#F0F0F0"));

    }

    @Override
    public void geraTela() {
        frame = new JFrame("Customer Controll");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void instanciaComponentes() {

        labelId = new JLabel("ID:");
        textFieldId = new JTextField();
        textFieldId.setEnabled(false);

        labelName = new JLabel("Name:");
        textFieldName = new JTextField();

        labelDateOfBirth = new JLabel("Date of birth:");
        formattedTextFieldDateOfBirth = new JFormattedTextField();

        labelDocument = new JLabel("Document (CPF):");
        formattedTextFieldDocument = new JFormattedTextField();

        buttonSalvar = new JButton("Salvar");
        buttonEditar = new JButton("Editar");
        buttonExcluir = new JButton("Excluir");

        customerTable = new JTable();
        scrollPaneCustomerTable = new JScrollPane(customerTable);
        defaultTableModelCustomer = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

    }

    @Override
    public void geraDimensoes() {
        labelId.setSize(100, 20);
        textFieldId.setSize(100, 20);
        labelName.setSize(100, 20);
        textFieldName.setSize(200, 20);
        labelDateOfBirth.setSize(100, 20);
        formattedTextFieldDateOfBirth.setSize(100, 20);
        labelDocument.setSize(100, 20);
        formattedTextFieldDocument.setSize(150, 20);
        buttonSalvar.setSize(100, 20);
        buttonEditar.setSize(100, 20);
        buttonExcluir.setSize(100, 20);

        scrollPaneCustomerTable.setSize(400, 200);
    }

    @Override
    public void geraLocalizacao() {
        labelId.setLocation(10, 10);
        textFieldId.setLocation(30, 10);
        labelName.setLocation(10, 40);
        textFieldName.setLocation(50, 40);
        labelDateOfBirth.setLocation(10, 70);
        formattedTextFieldDateOfBirth.setLocation(85, 70);
        labelDocument.setLocation(10, 100);
        formattedTextFieldDocument.setLocation(110, 100);
        buttonSalvar.setLocation(10, 130);
        buttonEditar.setLocation(120, 130);
        buttonExcluir.setLocation(230, 130);
        scrollPaneCustomerTable.setLocation(10, 160);
    }

    @Override
    public void adicionaComponentes() {
        frame.add(labelId);
        frame.add(textFieldId);
        frame.add(labelName);
        frame.add(textFieldName);
        frame.add(labelDateOfBirth);
        frame.add(formattedTextFieldDateOfBirth);
        frame.add(labelDocument);
        frame.add(formattedTextFieldDocument);
        frame.add(buttonSalvar);
        frame.add(buttonEditar);
        frame.add(buttonExcluir);
        frame.add(scrollPaneCustomerTable);
    }

    private void configuraJFormattedTextFields() {
        try {
            MaskFormatter dateOfBirthFormatter = new MaskFormatter("##/##/####");
            dateOfBirthFormatter.install(formattedTextFieldDateOfBirth);
        } catch (ParseException exception) {
            logger.warning("Erro ao formatar máscara: " + exception.getMessage());
        }

        try {
            MaskFormatter documentFormatter = new MaskFormatter("###.###.###-##");
            documentFormatter.install(formattedTextFieldDocument);
        } catch (ParseException exception) {
            logger.warning("Erro ao formatar máscara: " + exception.getMessage());
        }
    }

    private void configuraJTableModel() {
        defaultTableModelCustomer.addColumn("Id");
        defaultTableModelCustomer.addColumn("Name");
        defaultTableModelCustomer.addColumn("Date of birth");
        defaultTableModelCustomer.addColumn("Document");
        customerTable.getTableHeader().setResizingAllowed(true);
        customerTable.getTableHeader().setReorderingAllowed(false);
        customerTable.setModel(defaultTableModelCustomer);

    }

    private void populateCustomerTable() {
        CustomerDao customerDao = new CustomerDao();
        List<CustomerBean> customers = customerDao.getCustomers();
        for (CustomerBean customer: customers) {
            defaultTableModelCustomer.addRow(new Object[] {
                    customer.getId(),
                    customer.getName(),
                    customer.getDateOfBirth(),
                    customer.getDocument()
            });
        }
    }

    private void acaoBotaoSalvar() {
        buttonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textFieldName.getText();
                String dateOfBirth = formattedTextFieldDateOfBirth.getText();
                String document = formattedTextFieldDocument.getText().trim().replace(".", "").replace("-", "");

                if(name.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo 'Name' precisa ser preenchido!");
                    return;
                }

                if(dateOfBirth.trim().replace("/", "").isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo 'Date of birth' precisa ser preenchido!");
                    return;
                }

                if(document.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo 'Document' precisa ser preenchido!");
                    return;
                }

                CustomerBean customer = new CustomerBean(name, CustomerUtil.convertDateToUS(dateOfBirth), document);

                if(textFieldId.getText().isEmpty()) {
                    int id = new CustomerDao().save(customer);
                    customer.setId(id);
                    defaultTableModelCustomer.addRow(new Object[]{
                            customer.getId(),
                            customer.getName(),
                            customer.getDateOfBirth(),
                            customer.getDocument()
                    });
                } else {
                    int id = Integer.parseInt(textFieldId.getText());
                    customer.setId(id);
                    boolean isAlterado = new CustomerDao().update(customer);
                    if(isAlterado) {
                        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                        int linhaSelecionada = customerTable.getSelectedRow();
                        defaultTableModelCustomer.setValueAt(customer.getId(), linhaSelecionada, 0);
                        defaultTableModelCustomer.setValueAt(customer.getName(), linhaSelecionada, 1);
                        defaultTableModelCustomer.setValueAt(customer.getDateOfBirth(), linhaSelecionada, 2);
                        defaultTableModelCustomer.setValueAt(customer.getDocument(), linhaSelecionada, 3);
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível alterar o registro.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                limparCampos();
            }
        });
    }

    private void acaoBotaoExcluir() {
        buttonExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linhaSelecionada = customerTable.getSelectedRow();

                if(linhaSelecionada == -1) {
                    JOptionPane.showMessageDialog(null, "Nenhum registro foi selecionado para exclusão.", "AVISO", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                int id = Integer.parseInt(customerTable.getValueAt(linhaSelecionada, 0).toString());
                boolean isDeletado = new CustomerDao().delete(id);
                if(isDeletado) {
                    defaultTableModelCustomer.removeRow(linhaSelecionada);
                }
            }
        });
    }

    private void acaoBotaoEditar() {
        buttonEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int linhaSelecionada = customerTable.getSelectedRow();

                if (linhaSelecionada == -1) {
                    JOptionPane.showMessageDialog(null, "Nenhum registro foi selecionado para exclusão.", "AVISO", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                int id = Integer.parseInt(customerTable.getValueAt(linhaSelecionada, 0).toString());
                CustomerBean customer = new CustomerDao().getCustomerById(id);
                textFieldId.setText(String.valueOf(customer.getId()));
                textFieldName.setText(customer.getName());
                formattedTextFieldDateOfBirth.setText(CustomerUtil.convertDateToBR(customer.getDateOfBirth()));
                formattedTextFieldDocument.setText(customer.getDocument());
            }
        });
    }


    private void limparCampos() {
        textFieldId.setText("");
        textFieldName.setText("");
        formattedTextFieldDateOfBirth.setText("");
        formattedTextFieldDocument.setText("");
    }

}
