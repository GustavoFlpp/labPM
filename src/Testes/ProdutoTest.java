package Testes;

import Classes.Produto;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProdutoTest {
    @Test
    public void testeTemProduto(){
        Produto produto = new Produto(1, "Cadeira", 100.00, 5);
        assertTrue(produto.temEstoque(3));
        assertFalse(produto.temEstoque(7));
    }

    @Test
    public void testeAdicionandoEstoque(){
        Produto produto = new Produto(1, "Abacate", 5.80, 7);
        produto.addEstoque(10);
        assertEquals(17, produto.getQuantidade());
    }

    @Test
    public void testeAdicionandoEstoqueNegativo(){
        Produto produto = new Produto(1, "Carne", 30.00, 5);
        produto.addEstoque(-5);
        assertEquals(5, produto.getQuantidade());
    }

    @Test
    public void testeRemoveEstoque(){
        Produto produto = new Produto(1, "Água", 2.50, 10);
        boolean removido = produto.removeEstoque(5);
        assertTrue(removido);
        assertEquals(5, produto.getQuantidade());
    }

    @Test
    public void testeRemoveEstoqueNegativo(){
        Produto produto = new Produto(1, "Garrafa de Refrigerante", 10.00, 9);
        boolean removido = produto.removeEstoque(-7);
        assertFalse(removido);
        assertEquals(9, produto.getQuantidade());
    }

    @Test
    public void testeRemoveEstoqueExato(){
        Produto produto = new Produto(1, "Batata", 3.00, 50);
        boolean removido = produto.removeEstoque(50);
        assertTrue(removido);
        assertEquals(0, produto.getQuantidade());
    }

    @Test
    public void testeRemoveEstoqueInsuficiente(){
        Produto produto = new Produto(1, "Carro", 30000, 2);
        boolean removido = produto.removeEstoque(5);
        assertFalse(removido);
        assertEquals(2, produto.getQuantidade());
    }
}
