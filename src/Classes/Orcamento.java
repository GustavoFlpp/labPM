package Classes;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
    private int codOrcamento;
    private double valorTotal;
    private double desconto;
    private List<ItemDeOrcamento> itens;

    public Orcamento(int codOrcamento, double valorTotal, double desconto) {
        this.codOrcamento = codOrcamento;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
        this.itens = new ArrayList<>();
    }

    public double getValorTotal(){
        return valorTotal;
    }

    public void setValorTotal( double valorTotal){
        this.valorTotal = valorTotal;
    }

    public int getCodOrcamento() {
        return codOrcamento;
    }

    public void setCodOrcamento(int codOrcamento) {
        this.codOrcamento = codOrcamento;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }


    public boolean adicionarItem(ItemDeOrcamento item) {
        boolean adicionado = this.itens.add(item);
        if (adicionado){
            this.valorTotal += item.valorTotal();
        }
        return adicionado;
    }

    public String confirmarPgtos() {
        return "Pagamentos confirmados.";
    }

    public String imprimeOrcamento() {
        return "Codigo do Orçamento: " + this.codOrcamento + "\n" +
                "Valor total: " + this.valorTotal + "\n" +
                "Desconto: " + this.desconto;
    }

}

