package com.estudos.exercicios;

public class Metodos {
    String nome;
    double preco;
    double descontoParaPix;

    double pegaPrecoFinal(boolean pagamentoViaPix) {
        double precoFinal;
        if (pagamentoViaPix) {
            precoFinal = preco - descontoParaPix;
        } else {
            precoFinal = preco;
        }

        return precoFinal;
    }
}
