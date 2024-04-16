/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandretrieste.atividade1;

/**
 *
 * @author xande
 */
// Classe Motor
public class Motor {
    private int potencia;
    private int qtdPista;

    // Construtor default
    public Motor() {
        this.potencia = 0;
        this.qtdPista = 0;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getQtdPista() {
        return qtdPista;
    }

    public void setQtdPista(int qtdPista) {
        this.qtdPista = qtdPista;
    }
}
