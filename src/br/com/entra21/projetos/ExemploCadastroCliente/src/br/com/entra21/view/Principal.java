/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entra21.projetos.ExemploCadastroCliente.src.br.com.entra21.view;

import br.com.entra21.projetos.ExemploCadastroCliente.src.br.com.entra21.controller.ClienteController;

/**
 *
 * @author user
 */
public class Principal {

    public static void main(String[] args) {

        ClienteController clienteController = new ClienteController();
        clienteController.apresentarMenu();

    }

}
