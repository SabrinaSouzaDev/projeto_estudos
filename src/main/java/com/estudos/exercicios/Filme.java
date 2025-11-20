package com.estudos.exercicios;

public class Filme extends Titulo {
    private String nome;
    private int anoDeLancamento;
    boolean incluidoNoPlano;
    private int duracaoEmMinutos;

    // public Filme(int anoDeLancamento, String nome, String[] genero, int
    // duracaoEmMinutos, boolean incluidoNoPlano,
    // int totalDeAvaliacoes, int somaDasAvaliacoes) {
    // this.anoDeLancamento = anoDeLancamento;
    // super.getsomaDasAvaliacoes(duracaoEmMinutos);
    // super.getTotalDeAvaliacoes();
    // }

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAnoDeLancamento(int ano) {
        this.anoDeLancamento = ano;
    }

    public void setIncluidoNoPlano(boolean incluir) {
        this.incluidoNoPlano = incluir;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

}
