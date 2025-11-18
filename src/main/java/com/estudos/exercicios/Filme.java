package com.estudos.exercicios;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int ano) {
        this.anoDeLancamento = ano;
    }

    public void setIncluidoNoPlano(boolean incluir) {
        this.incluidoNoPlano = incluir;
    }

    public void setDuracaoEmMinutos(int duracao) {
        this.duracaoEmMinutos = duracao;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getsomaDasAvaliacoes(int somaDasAvaliacoes) {
        return somaDasAvaliacoes;
    }
}
