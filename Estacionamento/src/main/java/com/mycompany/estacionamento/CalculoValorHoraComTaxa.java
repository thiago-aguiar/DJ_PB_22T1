package com.mycompany.estacionamento;


import com.mycompany.estacionamento.Calculo;

public class CalculoValorHoraComTaxa implements Calculo {
    
    private int taxaIncial;
    private int carencia;
    private int valorHora;

    public CalculoValorHoraComTaxa(
            int taxaInicial, 
            int carencia, 
            int valorHora) {
        this.taxaIncial = taxaInicial;        
        this.carencia = carencia;
        this.valorHora = valorHora;
    }

    @Override
    public double calcular(int quantHoras) {
        var hora = quantHoras - this.carencia;
        var valorParcial = hora * this.valorHora;
        return valorParcial + this.taxaIncial;
    }
    
}
