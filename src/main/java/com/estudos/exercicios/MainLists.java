package com.estudos.exercicios;

import java.util.ArrayList;

public class MainLists {
    public static void main(String[] args) {
        ArrayList<String> listaStrings = new ArrayList<>();

        listaStrings.add("um");
        listaStrings.add("dois");
        listaStrings.add("três");

        for (String elementos : listaStrings) {
            System.out.println(elementos);
        }
    }
}
