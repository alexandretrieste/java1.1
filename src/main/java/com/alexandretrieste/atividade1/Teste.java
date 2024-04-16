/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.alexandretrieste.atividade1;

/**
 *
 * @author xande
 */
// Classe Teste
public class Teste {
    public static void main(String[] args) {
        // Instanciando 5 objetos da classe Veículo
        Veiculo veiculo1 = new Veiculo();
        Veiculo veiculo2 = new Veiculo();
        Veiculo veiculo3 = new Veiculo();
        Veiculo veiculo4 = new Veiculo();
        Veiculo veiculo5 = new Veiculo();

        // Veículo 1
        veiculo1.setPlaca("ABC1234");
        veiculo1.setMarca("Fiat");
        veiculo1.setModelo("Palio");
        veiculo1.setCor("Vermelho");
        veiculo1.setVelocMax(180.0f);
        veiculo1.setQtdRodas(4);
        veiculo1.getMotor().setPotencia(100);
        veiculo1.getMotor().setQtdPista(4);

        // Veículo 2
        veiculo2.setPlaca("DEF5678");
        veiculo2.setMarca("Volkswagen");
        veiculo2.setModelo("Gol");
        veiculo2.setCor("Preto");
        veiculo2.setVelocMax(200.0f);
        veiculo2.setQtdRodas(4);
        veiculo2.getMotor().setPotencia(120);
        veiculo2.getMotor().setQtdPista(4);

        // Veículo 3
        veiculo3.setPlaca("GHI9101");
        veiculo3.setMarca("Chevrolet");
        veiculo3.setModelo("Onix");
        veiculo3.setCor("Branco");
        veiculo3.setVelocMax(190.0f);
        veiculo3.setQtdRodas(4);
        veiculo3.getMotor().setPotencia(110);
        veiculo3.getMotor().setQtdPista(4);

        // Veículo 4
        veiculo4.setPlaca("JKL1121");
        veiculo4.setMarca("Ford");
        veiculo4.setModelo("Ka");
        veiculo4.setCor("Azul");
        veiculo4.setVelocMax(170.0f);
        veiculo4.setQtdRodas(4);
        veiculo4.getMotor().setPotencia(90);
        veiculo4.getMotor().setQtdPista(4);

        // Veículo 5
        veiculo5.setPlaca("MNO1323");
        veiculo5.setMarca("Honda");
        veiculo5.setModelo("Civic");
        veiculo5.setCor("Prata");
        veiculo5.setVelocMax(220.0f);
        veiculo5.setQtdRodas(4);
        veiculo5.getMotor().setPotencia(150);
        veiculo5.getMotor().setQtdPista(4);

        // Imprimindo os valores dos atributos na tela
        System.out.println("Informações do Veículo 1:");
        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Marca: " + veiculo1.getMarca());
        System.out.println("Modelo: " + veiculo1.getModelo());
        System.out.println("Cor: " + veiculo1.getCor());
        System.out.println("Velocidade Máxima: " + veiculo1.getVelocMax());
        System.out.println("Quantidade de Rodas: " + veiculo1.getQtdRodas());
        System.out.println("Potência do Motor: " + veiculo1.getMotor().getPotencia());
        System.out.println("Quantidade de Pistões do Motor: " + veiculo1.getMotor().getQtdPista());
        System.out.println();

        System.out.println("Informações do Veículo 2:");
        System.out.println("Placa: " + veiculo2.getPlaca());
        System.out.println("Marca: " + veiculo2.getMarca());
        System.out.println("Modelo: " + veiculo2.getModelo());
        System.out.println("Cor: " + veiculo2.getCor());
        System.out.println("Velocidade Máxima: " + veiculo2.getVelocMax());
        System.out.println("Quantidade de Rodas: " + veiculo2.getQtdRodas());
        System.out.println("Potência do Motor: " + veiculo2.getMotor().getPotencia());
        System.out.println("Quantidade de Pistões do Motor: " + veiculo2.getMotor().getQtdPista());
        System.out.println();
    
        System.out.println("Informações do Veículo 3:");
        System.out.println("Placa: " + veiculo3.getPlaca());
        System.out.println("Marca: " + veiculo3.getMarca());
        System.out.println("Modelo: " + veiculo3.getModelo());
        System.out.println("Cor: " + veiculo3.getCor());
        System.out.println("Velocidade Máxima: " + veiculo3.getVelocMax());
        System.out.println("Quantidade de Rodas: " + veiculo3.getQtdRodas());
        System.out.println("Potência do Motor: " + veiculo3.getMotor().getPotencia());
        System.out.println("Quantidade de Pistões do Motor: " + veiculo3.getMotor().getQtdPista());
        System.out.println();

        System.out.println("Informações do Veículo 4:");
        System.out.println("Placa: " + veiculo4.getPlaca());
        System.out.println("Marca: " + veiculo4.getMarca());
        System.out.println("Modelo: " + veiculo4.getModelo());
        System.out.println("Cor: " + veiculo4.getCor());
        System.out.println("Velocidade Máxima: " + veiculo4.getVelocMax());
        System.out.println("Quantidade de Rodas: " + veiculo4.getQtdRodas());
        System.out.println("Potência do Motor: " + veiculo4.getMotor().getPotencia());
        System.out.println("Quantidade de Pistões do Motor: " + veiculo4.getMotor().getQtdPista());
        System.out.println();

        System.out.println("Informações do Veículo 5:");
        System.out.println("Placa: " + veiculo5.getPlaca());
        System.out.println("Marca: " + veiculo5.getMarca());
        System.out.println("Modelo: " + veiculo5.getModelo());
        System.out.println("Cor: " + veiculo5.getCor());
        System.out.println("Velocidade Máxima: " + veiculo5.getVelocMax());
        System.out.println("Quantidade de Rodas: " + veiculo5.getQtdRodas());
        System.out.println("Potência do Motor: " + veiculo5.getMotor().getPotencia());
        System.out.println("Quantidade de Pistões do Motor: " + veiculo5.getMotor().getQtdPista());
        System.out.println();
    }
}
