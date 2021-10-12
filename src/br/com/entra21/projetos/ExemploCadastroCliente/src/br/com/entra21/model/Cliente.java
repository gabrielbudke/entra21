/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.entra21.projetos.ExemploCadastroCliente.src.br.com.entra21.model;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Budke de Sousa
 */
public class Cliente {

    int id;
    String[] nomes = new String[100];
    short[] idades = new short[100];
    char[] sexos = new char[100];
    String[] cpfs = new String[100];
    String[] estados = new String[100];
    String[] cidades = new String[100];
    String[] bairros = new String[100];
    String[] enderecos = new String[100];
    String[] ceps = new String[100];
    String[] numeros = new String[100];
    String[] complementos = new String[100];

    public Cliente() {
        this.id = 0;
    }

    public void cadastrar() {
        solicitarInformações(this.id);
        this.id++;
    }

    public void listar() {

        if (this.id == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum cliente foi cadastrado ainda!");
            return;
        }

        String texto = "";

        for (int i = 0; i < this.id; i++) {
            texto += "Nome: " + this.nomes[i] + " | CPF: " + this.cpfs[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, texto);

    }

    public void editar() {
        String buscar = JOptionPane.showInputDialog("Digite o nome para buscar:");

        for (int i = 0; i < this.id; i++) {
            if (this.nomes[i].equals(buscar)) {
                solicitarInformações(i);
                return;
            }

        }
    }

    public void buscarPeloNome() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial ou completo para a busca").trim()
                .toUpperCase();

        for (int i = 0; i < this.id; i++) {
            if (this.nomes[i].contains(busca)) {
                apresentarInformacoes(i);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Nenhum cliente encontado!!");

    }

    public void buscarPeloCPF() {
        String cpf = JOptionPane.showInputDialog("Digite o nome parcial ou completo para a busca").trim()
                .replace("-", "").replace(".", "");

        for (int i = 0; i < this.id; i++) {
            if (this.cpfs[id].equals(cpf)) {
                apresentarInformacoes(i);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Nwnhum cliente encontrado com o CPF: " + cpf);
    }

    public void contabilizaPeloNome() {
        String busca = JOptionPane.showInputDialog("Digite o nome para contabilziar:");
        int quantidadeRegistros = 0;

        for (int i = 0; i < this.id; i++) {
            if (this.nomes[i].contains(busca)) {
                quantidadeRegistros++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "A quantidade de regsitros com \"" + busca + "\" é de: " + quantidadeRegistros);

    }

    public void apresentarInformacoes(int id) {
        JOptionPane.showMessageDialog(null,
                "Informações sobre o cliente:" + "\nNome: " + this.nomes[id] + "\nIdade: " + this.idades[id] + "\nCPF: "
                        + this.cpfs[id] + "\nEstado: " + this.estados[id] + "\nCidade: " + this.cidades[id]
                        + "\nBairro: " + this.bairros[id] + "\nLogradouro: " + this.enderecos[id] + "\nNúmero(n°): "
                        + this.numeros[id] + "\nCEP: " + this.ceps[id] + "\nComplemento: " + this.complementos[id]);
    }

    public void solicitarInformações(int id) {
        nomes[id] = JOptionPane.showInputDialog(null, "Nome:", "CADASTRO DO CLIENTE", JOptionPane.QUESTION_MESSAGE)
                .trim().toUpperCase();
        idades[id] = Short.parseShort(
                JOptionPane.showInputDialog(null, "Idade:", "CADASTRO DO CLIENTE", JOptionPane.QUESTION_MESSAGE).trim()
                        .toUpperCase());
        sexos[id] = JOptionPane.showInputDialog(null, "Sexo:", "CADASTRO DO CLIENTE", JOptionPane.QUESTION_MESSAGE)
                .charAt(0);
        cpfs[id] = JOptionPane.showInputDialog(null, "CPF:", "CADASTRO DO CLIENTE", JOptionPane.QUESTION_MESSAGE).trim()
                .toUpperCase().replace(".", "").replace("-", "");
        estados[id] = JOptionPane.showInputDialog(null, "Estado:", "CADASTRO DO CLIENTE", JOptionPane.QUESTION_MESSAGE)
                .trim().toUpperCase();
        cidades[id] = JOptionPane.showInputDialog(null, "Cidade:", "CADASTRO DO CLIENTE", JOptionPane.QUESTION_MESSAGE)
                .trim().toUpperCase();
        bairros[id] = JOptionPane.showInputDialog(null, "Bairro:", "CADASTRO DO CLIENTE", JOptionPane.QUESTION_MESSAGE)
                .trim().toUpperCase();
        enderecos[id] = JOptionPane
                .showInputDialog(null, "Endereço", "CADASTRO DO CLIENTE", JOptionPane.QUESTION_MESSAGE).trim()
                .toUpperCase();
        ceps[id] = JOptionPane.showInputDialog(null, "CEP:", "CADASTRO DO CLIENTE", JOptionPane.QUESTION_MESSAGE).trim()
                .toUpperCase().replace(".", "").replace("-", "");
        numeros[id] = JOptionPane
                .showInputDialog(null, "Número(n°):", "CADASTRO DO CLIENTE", JOptionPane.QUESTION_MESSAGE).trim()
                .toUpperCase();
        complementos[id] = JOptionPane
                .showInputDialog(null, "Complemento:", "CADASTRO DO CLIENTE", JOptionPane.QUESTION_MESSAGE).trim()
                .toUpperCase();
    }

}
