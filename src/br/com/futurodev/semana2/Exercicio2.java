package br.com.futurodev.semana2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro n�mero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo n�mero: ");
        int numero2 = scanner.nextInt();
        System.out.print("(1)Soma \n(2)Subtra��o \n(3)Multiplica��o \n(4)Divis�o \nDigite o numero da opera��o que deseja realizar: ");
        int operacao = scanner.nextInt();
        if (operacao == 1) {
            int adicao = numero1 + numero2;
            System.out.println("A soma � " + adicao);
        } else if (operacao == 2) {
            int subtracao = numero1 - numero2;
            System.out.println("O resultado da subtra��o � " + subtracao);

        }
        else if (operacao == 3) {
            int mult = numero1 * numero2;
            System.out.println("O resultado da Multiplica��o � " + mult);
        }
        else if (operacao == 4) {
            int div = numero1 / numero2;
            System.out.println("O resultado da Divis�o � " + div);
        }
        else
            System.out.println("A opera��o digitada � inv�lida");
    }
}