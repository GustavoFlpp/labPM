package Classes;

import java.time.LocalDate;

public class Cliente {
    private int codCliente;
    private String nome;
    private String CPF;
    private String email;
    private LocalDate dataNasc;

    public Cliente(int codCliente, String nome, String CPF, String email, LocalDate dataNasc) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.dataNasc = dataNasc;
    }

    public void imprimirCliente() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Email: " + this.email);
        System.out.println("Data de nascimento: " + this.dataNasc);
    }
}
