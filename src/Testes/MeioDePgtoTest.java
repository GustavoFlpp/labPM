package Testes;

import Classes.Pagamento;
import org.junit.Test;
import Classes.MeioDePgto;
import static org.junit.Assert.*;

public class MeioDePgtoTest {
    @Test
    public void testValidacaoParcelasValido() {
        MeioDePgto meioPgto = new MeioDePgto("Credito", 3, 0.30);
        meioPgto.validarParcelas();
        assertEquals(3, meioPgto.getNumParcelas());
    }

    @Test
    public void testValidacaoParcelasInvalido() {
        MeioDePgto meioPgto = new MeioDePgto("Credito", 5, 0.30);
        meioPgto.validarParcelas();
        assertFalse(meioPgto.getNumParcelas() <= 3);
    }

    @Test
    public void testNomePagamentoValido() {
        // Teste para nome de pagamento válido
        MeioDePgto meioPgtoDebito = new MeioDePgto("Debito", 1, 0.10);
        MeioDePgto meioPgtoCredito = new MeioDePgto("Credito", 2, 0.20);

        meioPgtoDebito.nomePagamento();
        meioPgtoCredito.nomePagamento();

        assertEquals("Debito", meioPgtoDebito.getNomePgto());
        assertEquals("Credito", meioPgtoCredito.getNomePgto());
    }

    @Test
    public void testNomePagamentoInvalido() {
        // Teste para nome de pagamento inválido
        MeioDePgto meioPgtoInvalido = new MeioDePgto("Pix", 1, 0.10);
        meioPgtoInvalido.nomePagamento();

        assertNotEquals("Debito", meioPgtoInvalido.getNomePgto());
        assertNotEquals("Credito", meioPgtoInvalido.getNomePgto());
    }

    @Test
    public void testandoDescontoTotalPagamento(){
        Pagamento pagamento = new Pagamento(true, 1000.0);
        MeioDePgto meioPgto = new MeioDePgto("Credito", 3, 0.30);

        double desconto = meioPgto.descontoTotalPagamento(pagamento);
        assertEquals(300, desconto, 0.001);
    }
}
