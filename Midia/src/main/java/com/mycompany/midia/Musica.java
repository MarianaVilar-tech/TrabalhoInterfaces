/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midia;

/**
 *
 * @author Pichau
 */
public class Musica implements Midia {
    private String titulo;
    private String artista;
    private int duracaoEmMinutos;

    public Musica(String titulo, String artista, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public void reproduzir() {
        System.out.println("[Música] Tocando \"" + titulo + "\" - " + artista + " (" + duracaoEmMinutos + " min)");
    }

    @Override
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}
