package com.estudos.exercicios;

public class Cachorro extends Animal {
    private String nome;
    private String raca;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void latir() {
        System.out.println("Latir" + getSom());
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo");
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        cachorro.setRaca("Labrador");
        cachorro.setIdade(3);

        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Idade: " + cachorro.getIdade() + " anos");
        cachorro.emitirSom();
    }
}
