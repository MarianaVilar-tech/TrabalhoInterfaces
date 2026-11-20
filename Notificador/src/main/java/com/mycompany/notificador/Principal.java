/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificador;

/**
 *
 * @author Pichau
 */
public class Principal {
    public static void main(String[] args) {
        Notificador n = new Email("ana@unileste.edu.br");
        n.enviar("Bem-vinda ao curso de POO!");

        System.out.println();

        CentralDeAvisos central = new CentralDeAvisos();

        Notificador[] canais = {
            new Email("ana@unileste.edu.br"),
            new SMS("(31) 99999-0001"),
            new Whatsapp("(31) 98888-0002"),
            new Telegram("@ana_poo")
        };

        central.avisarTodos(canais, "A prova de POO foi remarcada para sexta-feira às 19h.");
    }
    /*Notificador is abstract; cannot be instantiated 
    O Java não permite criar objetos diretamente de uma interface com "new" porque ela é apenas um contrato abstrato sem implementação real dos métodos.*/
    /* Whatsapp is not abstract and does not override abstract method getCanal(). 
    Toda classe concreta que implementa uma interface é obrigada a implementar
    todos os métodos declarados no contrato; sem o getCanal(), o contrato é quebrado.
    */
}
