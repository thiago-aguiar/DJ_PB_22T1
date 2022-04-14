package padraosingleton;

public class PadraoSingleton {

    public static void main(String[] args) {
        
        var connect = new Connect();
        
        connect.addNome("Fulano");
        connect.addNome("Beltrano");
        connect.addNome("Ciclano");
        
        var connect2 = new Connect();
        
        connect2.addNome("Fulano");
        connect2.addNome("Beltrano");
        connect2.addNome("Ciclano");
        
        System.out.println(connect.nomes.size());
        System.out.println(connect2.nomes.size());
        
        
    }
    
}
