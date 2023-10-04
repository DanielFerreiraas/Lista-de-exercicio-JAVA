package lista3_heranca;

public class Telefonista extends Funcionario{

    private String codEstacao;

    public Telefonista(double salario, String nome, String codEstacao){
        super(salario, nome);
        this.codEstacao = codEstacao;
    }

    public String getCodEstacao() {
        return codEstacao;
    }

    public void setCodEstacao(String codEstacao) {
        this.codEstacao = codEstacao;
    }
}