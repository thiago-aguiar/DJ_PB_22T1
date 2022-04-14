package Loteria;

import java.util.ArrayList;

public class Loteria {
    public static void main(String[] args) {
//        ArrayList<Integer> numeros 
//                = new GeradorSorteio(6, 3)
//                .gerarNumeros();
        
//        ArrayList<Integer> numeros
//                = GeradorSorteio
//                        .megasena(8)
//                        .gerarNumeros();
        
//        ArrayList<Integer> numeros
//                = GeradorSorteio
//                        .quina(2)
//                        .gerarNumeros();
        
//        ArrayList<Integer> numeros
//                = GeradorSorteio
//                        .bingo()
//                        .gerarNumeros();

        ArrayList<Integer> numeros
                = GeradorSorteio
                        .rifa(100, 3)
                        .gerarNumeros();
        System.out.println(numeros);
    }
}
