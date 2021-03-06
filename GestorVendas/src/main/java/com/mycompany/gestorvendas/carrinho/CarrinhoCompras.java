package com.mycompany.gestorvendas.carrinho;

import com.mycompany.gestorvendas.Entrega.FormaDeEntrega;
import com.mycompany.gestorvendas.Entrega.FormaDeEntregaNormal;
import com.mycompany.gestorvendas.Produto;
import java.util.ArrayList;
import java.util.List;

// A vista, A prazo, com cashback...
// Normal, Expressa, Mesmo dia          , Retirada

public abstract class CarrinhoCompras {
    List<Produto> produtos = new ArrayList<>();
    private FormaDeEntrega formaDeEntrega = new FormaDeEntregaNormal();
    // Construtor
//    public CarrinhoCompras(FormaDeEntrega formaDeEntrega){
//        this.formaDeEntrega = formaDeEntrega;
//    }
    
    public void setFormaDeEntrega(FormaDeEntrega formaDeEntrega){
        this.formaDeEntrega = formaDeEntrega;
    }
      
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }
    public double calcularTotalProdutos(){
        double valorTotal = 0.0;
        for (Produto prod: produtos){
            valorTotal += prod.getPreco();
        }
        return valorTotal;
    }
    public abstract double calcularVariacao();
   
    public double calcularEntrega(){
        return formaDeEntrega.calcularEntrega(calcularTotalProdutos());
    };
    public double calcularValorTotal() {
        double valorTotal = calcularTotalProdutos();
        double desconto = valorTotal * calcularVariacao(); // Hook Method
        double entrega = calcularEntrega();
        double total = valorTotal - desconto + entrega;
        return total;
    }
}
