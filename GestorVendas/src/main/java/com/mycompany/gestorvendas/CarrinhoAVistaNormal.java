package com.mycompany.gestorvendas;

public class CarrinhoAVistaNormal extends CarrinhoCompras{
    
    public CarrinhoAVistaNormal() {
        super(new FormaDeEntregaNormal());
    }
    
    @Override
    public double calcularVariacao() {
        double valorTotal = calcularTotalProdutos();
        if (valorTotal <= 100.00) return 0.05;
        if (valorTotal <= 200.00) return 0.07;
        if (valorTotal > 200.00) return 0.10;
        return 0.0;
    }
}
