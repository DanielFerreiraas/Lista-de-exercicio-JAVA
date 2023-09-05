package lista2_repeticoes;

import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args){

        int N;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor a ser multiplicado: ");
        N = input.nextInt();

        for(int i = 1; i <= 10 ; i++){
            System.out.println(i + " x " + N + " = " + i * N);
        }
        input.close();
    }
}