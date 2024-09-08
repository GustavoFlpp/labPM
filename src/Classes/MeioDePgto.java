package Classes;

public class MeioDePgto {
    private String nomePgto;
    private int numParcelas;
    private double taxaCartao;
    private static int NUMMAXPARCELAS = 3;

    public MeioDePgto(String nomePgto, int numParcelas, double taxaCartao) {
        this.nomePgto = nomePgto;
        this.numParcelas = numParcelas;
        this.taxaCartao = taxaCartao;
    }

    public void setNomePgto(String nomePgto) {
        this.nomePgto = nomePgto;
    }

    public String getNomePgto() {
        return nomePgto;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public void setTaxaCartao(double taxaCartao) {
        this.taxaCartao = taxaCartao;
    }

    public double getTaxaCartao() {
        return taxaCartao;
    }

    public void validarParcelas() {
        if (this.numParcelas <= NUMMAXPARCELAS) {
            System.out.printf("O numero de parcelas é: " + this.numParcelas + ", e a taxa do cartao foi" + this.taxaCartao);
        } else {
            System.out.println("O numero de parcelas é invalido.");
        }
    }

    public void nomePagamento() {
        if (this.nomePgto == "Debito" || this.nomePgto == "Credito") {
            System.out.printf("O metodo de pagamento foi: " + this.nomePgto + "\n");
        } else {
            System.out.println("Metodo de pagamento invalido. \n");
        }
    }

    public double descontoTotalPagamento(Pagamento pagamento){
        return pagamento.getValorPgto() * this.taxaCartao;
    }

    public void exibirPagamento() {
        nomePagamento();
        validarParcelas();
    }
}
