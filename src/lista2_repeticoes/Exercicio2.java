package lista2_repeticoes;

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args){

        int i = 0, result, valueOne, valueTwo = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        valueOne = input.nextInt();

        while(valueTwo == 0){
            System.out.print("Digite o valor 2: ");
            valueTwo = input.nextInt();
            i++;
        }

        result = valueOne / valueTwo;
        System.out.println("O resultado da divisão é igual á: " + result);

        input.close();
    }

}