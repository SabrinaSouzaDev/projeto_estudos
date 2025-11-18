package com.estudos.exercicios;

public class Principal2 {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.deposita(300);
        minhaConta.setAgencia(1234);
        minhaConta.setNumero(56789);

        System.out.println(minhaConta.getAgencia());
        System.out.println(minhaConta.getNumero());
        System.out.println(minhaConta.getSaldo());
    }
}
