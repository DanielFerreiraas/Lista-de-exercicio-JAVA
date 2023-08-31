package lista1_condicionais;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args ){

        int valueOne, valueTwo, valueThree;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        valueOne = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        valueTwo = input.nextInt();

        System.out.print("Digite o terceiro valor: ");
        valueThree = input.nextInt();

        if(valueOne > valueTwo && valueOne > valueThree){
            System.out.print("O maior valor é: " + valueOne);
        }else if(valueTwo > valueThree){
            System.out.print("O maior valor é: " + valueTwo);
        }else{
            System.out.print("O maior valor é: " + valueThree);
        }
    }
}