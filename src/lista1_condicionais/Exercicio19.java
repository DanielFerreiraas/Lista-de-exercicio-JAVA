package lista1_condicionais;

import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args){

        String timeDaCasa, timeVisitante;
        int placarTimeDaCasa, placarVisitante;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do time da casa: ");
        timeDaCasa = input.nextLine();

        System.out.print("Digite o nome do time visitante: ");
        timeVisitante = input.nextLine();

        System.out.print("Quantos gols o " + timeDaCasa + " fez? ");
        placarTimeDaCasa = input.nextInt();

        System.out.print("Quantos gols o " + timeVisitante + " fez? ");
        placarVisitante = input.nextInt();

        if(placarTimeDaCasa > placarVisitante){
            System.out.println("O " + timeDaCasa + " ganhou a partida!");
        }else if(placarVisitante > placarTimeDaCasa){
            System.out.println("O " + timeVisitante + " ganhou a partida!");
        }else{
            System.out.println("EMPATE");
        }

    }
}