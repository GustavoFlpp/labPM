package Testes;

import Classes.ItemDeOrcamento;
import Classes.Orcamento;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrcamentoTest {
    @Test
    public void testeAdicionarItem() {
        Orcamento orcamento = new Orcamento(1, 5000, 0.10);
        ItemDeOrcamento item = new ItemDeOrcamento("Pão de forma", 10, 3.00);
        boolean resultado = orcamento.adicionarItem(item);

        assertTrue(resultado);
        assertEquals(5030, orcamento.getValorTotal(), 0.001);
    }

    @Test
    public void testeAdicionarMultiplosItens() {
        Orcamento orcamento = new Orcamento(1, 5000, 0.10);

        ItemDeOrcamento item1 = new ItemDeOrcamento("Pão", 10, 2.00);
        ItemDeOrcamento item2 = new ItemDeOrcamento("Leite", 5, 3.00);

        orcamento.adicionarItem(item1);
        orcamento.adicionarItem(item2);

        assertEquals(5035, orcamento.getValorTotal(), 0.001);
    }

    @Test
    public void testeAdicionarItemQuantidadeZero() {
        Orcamento orcamento = new Orcamento(1, 5000, 0.10);
        ItemDeOrcamento item = new ItemDeOrcamento("Produto inválido", 0, 100.00);
        boolean resultado = orcamento.adicionarItem(item);

        assertTrue(resultado);
        assertEquals(5000, orcamento.getValorTotal(), 0.001);
    }

    @Test
    public void testeOrcamentoSemItens() {
        Orcamento orcamento = new Orcamento(1, 5000, 0.10);
        assertEquals(5000, orcamento.getValorTotal(), 0.001);
    }


    @Test
    public void testeConfirmarPagamentos() {
        Orcamento orcamento = new Orcamento(1, 5000, 0.10);
        String resultado = orcamento.confirmarPgtos();

        assertEquals("Pagamentos confirmados.", resultado);
    }

    @Test
    public void testeDescontoAplicado() {
        Orcamento orcamento = new Orcamento(1, 5000, 0.10);
        double valorComDesconto = orcamento.getValorTotal() * (1 - orcamento.getDesconto());
        assertEquals(4500, valorComDesconto, 0.001);
    }


    @Test
    public void testeImprimirOrcamento() {
        Orcamento orcamento = new Orcamento(1, 5000, 0.10);
        String resultado = orcamento.imprimeOrcamento();

        String esperado = "Codigo do Orçamento: 1\nValor total: 5000.0\nDesconto: 0.1";
        assertEquals(esperado, resultado);
    }


    @Test
    public void testeImprimirOrcamentoComItens() {
        Orcamento orcamento = new Orcamento(1, 5000, 0.10);
        ItemDeOrcamento item1 = new ItemDeOrcamento("Pão", 2, 5.00);
        orcamento.adicionarItem(item1);

        String resultado = orcamento.imprimeOrcamento();
        String esperado = "Codigo do Orçamento: 1\nValor total: 5010.0\nDesconto: 0.1";
        assertEquals(esperado, resultado);
    }

    @Test
    public void testeOrcamentoComValorZero() {
        Orcamento orcamento = new Orcamento(1, 0, 0.10);
        double valorComDesconto = orcamento.getValorTotal() * (1 - orcamento.getDesconto());
        assertEquals(0, valorComDesconto, 0.001);
    }


}
