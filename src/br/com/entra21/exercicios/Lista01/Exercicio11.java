package br.com.entra21.exercicios.lista1;

import javax.swing.JOptionPane;

/**
 * 11. Solicite o dia, mês e ano de nascimento e apresente as seguintes informações:
 *      > Quantidade de dias vivo;
 *      > Quantidade de anos vivo;
 *      > Quantidade de meses vivo;
 *      > Quantidade de horas vivo;
 *      > Quantidade de minutos vivo;      
 *      > Quantidade de segundos vivo;      
 */
public class Exercicio11 {
    public static void main(String[] args) {
        
        int ANO_ATUAL = 2018, MESES_POR_ANO = 12, DIAS_POR_ANO = 365, 
            HORAS_POR_DIA = 24, MINUTOS_POR_HORA = 60, SEGUNDOS_POR_MINUTOS = 60; 

        String info;

        int diaNascimento, mesNascimento, anoNascimento;

        String dataNascimento = JOptionPane.showInputDialog("Qual sua data de nascimento? (DD/MM/YYYY)");

        diaNascimento = Integer.parseInt(dataNascimento.substring(0, 2));
        mesNascimento = Integer.parseInt(dataNascimento.substring(3, 5));
        anoNascimento = Integer.parseInt(dataNascimento.substring(6, 10));

        int anosVividos = ANO_ATUAL - anoNascimento;
        int mesesVividos = anosVividos * MESES_POR_ANO;
        int diasVividos = anosVividos * DIAS_POR_ANO;
        int horasVividas = diasVividos * HORAS_POR_DIA;
        int minutosVividos = horasVividas + MINUTOS_POR_HORA;
        int segundosVivdos = minutosVividos + SEGUNDOS_POR_MINUTOS;


        info = "Data Nascimento: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento +
            "\nQuantidade de dias vivos: " + diasVividos + 
            "\nQuantidade de meses vivos: " + mesesVividos +
            "\nQuantidade de anos vivos: " + anosVividos + 
            "\nQuantidade de horas vivos: " + horasVividas + 
            "\nQuantidade de minutos vivos: " + minutosVividos + 
            "\nQuantidade de segundos vivos: " + segundosVivdos;

        JOptionPane.showMessageDialog(null, info);

    }
}