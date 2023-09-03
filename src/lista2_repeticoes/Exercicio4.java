package lista2_repeticoes;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){

        int i = 0, result, valueOne, valueTwo;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        valueOne = input.nextInt();

        System.out.print("Digite o valor 2: ");
        valueTwo = input.nextInt();

        while(valueTwo == 0){
            System.out.println("VALOR INVÁLIDO");
            System.out.print("Digite o valor 2 novamente: ");
            valueTwo = input.nextInt();
            i++;
        }

        result = valueOne / valueTwo;
        System.out.println("O resultado da divisão é igual á: " + result);

        input.close();
    }

}
