package lista3_heranca;

public class Gerente extends Funcionario {

    private String login;
    private String senha;

    public Gerente(String login, String senha, double salario, String nome){
        super(salario, nome);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}