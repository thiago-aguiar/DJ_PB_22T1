package com.mycompany.estacionamento;

public class Tarifa {
    
    private int quantHoras;
    private Calculo calculo;
    
    public Tarifa(int quantHoras, Calculo calculo) {
        this.quantHoras = quantHoras;
        this.calculo = calculo;
    }
    
    public double calcular() {
        return calculo.calcular(this.quantHoras);
    }
}
