package Classes;

public class Categoria {
    private int codCategoria;
    private String nomeCategoria;
    private String departamento;

    public Categoria(int codCategoria, String nomeCategoria, String departamento) {
        this.codCategoria = codCategoria;
        this.nomeCategoria = nomeCategoria;
        this.departamento = departamento;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void imprimirCategoria() {
        System.out.println("Codigo Classes.Categoria: " + this.codCategoria);
        System.out.println("Nome: " + this.nomeCategoria);
        System.out.println("Departamento: " + this.departamento);
    }
}
