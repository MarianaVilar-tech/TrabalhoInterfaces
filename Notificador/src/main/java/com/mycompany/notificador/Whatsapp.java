/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificador;

/**
 *
 * @author Pichau
 */
public class Whatsapp implements Notificador {
    private String numero;

    public Whatsapp(String numero) {
        this.numero = numero;
    }
    
    @Override
    public String getCanal() {
        return "WhatsApp";
    }
    
    @Override
    public void enviar(String mensagem) {
        System.out.println("[WhatsApp] para " + numero + ": " + mensagem + " (entregue)");
    }
}
