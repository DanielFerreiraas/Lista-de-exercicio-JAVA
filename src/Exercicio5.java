import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){

        int anoAtual, dataNascimento, idade;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        anoAtual = input.nextInt();

        System.out.print("Digite o ano em que você nasceu: ");
        dataNascimento = input.nextInt();

        idade = anoAtual - dataNascimento;

        System.out.println("Você tem " + idade + " anos");
        System.out.println((idade > 16)? "Você poderá votar esse ano" : "Você não poderá votar esse ano");

    }
}