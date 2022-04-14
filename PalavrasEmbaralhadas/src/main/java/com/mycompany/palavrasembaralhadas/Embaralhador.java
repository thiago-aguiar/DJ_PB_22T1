package com.mycompany.palavrasembaralhadas;

class Embaralhador {
    
    static String embaralhar(
            String palavra, 
            Estrategia estrategia) {
        return estrategia.embaralhar(palavra);
    }
    
}
