package com.estudos.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
  public static void main(String[] args) {
    List<Integer> Numeros = new ArrayList<>();
    Numeros.add(5);
    Numeros.add(10);
    Numeros.add(15);

    Collections.sort(Numeros);

    System.out.println("Exemplos de Numeros: " + Numeros);
  }
}
