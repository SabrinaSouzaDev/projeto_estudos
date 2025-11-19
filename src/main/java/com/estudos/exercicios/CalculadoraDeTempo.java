package com.estudos.exercicios;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setAdicionarTempo(int tempo) {
        this.tempoTotal += tempo;
    }

    public void inclui(Filme f) {
        this.tempoTotal += f.getDuracaoEmMinutos();
    }

}
