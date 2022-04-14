package unit;

import com.mycompany.gestorvendas.FormaDeEntregaExpressa;
import com.mycompany.gestorvendas.CarrinhoAPrazo;
import com.mycompany.gestorvendas.CarrinhoAVistaExpressa;
import com.mycompany.gestorvendas.CarrinhoAVista;
import com.mycompany.gestorvendas.FormaDeEntregaNormal;
import com.mycompany.gestorvendas.Produto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculoDeVendasUnitTest {
    // Compra de    100,00
    // desconto     5,00
    // entrega      15,00
    // total venda  110,00
    @Test
    public void DeveRetornar110ParaCompraAVistaNormalDe100(){
        // Arrumação
        Produto produto = new Produto("Nome", "Marca", 100.00);
        CarrinhoAVista carrinho = new CarrinhoAVista();
        carrinho.addProduto(produto);
        carrinho.setFormaDeEntrega(new FormaDeEntregaNormal());
        
        // Ação
        double desconto = carrinho.calcularVariacao();
        double entrega = carrinho.calcularEntrega();
        double total = carrinho.calcularValorTotal();
        
        // Averiguação
        assertEquals(0.05, desconto);
        assertEquals(15.00, entrega);
        assertEquals(110.00, total);
    }
    
    // Compra de    200,00
    // desconto     14,00 (0.07)
    // entrega      12,00
    // total venda  198,00
    @Test
    public void DeveRetornar198ParaCompraAVistaNormalDe200(){
        Produto produto = new Produto("Nome", "Marca", 200.00);
        CarrinhoAVista carrinho = new CarrinhoAVista();
        carrinho.addProduto(produto);
        carrinho.setFormaDeEntrega(new FormaDeEntregaNormal());
        
        double desconto = carrinho.calcularVariacao();
        double entrega = carrinho.calcularEntrega();
        double total = carrinho.calcularValorTotal();
        
        assertEquals(0.07, desconto);
        assertEquals(12.00, entrega);
        assertEquals(198.00, total);
    }
    
    
    // Compra de    300,00
    // desconto     30,00 (0.10)
    // entrega      10,00
    // total venda  280,00
    @Test
    public void DeveRetornar280ParaCompraAVistaNormalDe300(){
        Produto produto = new Produto("Nome", "Marca", 300.00);
        CarrinhoAVista carrinho = new CarrinhoAVista();
        carrinho.addProduto(produto);
        carrinho.setFormaDeEntrega(new FormaDeEntregaNormal());
        
        double desconto = carrinho.calcularVariacao();
        double entrega = carrinho.calcularEntrega();
        double total = carrinho.calcularValorTotal();
        
        assertEquals(0.10, desconto);
        assertEquals(10.00, entrega);
        assertEquals(280.00, total);
    }
    
    // Compra de    100,00
    // desconto     5,00
    // entrega      30,00
    // total venda  125,00
    @Test
    public void DeveRetornar125ParaCompraAVistaExpressaDe100(){
        // Arrumação
        Produto produto = new Produto("Nome", "Marca", 100.00);
        CarrinhoAVista carrinho = new CarrinhoAVista();
        carrinho.addProduto(produto);
        carrinho.setFormaDeEntrega(new FormaDeEntregaExpressa());
        
        // Ação
        double desconto = carrinho.calcularVariacao();
        double entrega = carrinho.calcularEntrega();
        double total = carrinho.calcularValorTotal();
        
        // Averiguação
        assertEquals(0.05, desconto);
        assertEquals(30.00, entrega);
        assertEquals(125.00, total);
    }
    
    // Prazo Entrega Normal
    // Compra de    100,00
    // prazo de 3x
    // acréscimo     2,00
    // entrega      15,00
    // total venda  117,00
    @Test
    public void DeveRetornar117ParaCompraAPrazoNormalDe100Em3x(){
        Produto produto = new Produto("Nome", "Marca", 100.00);
        CarrinhoAPrazo carrinho = new CarrinhoAPrazo(3);
        carrinho.addProduto(produto);
        carrinho.setFormaDeEntrega(new FormaDeEntregaNormal());
        
        double acrescimo = carrinho.calcularVariacao();
        double entrega = carrinho.calcularEntrega();
        double total = carrinho.calcularValorTotal();
        
        assertEquals(-0.02, acrescimo);
        assertEquals(15.00, entrega);
        assertEquals(117.00, total);
    }
}
