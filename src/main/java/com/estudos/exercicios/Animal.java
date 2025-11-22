package com.estudos.exercicios;

public class Animal {
    private String classeAnimal;
    private String especie;
    private int idade;
    private String som;

    public String getClasseAnimal() {
        return classeAnimal;
    }

    public void setClassName(String classeAnimal) {
        this.classeAnimal = classeAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
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

    public void emitirSom() {
        System.out.println("Som do animal" + getSom());
    }
}
