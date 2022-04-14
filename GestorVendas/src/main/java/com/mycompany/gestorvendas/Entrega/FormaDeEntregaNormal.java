package com.mycompany.gestorvendas.Entrega;

public class FormaDeEntregaNormal 
        implements FormaDeEntrega {

    public FormaDeEntregaNormal() {
    }
   
    @Override
    public double calcularEntrega(double valorTotal) {
        // double valorTotal = calcularTotalProdutos();
        if (valorTotal <= 100.00) return 15.00;
        if (valorTotal <= 200.00) return 12.00;
        if (valorTotal > 200.00) return 10.00;
        return 0.0;
    }
}
