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

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
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

    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("O Poderoso Chefão");
        filme.setAnoDeLancamento(1972);
        filme.setDuracaoEmMinutos(175);

        filme.exibeFichaTecnica();

        filme.avalia(9.5);
        filme.avalia(8.7);
        filme.avalia(9.0);

        Filme filme2 = new Filme();
        filme2.setNome("Pulp Fiction");
        filme2.setAnoDeLancamento(1994);
        filme2.setDuracaoEmMinutos(154);
        filme2.exibeFichaTecnica();
        filme2.avalia(9.3);
        filme2.avalia(8.9);
        filme2.avalia(9.1);

        System.out.println("Média das avaliações: " + filme.pegaMedia());

        CalculadoraDeTempo calcula = new CalculadoraDeTempo();
        calcula.inclui(filme);
        System.out.println("Tempo total dos filmes: " + calcula.getTempoTotal() + " minutos");

    }

}
