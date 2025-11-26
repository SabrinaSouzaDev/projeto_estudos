package com.estudos.exercicios;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private Double limite;
    private Double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancarCompra(Compra compra) {
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public Double getLimite() {
        return limite;
    }

    public Double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

}

class Compra {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: descricao = " + descricao + '\'' +
                ", valor = " + valor;

    }
}
