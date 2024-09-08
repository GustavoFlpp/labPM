package Classes;

public class Pagamento {
    private boolean confirmacao;
    private double valorPgto;

    public Pagamento(boolean confirmacao, double valorPgto) {
        this.confirmacao = confirmacao;
        this.valorPgto = valorPgto;
    }

    public boolean getConfirmacao() {
        return confirmacao;
    }

    public double getValorPgto() {
        return valorPgto;
    }

    public void setValorPgto(double valorPgto) {
        this.valorPgto = valorPgto;
    }
}
