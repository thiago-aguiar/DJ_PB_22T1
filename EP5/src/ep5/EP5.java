package ep5;

import java.util.Random;

// Static Factory Methods

public class EP5 {
    public static void main(String[] args) {
//        var gerador = new GeradorNumeroAleatorio(6, 1);
//        var gerador = new GeradorNumeroAleatorio(100);

        var gerador      = GeradorNumeroAleatorio.entre(6, 1);
        var geradorMaior = GeradorNumeroAleatorio.maiorQue(1);
        var geradorMenor = GeradorNumeroAleatorio.menorQue(100);
        
//        var rad = new Random();
//        rad.nextInt();
//        rad.nextInt();
    }
    
}
