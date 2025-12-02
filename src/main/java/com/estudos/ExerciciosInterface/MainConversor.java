package com.estudos.ExerciciosInterface;

public class MainConversor {
    public static void main(String[] args) {
        ConversorDeMoeda conversor = new ConversorDeMoeda();
        double valorEmDolar = 100.0;
        conversor.converterDolarParaReal(valorEmDolar);
    }
}
