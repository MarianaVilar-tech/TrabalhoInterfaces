/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midia;

/**
 *
 * @author Pichau
 */
public class Principal {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        Midia destaque = new Musica("Blank Space", "Taylor Swift", 5);
        playlist.reproduzirItem(destaque);

        System.out.println();

        Midia[] minhasMidias = {
            new Musica("Blank Space", "Taylor Swift", 5),
            new Filme("Adoráveis Mulheres", "Greta Gerwig", 169),
            new Podcast("Picolé de Limão", 350, 52),
            new Audiolivro("Dom Casmurro", "Machado de Assis (Narrado)", 420)
        };

        playlist.reproduzirPlaylist(minhasMidias);
    }
    /* A quarta classe adicionada foi Audiolivro, que foi incluida em Principal sem nenhuma alteração na interface
    Midia ou na Playlist
    */
    
    
    /* Midia is abstract; cannot be instantiated. Não é possivel criar objetos diretamente a partir de uma interface.
    Audiolivro is not abstract and does not override abstract method getDuracaoEmMinutos().Toda classe concreta 
    que usa implements é obrigada a implementar todos os métodos da interface.
    */
}
