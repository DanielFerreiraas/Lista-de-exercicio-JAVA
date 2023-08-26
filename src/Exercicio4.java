import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        float primeiraNota = input.nextFloat();

        System.out.print("Digite a nota da segunda prova: ");
        float segundaNota = input.nextFloat();

        float media = (primeiraNota + segundaNota)/2;

        if(media >= 6){
            System.out.print("Você foi aprovado com a média: " + media);
        }else{
            System.out.print("Você foi reprovado com a média: " + media);
        }
    }
}