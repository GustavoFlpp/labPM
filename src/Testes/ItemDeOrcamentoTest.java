package Testes;

import Classes.ItemDeOrcamento;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemDeOrcamentoTest {
    @Test
    public void testandoValorTotal(){
        ItemDeOrcamento item = new ItemDeOrcamento("Banana", 20, 5.00);
        assertEquals(100.00, item.valorTotal(), 0.001);
    }
}
