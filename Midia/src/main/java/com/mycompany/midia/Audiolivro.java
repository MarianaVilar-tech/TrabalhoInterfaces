/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midia;

/**
 *
 * @author Pichau
 */
public class Audiolivro implements Midia {
    private String titulo;
    private String narrador;
    private int duracaoEmMinutos;

    public Audiolivro(String titulo, String narrador, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.narrador = narrador;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public void reproduzir() {
        System.out.println("[Audiolivro] Narrando \"" + titulo + "\" na voz de " + narrador + " (" + duracaoEmMinutos + " min)");
    }
    @Override
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
   
}
