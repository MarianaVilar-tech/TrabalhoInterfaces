/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificador;

/**
 *
 * @author Pichau
 */
public class Email implements Notificador {
    private String endereco;

    public Email(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String getCanal() {
        return "E-mail";
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[E-mail] para " + endereco + ": " + mensagem);
    }
}
