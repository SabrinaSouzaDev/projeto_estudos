package com.estudos.exercicios;

import com.estudos.Modelos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String nome;
    private int anoDeLancamento;
    boolean incluidoNoPlano;
    private int duracaoEmMinutos;

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

    public int getAnoDeLancamento() {
        return anoDeLancamento;
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

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

}
