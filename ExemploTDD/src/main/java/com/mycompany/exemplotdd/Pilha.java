package com.mycompany.exemplotdd;

public class Pilha {

    Object[] elementos = new Object[10];
    int quantidade = 0;

    public boolean estaVazia() {
        return quantidade == 0;
    }

    public void empilhar(Object elemento) {
        elementos[quantidade] = elemento;
        quantidade++;
    }

    public int quantidade() {
        return quantidade;
    }

    public Object desempilhar() {
        var topo = elementos[quantidade-1];
        elementos[quantidade-1] = null;
        quantidade--;
        return topo;
    }

    public Object topo() {
        return elementos[quantidade-1];
    }
    
}
