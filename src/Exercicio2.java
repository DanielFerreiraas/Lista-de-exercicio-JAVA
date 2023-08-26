import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        int number;

        System.out.print("Digite um número: ");
        Scanner input = new Scanner(System.in);

        number = input.nextInt();

        if ((number % 2) == 0) {
            System.out.println(number + " É um número par");
        } else {
            System.out.println(number + " É um número ímpar");
        }
    }
}