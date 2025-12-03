package com.estudos.MinhasMusicas;

public class Musica extends PodCast {
    private String titulo;
    private String artista;
    private String genero;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }

}
