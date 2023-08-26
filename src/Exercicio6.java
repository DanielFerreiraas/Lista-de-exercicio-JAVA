import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        int valueOne = input.nextInt();

        System.out.print("Digite o valor 2: ");
        int valueTwo = input.nextInt();

        if(valueOne > valueTwo){
            System.out.println("O maior valor é: " + valueOne);
        }else{
            System.out.println("O maior valor é: " + valueTwo);
        }
    }
}