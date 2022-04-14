package com.mycompany.gestorvendas;

import com.mycompany.gestorvendas.FormaDeEntrega;

public class FormaDeEntregaExpressa 
        implements FormaDeEntrega {
    
    @Override
    public double calcularEntrega(double valorTotal) {
        if (valorTotal <= 100.00) return 30.00;
        if (valorTotal <= 200.00) return 28.00;
        if (valorTotal > 200.00) return 25.00;
        return 0.0;
    }
    
}
