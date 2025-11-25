package com.estudos.exercicios;

import java.util.ArrayList;
import java.util.Collections;

public class ComparetoTituloExemplo implements Comparable<ComparetoTituloExemplo> {
    String nome;

    public ComparetoTituloExemplo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(ComparetoTituloExemplo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

    public static void main(String[] args) {
        ComparetoTituloExemplo titulo = new ComparetoTituloExemplo("O Senhor dos Anéis");

        ComparetoTituloExemplo outroTitulo = new ComparetoTituloExemplo("1984");

        int resultado = titulo.compareTo(outroTitulo);

        System.out.println("Resultado da comparação: " + resultado);

        ArrayList<ComparetoTituloExemplo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new ComparetoTituloExemplo("D"));
        listaTitulos.add(new ComparetoTituloExemplo("A"));
        listaTitulos.add(new ComparetoTituloExemplo("B"));

        Collections.sort(listaTitulos);

        for (ComparetoTituloExemplo TituloExemplo : listaTitulos) {
            System.out.println(TituloExemplo.nome);
        }

    }
}