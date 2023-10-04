package lista3_heranca;

public class main {
    public static void main(String[] args){

        Gerente gerente = new Gerente("daniel", "123456", 2000, "daniel");
        Telefonista telefonista = new Telefonista(1000, "clotilde", "01234567");
        Secretaria secretaria = new Secretaria(1000, "Luisa", 5012);

        System.out.println("Gerente: " + "\nNome: " + gerente.getNome() + "\nSalário: " + gerente.getSalario() + "\nLogin: " + gerente.getLogin() + "\nSenha: " + gerente.getSenha()+ "\n");
        System.out.println("Telefonista: " + "\nNome: " + telefonista.getNome() + "\nSalário: " + telefonista.getSalario() + "\nCódigo da Estação: " + telefonista.getCodEstacao()+ "\n");
        System.out.println("Secretaria: " + "\nNome: " + secretaria.getNome() + "\nSalário: " + secretaria.getSalario() + "\nNumero Ramal: " + secretaria.getNumeroRamal()+ "\n");
    }
}