package lista2_repeticoes;

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args){

        int result, valueOne, valueTwo = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        valueOne = input.nextInt();

        for(int i = 0; valueTwo == 0 ; i++){
            System.out.print("Digite o valor 2: ");
            valueTwo = input.nextInt();
        }

        result = valueOne / valueTwo;
        System.out.println("O resultado da divisão é igual á: " + result);

        input.close();
    }

}