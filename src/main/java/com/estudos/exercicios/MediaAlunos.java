package com.estudos.exercicios;

public class MediaAlunos {
    double notas;
    double somaNotasAlunos;

    void Media(double media) {
        somaNotasAlunos += media;
        notas++;
    }

    double pegaMedia() {
        return somaNotasAlunos / notas;
    }

}