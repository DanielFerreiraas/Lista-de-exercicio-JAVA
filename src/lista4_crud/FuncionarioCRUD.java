package lista4_crud;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioCRUD {
    private List<Funcionario> funcionarios;

    public FuncionarioCRUD() {
        this.funcionarios = new ArrayList<>();
    }
    public void criarFuncionario(double salario, String nome) {
        Funcionario funcionario = new Funcionario(salario, nome);
        funcionarios.add(funcionario);
    }

    public void mostrarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Salário: " + funcionario.getSalario());
        }
    }

    public void atualizarFuncionario(String nome, double novoSalario) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                funcionario.setSalario(novoSalario);
                break;
            }
        }
    }

    public void deletarFuncionario(String nome) {
        Funcionario funcionarioParaRemover = null;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                funcionarioParaRemover = funcionario;
                break;
            }
        }
        if (funcionarioParaRemover != null) {
            funcionarios.remove(funcionarioParaRemover);
        }
    }

    public static void main(String[] args) {
        FuncionarioCRUD crud = new FuncionarioCRUD();

        crud.criarFuncionario(2000, "Alice");
        crud.criarFuncionario(2500, "Bob");
        crud.criarFuncionario(1800, "Charlie");

        System.out.println("Funcionários antes da atualização:");
        crud.mostrarFuncionarios();

        crud.atualizarFuncionario("Bob", 2800);

        System.out.println("Funcionários após a atualização:");
        crud.mostrarFuncionarios();

        crud.deletarFuncionario("Alice");

        System.out.println("Funcionários após a exclusão:");
        crud.mostrarFuncionarios();
    }
}