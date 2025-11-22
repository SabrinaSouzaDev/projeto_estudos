package com.estudos.exercicios;

public class GeradorPrimo {
    public int gerarProximoPrimo(int numero) {
        int proximoNumero = numero + 1;
        while (true) {
            if (new NumerosPrimos().verificarPrimalidade(proximoNumero)) {
                return proximoNumero;
            }
            proximoNumero++;
        }
    }

    public static void main(String[] args) {
        GeradorPrimo gerador = new GeradorPrimo();
        int numero = 10; // Exemplo de número inicial
        int proximoPrimo = gerador.gerarProximoPrimo(numero);
        System.out.println("O próximo número primo após " + numero + " é " + proximoPrimo);
    }
}
