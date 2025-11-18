package com.estudos.exercicios;

public class Teste1 {
    public static void main(String[] args) {
        Produto1 p1 = new Produto1("Caneta", 1.50);
        Produto1 p2 = p1;
        p2.setPreco(2.00);
        System.out.println(p1.getPreco());
    }
}
