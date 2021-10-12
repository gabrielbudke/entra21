/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entra21.exercicios.lista07.ArrayList.src.exercicios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * 5. Solicite ao usuário quatro nomes e um outro nome, com esse nome, deve-se 
 *    verificar se ele está contido no ArrayList ou não e esta informação deve ser
 *    apresentada ao usuário.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio05 {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        // Chama o método para cadastrar os nomes
        cadastrar(nomes);

        String busca = JOptionPane
                .showInputDialog(null, "Qual nome deseja buscar?", "Buscar nome", JOptionPane.QUESTION_MESSAGE)
                .toUpperCase().trim();

        boolean nomeExiste = verificaSeNomeExiste(busca, nomes);

        if (nomeExiste) {
            JOptionPane.showMessageDialog(null, "O nome que está buscando já está contido no ArrayList!", "Buscar Nome",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "O nome que está buscando NÂO está contido no ArrayList!",
                    "Buscar Nome", JOptionPane.ERROR_MESSAGE);
        }

        JOptionPane.showMessageDialog(null, nomes, "Nomes:", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void cadastrar(List<String> nomes) {
        for (int i = 0; i < 4; i++) {
            String nome = JOptionPane.showInputDialog("Digite o " + (i + 1) + "° nome:").toUpperCase().trim();
            nomes.add(nome);
        }

        System.out.println(">> " + nomes);
    }

    public static boolean verificaSeNomeExiste(String busca, List<String> nomes) {
        return nomes.contains(busca);
    }

}
