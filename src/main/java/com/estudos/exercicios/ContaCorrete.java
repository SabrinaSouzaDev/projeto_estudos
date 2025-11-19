package com.estudos.exercicios;

class ContaCorrente extends Conta {
    private double limiteEspecial;

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    double getLimiteEspecial() {
        return limiteEspecial;
    }
}