package com.mycompany.palavrasembaralhadas;

public class InverterComposta implements Estrategia {
    
    InverterSimples inverter = new InverterSimples();

    @Override
    public String embaralhar(String palavra) {
        var palavras = palavra.split(" ");
        var resultado = "";
        for (String parte : palavras){
            resultado += 
                    inverter.embaralhar(parte) 
                    + " ";
        }
        return resultado;
    }
    
}
