package br.com.futurodev.semana2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.print("(1)Soma \n(2)Subtração \n(3)Multiplicação \n(4)Divisão \nDigite o numero da operação que deseja realizar: ");
        int operacao = scanner.nextInt();
        if (operacao == 1) {
            int adicao = numero1 + numero2;
            System.out.println("A soma é " + adicao);
        } else if (operacao == 2) {
            int subtracao = numero1 - numero2;
            System.out.println("O resultado da subtração é " + subtracao);

        }
        else if (operacao == 3) {
            int mult = numero1 * numero2;
            System.out.println("O resultado da Multiplicação é " + mult);
        }
        else if (operacao == 4) {
            int div = numero1 / numero2;
            System.out.println("O resultado da Divisão é " + div);
        }
        else
            System.out.println("A operação digitada é inválida");
    }
}