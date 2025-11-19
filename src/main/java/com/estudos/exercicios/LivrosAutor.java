package com.estudos.exercicios;

public class LivrosAutor {
    private String titulo;
    private String autor;

    void setAutor(String autor) {
        this.autor = autor;
    }

    void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    String getAutor() {
        return autor;
    }

    String getTitulo() {
        return titulo;
    }

    void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public static void main(String[] args) {
        LivrosAutor livro1 = new LivrosAutor();
        livro1.setTitulo("1984");
        livro1.setAutor("George Orwell");

        LivrosAutor livro2 = new LivrosAutor();
        livro2.setTitulo("O Senhor dos Anéis");
        livro2.setAutor("J.R.R. Tolkien");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }

}
