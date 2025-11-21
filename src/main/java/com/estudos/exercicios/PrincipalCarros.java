package com.estudos.exercicios;

public class PrincipalCarros {
    public static void main(String[] args) {
        class ModeloCarro {
            private String nomeModelo;
            private String fabricante;

            public ModeloCarro(String nomeModelo, String fabricante) {
                this.nomeModelo = nomeModelo;
                this.fabricante = fabricante;
            }

            public String getNomeModelo() {
                return nomeModelo;
            }

            public String getFabricante() {
                return fabricante;
            }

            public double exibirInfo() {
                double getPrecoAno1 = 50000.0;
                double getPrecoAno2 = 48000.0;
                double getPrecoAno3 = 46000.0;
                return (getPrecoAno1 + getPrecoAno2 + getPrecoAno3) / 3;
            }

            public void CalculadoraPrecoMedio() {
                System.out.println("Preço médio do modelo " + nomeModelo + ": R$ " + exibirInfo());
            }

        }

        class Carro {
            private String placa;
            private ModeloCarro modelo;

            public Carro(String placa, ModeloCarro modelo) {
                this.placa = placa;
                this.modelo = modelo;
            }

            public String getPlaca() {
                return placa;
            }

            public ModeloCarro getModelo() {
                return modelo;
            }
        }

        ModeloCarro modelo1 = new ModeloCarro("Civic", "Honda");
        ModeloCarro modelo2 = new ModeloCarro("Corolla", "Toyota");

        Carro carro1 = new Carro("ABC-1234", modelo1);
        Carro carro2 = new Carro("XYZ-5678", modelo2);

        System.out.println("Carro 1: " + carro1.getModelo().getNomeModelo() + " - Fabricante: "
                + carro1.getModelo().getFabricante() + " - Placa: " + carro1.getPlaca() + " Preço médio do carro 1: R$ "
                + carro1.getModelo().exibirInfo());
        System.out.println("Carro 2: " + carro2.getModelo().getNomeModelo() + " - Fabricante: "
                + carro2.getModelo().getFabricante() + " - Placa: " + carro2.getPlaca() + " Preço médio do carro 2: R$ "
                + carro2.getModelo().exibirInfo());

        System.out.println("Carros relacionados:");
        carro1.getModelo().CalculadoraPrecoMedio();
        carro2.getModelo().CalculadoraPrecoMedio();
    }

}
