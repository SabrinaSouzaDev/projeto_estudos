package com.estudos.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Titulo {
    private String titulo;
    private String nome;
    private List<String> genero = new ArrayList<>();
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private int anoDeLancamento;

    void exibeFichaTecnica() {
        System.out.println("Nome: " + titulo);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    protected void registraAvaliacao(double nota) {
        this.somaDasAvaliacoes += nota;
        this.totalDeAvaliacoes++;
    }

    public void setAnoDeLancamento(int ano) {
        this.anoDeLancamento = ano;
    }

    double pegaMedia() {
        if (totalDeAvaliacoes == 0)
            return 0.0;
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public void setGenero(String[] generoArray) {
        this.genero.clear();
        if (generoArray != null) {
            for (String g : generoArray) {
                if (g != null) {
                    this.genero.add(g.trim());
                }
            }
        }
    }

    public void addGenero(String g) {
        if (g != null && !g.trim().isEmpty()) {
            this.genero.add(g.trim());
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setIncluidoNoPlano(boolean incluir) {
        this.incluidoNoPlano = incluir;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public String[] getGenero() {
        return this.genero.toArray(new String[0]);
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getsomaDasAvaliacoes(int somaDasAvaliacoes) {
        return somaDasAvaliacoes;
    }

    public void imprimirGeneros() {
        String[] generos = this.getGenero();
        if (generos == null || generos.length == 0) {
            System.out.println("Nenhum gênero definido");
            return;
        }
        for (int i = 0; i < generos.length; i++) {
            System.out.println(i + ": " + generos[i]);
        }
    }
}
