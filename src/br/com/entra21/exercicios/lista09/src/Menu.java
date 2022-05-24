import exercicio01.Exercicio01;
import exercicio02.Exercicio02;
import exercicio03.Exercicio03;
import exercicio04.Exercicio04;
import exercicio05.Exercicio05;
import exercicio06.Exercicio06;
import interfaces.IExercicioBase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements IExercicioBase {

    private JFrame frame;
    private JButton buttonExercicio01, buttonExercicio02, buttonExercicio03,
                    buttonExercicio04, buttonExercicio05, buttonExercicio06;

    public Menu() {
        geraTela();
        instanciaComponentes();
        geraDimensoes();
        geraLocalizacao();
        estilizaComponente();
        actionButtonExercicio01();
        actionButtonExercicio02();
        actionButtonExercicio03();
        actionButtonExercicio04();
        actionButtonExercicio05();
        actionButtonExercicio06();
        adicionaComponentes();
        frame.setVisible(true);
    }



    @Override
    public void geraTela() {
        frame = new JFrame("Exercícios Interface Gráfica - Menu");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void instanciaComponentes() {
        buttonExercicio01 = new JButton("Exercício 01");
        buttonExercicio02 = new JButton("Exercício 02");
        buttonExercicio03 = new JButton("Exercício 03");
        buttonExercicio04 = new JButton("Exercício 04");
        buttonExercicio05 = new JButton("Exercicio 05");
        buttonExercicio06 = new JButton("Exercicio 06");
    }

    @Override
    public void geraDimensoes() {
        buttonExercicio01.setSize(125, 20);
        buttonExercicio02.setSize(125, 20);
        buttonExercicio03.setSize(125, 20);
        buttonExercicio04.setSize(125, 20);
        buttonExercicio05.setSize(125, 20);
        buttonExercicio06.setSize(125, 20);
    }

    @Override
    public void geraLocalizacao() {
        buttonExercicio01.setLocation(10, 10);
        buttonExercicio02.setLocation(145, 10);
        buttonExercicio03.setLocation(280, 10);
        buttonExercicio04.setLocation(10, 40);
        buttonExercicio05.setLocation(145, 40);
        buttonExercicio06.setLocation(280, 40);

    }

    @Override
    public void adicionaComponentes() {
        frame.add(buttonExercicio01);
        frame.add(buttonExercicio02);
        frame.add(buttonExercicio03);
        frame.add(buttonExercicio04);
        frame.add(buttonExercicio05);
        frame.add(buttonExercicio06);
    }

    public void estilizaComponente() {
        buttonExercicio01.setFocusPainted(false);
        buttonExercicio02.setFocusPainted(false);
        buttonExercicio03.setFocusPainted(false);
        buttonExercicio04.setFocusPainted(false);
        buttonExercicio05.setFocusPainted(false);
        buttonExercicio06.setFocusPainted(false);
    }

    public void actionButtonExercicio01() {
        buttonExercicio01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio01();
            }
        });
    }

    public void actionButtonExercicio02() {
        buttonExercicio02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio02();
            }
        });
    }

    public void actionButtonExercicio03() {
        buttonExercicio03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio03();
            }
        });
    }

    public void actionButtonExercicio04() {
        buttonExercicio04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio04();
            }
        });
    }

    private void actionButtonExercicio05() {
        buttonExercicio05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio05();
            }
        });
    }

    private void actionButtonExercicio06() {
        buttonExercicio06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio06();
            }
        });
    }


}

