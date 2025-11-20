package com.estudos.exercicios;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setAdicionarTempo(int tempo) {
        this.tempoTotal += tempo;
    }

    public void Inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
