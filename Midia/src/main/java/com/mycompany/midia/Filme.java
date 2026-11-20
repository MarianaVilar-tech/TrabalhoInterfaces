/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midia;

/**
 *
 * @author Pichau
 */
public class Filme implements Midia {
    private String titulo;
    private String diretor;
    private int duracaoEmMinutos;

    public Filme(String titulo, String diretor, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public void reproduzir() {
        String categoria = "Curta/Média duração";
        if (duracaoEmMinutos > 120) {
            categoria = "Longa-metragem";
        }
        System.out.println("[Filme] Exibindo \"" + titulo + "\", direção de " + diretor + " (" + duracaoEmMinutos + " min - " + categoria + ")");
    }

    @Override
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}
