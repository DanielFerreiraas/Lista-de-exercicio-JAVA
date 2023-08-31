package lista1_condicionais;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args){

        int numeroDaConta;
        float saldoAtual, saldo, debito, credito;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número da sua conta: ");
        numeroDaConta = input.nextInt();

        System.out.print("Digite o valor do seu saldo da conta: ");
        saldo = input.nextFloat();

        System.out.print("Digite o valor do seu débito da conta: ");
        debito = input.nextFloat();

        System.out.print("Digite o valor do seu crédito da conta: ");
        credito = input.nextFloat();

        saldoAtual = saldo - debito + credito;

        if(saldoAtual > 0){
            System.out.println("Saldo positivo de: " + saldoAtual + " R$");
        }else{
            System.out.println("Saldo negativo de: " + saldoAtual + " R$");
        }
    }
}