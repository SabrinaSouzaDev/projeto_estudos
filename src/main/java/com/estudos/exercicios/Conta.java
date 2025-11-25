
package com.estudos.exercicios;

import java.util.Comparator;

public class Conta {
    private int numero;
    private int agencia;
    private double saldo;

    public void deposita(double valor) {
        saldo += valor;
    }

    public void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor deve ser maior do que zero!");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Valor deve ser maior do que zero!");
        }
    }

    public int compareTo(Conta outra) {
        if (this.saldo > outra.saldo) {
            return 1;
        } else if (this.saldo < outra.saldo) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.setNumero(12345);
        minhaConta.setAgencia(678);
        minhaConta.depositar(500.0);
        minhaConta.sacar(200.0);
        System.out.println("Número da conta: " + minhaConta.getNumero());
        System.out.println("Agência: " + minhaConta.getAgencia());
        System.out.println("Saldo final: " + minhaConta.getSaldo());
    }
}