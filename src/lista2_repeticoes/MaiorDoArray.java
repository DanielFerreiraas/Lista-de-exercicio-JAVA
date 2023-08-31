package lista2_repeticoes;

import java.util.Scanner;
public class MaiorDoArray {
    public static void main(String[] args){

        int indiceMaior = 0;
        int maior = Integer.MIN_VALUE;
        int [] arrayNumber = new int [5];

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; i++){

            System.out.print("Digite um número: ");
            arrayNumber[i] = input.nextInt();

            if(arrayNumber[i] > maior){
                maior = arrayNumber[i];
                indiceMaior = i;
            }

        }
        System.out.println("O maior número é " + maior + " que pertence ao índice " + indiceMaior);
    }
}