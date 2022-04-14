package com.mycompany.palavrasembaralhadas;

public class InverterSimples implements Estrategia {

    @Override
    public String embaralhar(String palavra) {
        var stringBuilder 
                = new StringBuilder(palavra);
        return stringBuilder
                .reverse()
                .toString();
    }
    
}
