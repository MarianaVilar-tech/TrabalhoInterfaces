/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificador;

/**
 *
 * @author Pichau
 */
public class Telegram implements Notificador  {
    private String usuario;

    public Telegram(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String getCanal() {
        return "Telegram";
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[Telegram] para " + usuario + ": " + mensagem);
    }
}
