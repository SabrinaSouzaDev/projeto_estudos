package com.estudos.exercicios;

public class Cachorro extends Animal {
    private String nome;
    private String raca;
    private int idade;
    private String som;

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

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public void latir() {
        System.out.println("Latir" + getSom());
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        cachorro.setRaca("Labrador");
        cachorro.setIdade(3);
        cachorro.setSom(" Au Au");

        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Idade: " + cachorro.getIdade() + " anos");
        cachorro.latir();
    }
}
