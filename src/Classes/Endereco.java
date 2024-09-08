package Classes;

public class Endereco {
    private int cep;
    private int numero;
    private String ref;
    private String logradouro;
    private String complemento;
    private String cidade;
    private String estado;
    private int codEndereco;

    public Endereco(int cep, int numero, String ref, String logradouro, String complemento, String cidade,
                    String estado, int codEndereco) {
        this.cep = cep;
        this.numero = numero;
        this.ref = ref;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.codEndereco = codEndereco;
    }

    public void imprimirEndereco() {
        System.out.println("Codigo do endereço: " + this.codEndereco);
        System.out.println("Cep: " + this.cep);
        System.out.println("Numero: " + this.numero);
        System.out.println("Referencia:  " + this.ref);
        System.out.println("Logradouro: " + this.logradouro);
        System.out.println("Complemento: " + this.complemento);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);

    }

}

