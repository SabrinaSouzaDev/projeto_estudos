package com.estudos.exercicios;

public class ModeloCarro extends Carro {
    private String Modelo;
    private int anoDeFabricacao;
    private double preco;

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String nomeModelo) {
        this.Modelo = nomeModelo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    int calculoValorizacao() {
        int idade = 2025 - getAnoDeFabricacao();
        double calculoValorizacao = idade * 0.03;
        return (int) calculoValorizacao;
    }

    Double calcularValorRevenda() {
        int idade = 2024 - getAnoDeFabricacao();
        double depreciacao = idade * 0.05;
        double valorRevenda = getPreco() * (1 - depreciacao);
        return valorRevenda < 0 ? 0 : valorRevenda;
    }

    public void exibirDetalhes() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano de Fabricação: " + anoDeFabricacao);
        System.out.println("Preço: R$ " + preco);
    }

}
