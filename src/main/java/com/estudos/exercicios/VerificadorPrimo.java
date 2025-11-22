package com.estudos.exercicios;

public class VerificadorPrimo extends NumerosPrimos {
    public void InnerVerificadorPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

    }
}
