package com.mycompany.gestorvendas;

public class Produto {
    String nome;
    String marca;
    double preco;
    
    public Produto(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
