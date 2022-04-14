package com.mycompany.gestorvendas;

public class CarrinhoAPrazo 
        extends CarrinhoCompras{
    
    private int parcelas;
    public CarrinhoAPrazo(int parcelas){
        this.parcelas = parcelas;
    }
    @Override
    public double calcularVariacao() {
        if (parcelas <= 3) return -0.02;
        if (parcelas <= 6) return -0.04;
        if (parcelas > 6) return -0.08;
        return 0.0;
    }
}
