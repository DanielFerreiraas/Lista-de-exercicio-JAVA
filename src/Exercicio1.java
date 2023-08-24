import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        System.out.printf("Digite um número: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        System.out.println((number > 10)? "É maior que 10" : "Não é maior que 10");

    }
}