package lista3_heranca;

public class Secretaria extends Funcionario {

    private int numeroRamal;

    public Secretaria(double salario, String nome, int numeroRamal){
        super(salario, nome);
        this.numeroRamal = numeroRamal;
    }

    public int getNumeroRamal() {
        return numeroRamal;
    }

    public void setNumeroRamal(int numeroRamal) {
        this.numeroRamal = numeroRamal;
    }
}