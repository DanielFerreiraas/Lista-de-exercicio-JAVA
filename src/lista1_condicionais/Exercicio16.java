package lista1_condicionais;

import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args){

        int soma, valueOne, valueTwo, valueThree;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        valueOne = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        valueTwo = input.nextInt();

        System.out.print("Digite o terceiro valor: ");
        valueThree = input.nextInt();

        if(valueOne > valueTwo && valueTwo > valueThree){
            soma = valueOne + valueTwo;
            System.out.println("A soma do valor 1 com o valor 2 é igual á: " + soma);
        }else if(valueTwo > valueOne && valueThree > valueOne){
            soma = valueTwo + valueThree;
            System.out.println("A soma do valor 2 com o valor 3 é igual á: " + soma);
        }else{
            soma = valueOne + valueThree;
            System.out.println("A soma do valor 1 com o valor 3 é igual á: " + soma);
        }
    }
}