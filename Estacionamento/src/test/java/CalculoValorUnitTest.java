import com.mycompany.estacionamento.CalculoValorHoraComTaxa;
import com.mycompany.estacionamento.Tarifa;
import com.mycompany.estacionamento.CalculoValorHora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculoValorUnitTest {
    
    // Retorne o valor do estacionamento 
    // considerando a hora e o valor hora
    // valor hora = 10
    // hora = X
    @Test
    public void deveCalcularHoraValorHora(){
                                // hora de permanência, estratégia
        Tarifa tarifa = new Tarifa(4, new CalculoValorHora(10));
        double valor = tarifa.calcular();
        assertEquals(40, valor);
    }
    
    // Retorne o valor do estacionamento 
    // com uma taxa incial de 20 para as 3 primeiras horas
    // considerando a hora e o valor hora
    // valor hora = 10
    // hora = X
    @Test
    public void deveCalcularHoraValorHoraComTaxa(){
                                // hora de permanência, estratégia
        Tarifa tarifa = new Tarifa(
                4, 
                new CalculoValorHoraComTaxa(20, 3, 10));
        
        double valor = tarifa.calcular();
        
        assertEquals(30, valor);
    }
}
