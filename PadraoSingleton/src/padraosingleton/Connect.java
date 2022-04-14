package padraosingleton;

import java.util.ArrayList;
import java.util.List;

public class Connect {
    
    private static Connect instancia;
    private List<String> nomes = new ArrayList<>();
    
    private Connect(){};
    
    public static Connect getInstancia(){
        if (instancia == null)
            instancia = new Connect();
        return instancia;
    }
    
    public int verificarQuantidade(){
        return nomes.size();
    }
    
    public void addNome(String nome){
        nomes.add(nome);
    }
    
    public List<String> getNomes(){
        List<String> retorno = new ArrayList<>();
        retorno.addAll(nomes);
        return retorno;
    }
    
    public String getNome(int index){
        return nomes.get(index);
    }
    
    public String updateNome(int index, String nome){
        return nomes.set(index, nome);
    }
    
    public String deleteNome(int index){
        return nomes.remove(index);
    }
    
    public boolean deleteNome(String nome){
        return nomes.remove(nome);
    }
    
}
