/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midia;

/**
 *
 * @author Pichau
 */
public class Podcast implements Midia{
    private String nome;
    private int episodio;
    private int duracaoEmMinutos;

    public Podcast(String nome, int episodio, int duracaoEmMinutos) {
        this.nome = nome;
        this.episodio = episodio;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public void reproduzir() {
        System.out.println("[Podcast] Ouvindo " + nome + " - Episódio #" + episodio + " (" + duracaoEmMinutos + " min)");
    }

    @Override
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}
