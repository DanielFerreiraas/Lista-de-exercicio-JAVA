package lista1_condicionais;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        int number;

        System.out.printf("Digite um número: ");
        Scanner input = new Scanner(System.in);

        number = input.nextInt();

        System.out.println((number > 10)? "É maior que 10" : "Não é maior que 10");

    }
}