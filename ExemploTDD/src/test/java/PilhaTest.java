import com.mycompany.exemplotdd.Pilha;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PilhaTest {
    
    // Método para indicar se a pilha está vazia
    @Test
    public void deveVerificarQueAPilhaEstaVazia(){
        // Arrumação
        var pilha = new Pilha();
        
        // Ação
        boolean estaVazia = pilha.estaVazia();
        
        // Verificação
        assertTrue(estaVazia);
    }
    
    // Método para verificar a quant. de elementos na pilha
    @Test
    public void deveRetornarAQuantidade0(){
        var pilha = new Pilha();
        int quant = pilha.quantidade();
        assertEquals(0, quant);
    }
    
    @Test
    public void deveRetornarAQuantidade1(){
        var pilha = new Pilha();
        pilha.empilhar("Primeiro");
        int quant = pilha.quantidade();
        assertEquals(1, quant);
    }
    
    @Test
    public void deveRetornarAQuantidade2(){
        var pilha = new Pilha();
        pilha.empilhar("Primeiro");        
        pilha.empilhar("Segundo");
        int quant = pilha.quantidade();
        assertEquals(2, quant);
    }
    
    // Método para empilhar um elemento na pilha
    @Test
    public void deveInserirUmElementoNaPilha(){
        var pilha = new Pilha();
        
        pilha.empilhar("Primeiro");
        var estaVazia = pilha.estaVazia();
        
        assertFalse(estaVazia);
    }
    
//    @Test
//    public void deveInserirDoisElementosNaPilha(){
//        var pilha = new Pilha();
//        
//        pilha.empilhar("Primeiro");        
//        pilha.empilhar("Segundo");
//        var estaVazia = pilha.estaVazia();
//        
//        assertFalse(estaVazia);
//    }
    
    // Método para desempilhar um elemento da pilha
    @Test
    public void deveDesempilharUmElementoDaPilha(){
        var elemento = "Primeiro";
        var pilha = new Pilha();
        pilha.empilhar(elemento);
        
        Object topo = pilha.desempilhar();
        
        assertEquals(elemento, topo);
    }
    
    @Test
    public void deveDesempilharUmElementoDeDois(){
        var elemento1 = "Primeiro";
        var elemento2 = "Segundo";
        var pilha = new Pilha();
        pilha.empilhar(elemento1);        
        pilha.empilhar(elemento2);
        
        Object topo = pilha.desempilhar();
        int quantidade = pilha.quantidade();
        
        assertEquals(elemento2, topo);
        assertEquals(1, quantidade);
    }
    
    // Método para informar qual é o elemento do topo
    @Test
    public void deveInformarQualElementoDoTopo(){
        var ele1 = "um";
        var ele2 = "dois";
        var pilha = new Pilha();
        pilha.empilhar(ele1);
        pilha.empilhar(ele2);
        
        Object topo = pilha.topo();
        int quantidade = pilha.quantidade();
        
        assertEquals(ele2, topo);
        assertEquals(2, quantidade);
    }
}
