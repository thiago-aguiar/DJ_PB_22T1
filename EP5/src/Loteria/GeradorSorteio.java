package Loteria;

import java.util.ArrayList;
import java.util.Random;

public class GeradorSorteio {
    private int quantidade = 0;
    private int maiorNumero = Integer.MAX_VALUE;
    private Random random = new Random();
    // private String nome = "Thiago";
    // new String("Thiago");
    
    private GeradorSorteio(int quantidade, int maiorNumero){
        this.quantidade = quantidade;
        this.maiorNumero = maiorNumero;
    }
    
    public static GeradorSorteio megasena(int quantidade){
        if (quantidade < 6) return new GeradorSorteio(6, 60);
        if (quantidade > 9) return new GeradorSorteio(9, 60);        
        return new GeradorSorteio(quantidade, 60);        
    }
    
    public static GeradorSorteio quina(int quantidade){
        if (quantidade < 5) return new GeradorSorteio(5, 80);
        if (quantidade > 15) return new GeradorSorteio(15, 80);
        return new GeradorSorteio(quantidade, 80);
    }
    
    public static GeradorSorteio bingo(){
        return new GeradorSorteio(24, 75);
    }
    
    public static GeradorSorteio rifa(
            int quantidade, int maiorNumero){
//        if (quantidade > maiorNumero)
//            return new GeradorSorteio(maiorNumero, quantidade);
//        return new GeradorSorteio(quantidade, maiorNumero);
        int quant = Math.min(quantidade, maiorNumero);
        int maior = Math.max(quantidade, maiorNumero);
        return new GeradorSorteio(quant, maior);
    }
    
    public ArrayList<Integer> gerarNumeros(){
        var numeros = new ArrayList<Integer>();
        for (int i = 0; i < quantidade; i++){
            // random.nextInt(maiorNumero) [0, maiorNumero[            // random.nextInt(maiorNumero) [0, maiorNumero[
            // random.nextInt(maiorNumero) [1, maiorNumero]
            numeros.add(random.nextInt(maiorNumero) + 1);
        }
        return numeros;
    }
}
