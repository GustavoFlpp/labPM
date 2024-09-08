package Classes;

public class Produto {
    private int codProduto;
    private String nomeProduto;
    private double valorProduto;
    private int quantidade;
    private int quantidadeTotal = 0;
    private final int ESTOQUEMINIMO = 5;

    // Construtor
    public Produto(int codProduto, String nomeProduto, double valorProduto, int quantidade) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidade = quantidade;
    }

    // Getters
    public int getCodProduto() {
        return codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean removeEstoque(int qtde) {
        if (qtde > 0 && temEstoque(qtde)){
            this.quantidade -= qtde;
            return true;
        } else if(qtde < 0){
            System.out.println("A quantidade é inválida. Por favor, insira um valor positivo.");
            return false;
        }
        return false;
    }

    public void addEstoque(int qtde) {
        if (qtde > 0){
            this.quantidade += qtde;
        } else {
            System.out.println("A quantidade é inválida. Por favor, insira um valor positivo.");
        }
    }

    public boolean temEstoque(int qtde) {
        return this.quantidade >= qtde;
    }

    public void imprimeProduto() {
        System.out.println("Codigo Produto: " + this.codProduto);
        System.out.println("Nome do Produto: " + this.nomeProduto);
        System.out.println("Valor do Produto: " + this.valorProduto);
        System.out.println("Quantidade: " + getQuantidade());
    }

}
