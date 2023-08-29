import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args){

        int value;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor qualquer: ");
        value = input.nextInt();

        if(value > 0){
            System.out.println("O valor é positivo");
        }else if(value == 0){
            System.out.println("O valor é zero");
        }else{
            System.out.println("O valor é negativo");
        }
    }
}