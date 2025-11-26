package com.estudos.exercicios;

import java.util.ArrayList;
import java.util.List;

public class MainLists {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();
        alunos.add("Maria");
        alunos.add("João");
        alunos.add("Paula");

        for (String nome : alunos) {
            System.out.println(nome);
        }
    }
}

class ForEachUse {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();
        alunos.add("Maria");
        alunos.add("João");
        alunos.add("Paula");
        alunos.forEach(System.out::println);
        alunos.forEach(nome -> System.out.println("Nome: " + nome));

        java.util.stream.IntStream.range(0, alunos.size())
                .forEach(i -> System.out.println(i + ": " + alunos.get(i)));
    }
}