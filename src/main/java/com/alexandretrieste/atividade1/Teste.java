/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.alexandretrieste.atividade1;

/**
 *
 * @author xande
 */
public class Teste {

    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Fiat", "Palio", "ABC1234", 2015, new Motor(100, "gasolina"));
        Veiculo veiculo2 = new Veiculo("Volkswagen", "Gol", "DEF5678", 2018, new Motor(120, "gasolina"));
        Veiculo veiculo3 = new Veiculo("Chevrolet", "Onix", "GHI9012", 2020, new Motor(140, "gasolina"));
        Veiculo veiculo4 = new Veiculo("Toyota", "Corolla", "JKL3456", 2022, new Motor(160, "híbrido"));
        Veiculo veiculo5 = new Veiculo("Ford", "Ka", "MNO7890", 2023, new Motor(80, "elétrico"));

        // Imprimindo informações dos veículos
        System.out.println("Informações dos Veículos:");
        for (Veiculo veiculo : new Veiculo[]{veiculo1, veiculo2, veiculo3, veiculo4, veiculo5}) {
            System.out.println("------------------");
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Ano: " + veiculo.getAno());
            System.out.println("Motor:");
            System.out.println("  Potência: " + veiculo.getMotor().getPotencia());
            System.out.println("  Tipo: " + veiculo.getMotor().getTipo());
        }
    }
}