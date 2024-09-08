package Classes;

public class ItemDeOrcamento {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public ItemDeOrcamento(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double getValorTotal() {
        return this.quantidade * this.precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}

