package lista2_repeticoes;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){

        float primeiraUnidade, segundaUnidade, media;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota da primeira unidade: ");
        primeiraUnidade = input.nextFloat();

            for( int i = 0 ; primeiraUnidade < 0 || primeiraUnidade > 10 ; i++ ){
                System.out.print("Digite a nota da primeira unidade novamente: ");
                primeiraUnidade = input.nextFloat();
            }

        System.out.print("Digite a nota da segunda unidade: ");
        segundaUnidade = input.nextFloat();

            for ( int i = 0 ; segundaUnidade < 0 || segundaUnidade > 10 ; i++ ) {
                System.out.print("Digite a nota da segunda unidade novamente: ");
                segundaUnidade = input.nextFloat();
            }

        media = (primeiraUnidade + segundaUnidade)/2;

        System.out.println("A sua média foi de : " + media);

        input.close();
    }
}
