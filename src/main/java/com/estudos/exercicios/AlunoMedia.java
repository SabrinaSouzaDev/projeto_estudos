package com.estudos.exercicios;

public class AlunoMedia {
    private String nome;
    private double notas;

    public AlunoMedia(String nome, double notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public String getNome(String nome) {
        return nome;
    }

    public double getNotas(double notas) {
        return notas;
    }

    void exibeInformacoes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Notas do aluno: " + notas);
    }

    void adicionaNotas() {
        System.out.println("Notas" + getNotas(notas));
        System.out.println("Nome" + getNome(nome));
        System.out.println("Aluno: " + nome + " - Notas: " + notas);
        System.out.println("media: " + new MediaAlunos().pegaMedia());
    }

    public static void main(String[] args) {
        AlunoMedia aluno1 = new AlunoMedia("João", 8.5);
        AlunoMedia aluno2 = new AlunoMedia("Maria", 9.0);
        AlunoMedia aluno3 = new AlunoMedia("Pedro", 7.5);

        aluno1.exibeInformacoes();
        aluno2.exibeInformacoes();
        aluno3.exibeInformacoes();

        MediaAlunos mediaAlunos = new MediaAlunos();
        mediaAlunos.Media(aluno1.getNotas(aluno1.notas));
        mediaAlunos.Media(aluno2.getNotas(aluno2.notas));
        mediaAlunos.Media(aluno3.getNotas(aluno3.notas));

        System.out.println("Média das notas dos alunos: " + mediaAlunos.pegaMedia());
    }

}
