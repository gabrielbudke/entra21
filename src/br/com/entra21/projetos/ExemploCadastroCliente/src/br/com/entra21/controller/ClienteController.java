/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.entra21.projetos.ExemploCadastroCliente.src.br.com.entra21.controller;

import br.com.entra21.projetos.ExemploCadastroCliente.src.br.com.entra21.model.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Budke de Sousa
 */
public class ClienteController {

    Cliente cliente = new Cliente();

    public void apresentarMenu() {

        int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar Cliente" + "\n2 - Editar Cliente" + "\n3 - Buscar pelo nome" + "\n4 - Buscar pelo CPF"
                        + "\n5 - Listar clientes" + "\n6 - Contabilizador" + "\n8001 - Sair",
                "MENU DO SISTEMA", JOptionPane.QUESTION_MESSAGE));

        while (menu != 8001) {

            switch (menu) {
                case 1:
                    cliente.cadastrar();
                    break;
                case 2:
                    cliente.editar();
                    break;
                case 3:
                    cliente.buscarPeloNome();
                    break;
                case 4:
                    cliente.buscarPeloCPF();
                    break;
                case 5:
                    cliente.listar();
                    break;
                case 6:
                    cliente.contabilizaPeloNome();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }

            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1 - Cadastrar Cliente" + "\n2 - Editar Cliente" + "\n3 - Buscar pelo nome"
                            + "\n4 - Buscar pelo CPF" + "\n5 - Listar clientes" + "\n6 - Contabilizador"
                            + "\n8001 - Sair",
                    "MENU DO SISTEMA", JOptionPane.QUESTION_MESSAGE));

        }

        JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema!!");

    }

}
