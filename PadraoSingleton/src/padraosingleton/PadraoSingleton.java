package padraosingleton;

public class PadraoSingleton {

    public static void main(String[] args) {
        
        var connect = Connect.getInstancia();
        
        connect.addNome("Fulano");
        connect.addNome("Beltrano");
        connect.addNome("Ciclano");
        
        System.out.println(connect.getNome(2));
        
        var connect2 = Connect.getInstancia();
        
        connect2.addNome("Fulano");
        connect2.addNome("Beltrano");
        connect2.addNome("Ciclano");
        
        
        connect2.updateNome(2, "Thiago");
        System.out.println(connect2.getNome(2));
        System.out.println(connect2.getNome(3));
        
        var listaNomes = connect2.getNomes();
        listaNomes.clear();
        
        System.out.println(connect2.verificarQuantidade());
        System.out.println(connect2.deleteNome("Thiago"));
        System.out.println(connect2.verificarQuantidade());
        
        System.out.println(connect2.getNome(4));
    }
}
