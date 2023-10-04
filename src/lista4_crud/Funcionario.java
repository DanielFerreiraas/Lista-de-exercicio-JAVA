package lista4_crud;

public class Funcionario {
    private double salario;
    private String nome;

    public Funcionario (double salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}