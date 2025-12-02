package com.estudos.Modelos;

public class Episodio implements Classificavel {
    private int totalVisualizacoes;

    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
