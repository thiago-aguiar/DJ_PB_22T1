package padraosingleton;

import java.util.ArrayList;
import java.util.List;

public class Connect {
    
    private static Connect instancia;
    List<String> nomes = new ArrayList<>();
    
    private Connect(){};
    
    public static Connect getInstancia(){
        if (instancia == null)
            instancia = new Connect();
        return instancia;
    }
    
    public void addNome(String nome){
        nomes.add(nome);
    }
    
}
