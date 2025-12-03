package com.estudos.MinhasMusicas;

public class PodCast extends Audio {
    private String nomeDoPodCast;
    private String apresentador;

    public void setNomeDoPodCast(String nomeDoPodCast) {
        this.nomeDoPodCast = nomeDoPodCast;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getNomeDoPodCast() {
        return nomeDoPodCast;
    }

    public String getApresentador() {
        return apresentador;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalReproducoes() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
