package com.estudos.ExerciciosInterface;

public class ConversorDeMoeda implements ConversaoFinanceira {
    private static double taxaDeCambio = 5.2; // Exemplo de taxa de câmbio

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double valorReal = valorDolar * taxaDeCambio;
        System.out.println("Valor em Reais: R$ " + valorReal);
    }
}
