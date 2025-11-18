package com.estudos.exercicios;

public class exercicios {

}

class Saudacao {

    void saudacao() {
        System.out.println("Olá, mundo!");
    }
}

class Calculadora {

    public int dobrarNumero(int numero) {
        return numero * 2;
    }
}

class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / numAvaliacoes;
    }
}

class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdade() {
        return 2023 - ano;
    }
}

class Aluno {
    String nome;
    int idade;

    void exibeInformacoes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
    }
}
