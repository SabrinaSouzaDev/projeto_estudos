package com.estudos.exercicios;

import com.estudos.Modelos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme();
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme();
        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);
        outro.setGenero(new String[] { "Ação", "Thriller" });
        System.out.print("Favorito: " + outro.getNome() + " (");
        outro.imprimirGeneros();
        System.out.println(")");

        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);
        serie.setIncluidoNoPlano(true);
        serie.setGenero(new String[] { "Ação", "Crime", "Drama" });
        serie.setDuracaoEmMinutos(
                serie.getTemporadas() * serie.getEpisodiosPorTemporada() * serie.getMinutosPorEpisodio());
        System.out.print("Favorito: " + serie.getNome() + " (");
        serie.imprimirGeneros();
        System.out.println(")");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.Inclui(favorito);
        calculadora.Inclui(outro);
        calculadora.Inclui(serie);

        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filter(favorito);
        filtro.filter(outro);
        filtro.filter(favorito);
    }
}
