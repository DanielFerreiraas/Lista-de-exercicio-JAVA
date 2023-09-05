package lista2_repeticoes;

import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args){

        int N;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        N = input.nextInt();

        for( int i = 1; i <= N ; i++ ){
            System.out.println(i);
        }
        input.close();
    }
}