import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        int valueOne = input.nextInt();

        System.out.print("Digite o valor 2: ");
        int valueTwo = input.nextInt();

        if(valueOne < valueTwo){
            System.out.println("Os números digitados na ordem crescente são: \n" + valueOne + "\n" + valueTwo);
        }else if(valueTwo < valueOne){
            System.out.println("Os números digitados na ordem crescente são: \n" + valueTwo + "\n" + valueOne);
        }

    }
}