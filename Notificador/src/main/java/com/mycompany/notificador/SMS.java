/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificador;

/**
 *
 * @author Pichau
 */
public class SMS implements Notificador{
    private String telefone;

    public SMS(String telefone) {
        this.telefone = telefone;
    }
    @Override
    public String getCanal() {
        return "SMS";
    }

    @Override
    public void enviar(String mensagem) {
        String texto = mensagem;
        
        if (mensagem.length() > 40) {
            texto = mensagem.substring(0, 40) + "...";
        }
        
        System.out.println("[SMS] para " + telefone + ": " + texto);
    }
}
