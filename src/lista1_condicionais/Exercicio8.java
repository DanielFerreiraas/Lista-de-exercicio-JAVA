package lista1_condicionais;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        int horarioDeInicio, horarioDeFim, duracaoPartida;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o horário que a partida iniciou: ");
        horarioDeInicio = input.nextInt();

        System.out.print("Digite o horário que a partida terminou: ");
        horarioDeFim = input.nextInt();

        duracaoPartida = horarioDeFim - horarioDeInicio;

        if (duracaoPartida > 24){
            System.out.println("uma partida não pode durar mais de 24 horas");
        }else{
            System.out.print("A partida durou " + duracaoPartida + " horas");
        }
    }
}