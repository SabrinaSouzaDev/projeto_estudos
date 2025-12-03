package com.estudos.MinhasMusicas;

public class MinhasMusicasPrincipal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Imagine");
        musica.setArtista("John Lennon");

        for (int i = 1; i <= 1000; i++) {
            musica.reproduzir();
        }

        for (int i = 1; i <= 2000; i++) {
            musica.curtir();
        }

        PodCast podCast = new PodCast();
        podCast.setTitulo("Tecnologia Hoje");
        podCast.setApresentador("Ana Silva");

        for (int i = 1; i <= 5000; i++) {
            podCast.reproduzir();
        }

        for (int i = 1; i <= 1000; i++) {
            podCast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica);
        preferidas.inclui(podCast);
    }
}