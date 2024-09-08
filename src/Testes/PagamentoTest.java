package Testes;

import Classes.Pagamento;
import org.junit.Test;
import static org.junit.Assert.*;

public class PagamentoTest {
    @Test
    public void testandoGettersAndSetters() {
        Pagamento pagamento = new Pagamento(true, 500.0);
        assertTrue(pagamento.getConfirmacao());

        assertEquals(500.0, pagamento.getValorPgto(), 0.001);
        pagamento.setValorPgto(1000.0);
        assertEquals(1000.0, pagamento.getValorPgto(), 0.001);
    }
}
