import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de maçãs: ");
        int quantidadeDeMacas = input.nextInt();

        if(quantidadeDeMacas < 12){
            float valor = 1.30f;
            System.out.println("O produto custou: " + valor + " R$");
            System.out.println("O custo total da compra foi: " + quantidadeDeMacas * valor + " R$");
        }else{
            float valor =1.0f;
            System.out.println("O produto custou: " + valor + " R$");
            System.out.println("O custo total da compra foi: " + quantidadeDeMacas * valor + " R$");
        }
    }
}