package com.estudos.exercicios;

public class Carro {
    private String modelo;
    private double precoAno1, precoAno2, precoAno3;

    public String getModelo() {
        return modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void setPrecoAno1(double p) {
        precoAno1 = p;
    }

    void setPrecoAno2(double p) {
        precoAno2 = p;
    }

    void setPrecoAno3(double p) {
        precoAno3 = p;
    }

    double menorPreco() {
        return Math.min(precoAno1, Math.min(precoAno2, precoAno3));
    }

    double maiorPreco() {
        return Math.max(precoAno1, Math.max(precoAno2, precoAno3));
    }

    void exibirDetalhes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano 1: R$ " + precoAno1);
        System.out.println("Ano 2: R$ " + precoAno2);
        System.out.println("Ano 3: R$ " + precoAno3);
        System.out.println("Menor preço: R$ " + menorPreco());
        System.out.println("Maior preço: R$ " + maiorPreco());
    }

    public double calcularPrecoMedio() {
        return (precoAno1 + precoAno2 + precoAno3) / 3;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: R$ " + precoAno1);
        System.out.println("Preço Ano 2: R$ " + precoAno2);
        System.out.println("Preço Ano 3: R$ " + precoAno3);
    }

    class ModeloCarro extends Carro {
        ModeloCarro(String modelo, double p1, double p2, double p3) {
            setModelo(modelo);
            setPrecoAno1(p1);
            setPrecoAno2(p2);
            setPrecoAno3(p3);
        }
    }
}
