/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midia;

/**
 *
 * @author Pichau
 */
public class Playlist {
    public void reproduzirItem(Midia item) {
        System.out.println("Iniciando reprodução...");
        item.reproduzir();
    }

    public void reproduzirPlaylist(Midia[] itens) {
        int tempoTotal = 0;
        for (Midia item : itens) {
            reproduzirItem(item);
            tempoTotal += item.getDuracaoEmMinutos();
        }
        System.out.println("------------------------------------");
        System.out.println("Total de mídias: " + itens.length);
        System.out.println("Tempo total da playlist: " + tempoTotal + " minutos");
    }
}
