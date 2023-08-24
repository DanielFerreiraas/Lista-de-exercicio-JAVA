import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){

        System.out.print("Digite a nota da primeira prova: ");
        Scanner input = new Scanner(System.in);
        float primeiraNota = input.nextFloat();

        System.out.print("Digite a nota da segunda prova: ");
        Scanner input2 = new Scanner(System.in);
        float segundaNota = input2.nextFloat();

        float media = (primeiraNota + segundaNota)/2;

        if(media >= 6){
            System.out.print("Você foi aprovado com a média: " + media);
        }else{
            System.out.print("Você foi reprovado com a média: " + media);
        }
    }
}