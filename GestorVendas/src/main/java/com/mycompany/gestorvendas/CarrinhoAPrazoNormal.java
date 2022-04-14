package com.mycompany.gestorvendas;

public class CarrinhoAPrazoNormal extends CarrinhoCompras{
    private int parcelas;
   
    public CarrinhoAPrazoNormal(int parcelas){
        super(new FormaDeEntregaNormal());
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
