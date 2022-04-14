package com.mycompany.estacionamento;

public class CalculoValorHora implements Calculo{
    
    private int valorHora;
    
    public CalculoValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcular(int quantHoras) {
        return valorHora * quantHoras;
    }
}
