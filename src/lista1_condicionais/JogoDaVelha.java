package lista1_condicionais;

import java.util.Scanner;
public class JogoDaVelha {

    public static void main(String[] args){
        Campo[][] velha = new Campo[3][3];
        char simboloAtual = 'X';
        Boolean isRunning = true;
        String vitoria = "";
        Scanner input = new Scanner(System.in);

        iniciarJogo(velha);

        while(isRunning){
            escreveLinhas(velha);
            try{
                if(verificaJogada(velha, jogar(input, simboloAtual), simboloAtual)){
                    if(simboloAtual == 'X'){
                        simboloAtual = 'O';
                    }else{
                        simboloAtual = 'X';
                    }
                }
            }catch(Exception error){
                System.out.println("Error");
            }
        }
        System.out.println("Fim de jogo");
    }
    public static void escreveLinhas(Campo[][] velha){
        System.out.println("   0   1    2");
        System.out.printf("0  %c | %c | %c  %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
        System.out.println("   ------------");
        System.out.printf("1  %c | %c | %c  %n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
        System.out.println("   ------------");
        System.out.printf("2  %c | %c | %c  %n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
    }
    public static void limparTela(){
        for(int i = 0 ; i < 200 ; i++ ){
            System.out.println(" ");
        }
    }

    public static Boolean verificaJogada(Campo[][] velha, int p[], char simboloAtual){

        if(velha[p[0]][p[1]].getSimbolo() == ' '){
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }else{
            return false;
        }
    }

    public static int[] jogar(Scanner input, char simboloAtual){

        int []p = new int[2];
        System.out.printf("%s %c%n, quem joga: ", simboloAtual);
        System.out.print("Informa a linha: ");
        p[0] = input.nextInt();
        System.out.print("Informa a coluna: ");
        p[1] = input.nextInt();
        return p;

    }
    public static void iniciarJogo(Campo[][] velha){
        for(int l = 0; l < 3; l++){
            for(int c = 0; c < 3; c++){
                velha[l][c] = new Campo();
            }
        }
    }

}