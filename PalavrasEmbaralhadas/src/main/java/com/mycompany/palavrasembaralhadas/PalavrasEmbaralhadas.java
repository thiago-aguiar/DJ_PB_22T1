package com.mycompany.palavrasembaralhadas;

public class PalavrasEmbaralhadas {
    
    public static void main(String[] args) {
        var sysout = System.out;
        sysout.println("\nPalavras Embaralhadas\n");
        
        String palavra = Embaralhador
                .embaralhar(
                        "Palavra da sorte",
                        new InverterComposta());
        
        sysout.println(palavra);
    }
    
}
