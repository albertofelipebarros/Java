package br.com.futurodev.modulo2.semana1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operacao;
        double numero1;
        double numero2;
        while (true) {
            System.out.print("Digite a operação matematica (+ - / *) ou digite sair: ");
            operacao = scanner.next();
            if (operacao.equalsIgnoreCase("sair")){
                System.out.println("Saindo...");
                return;
            }
            System.out.print("Digite o primeiro valor: ");
            numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo valor: ");
            numero2 = scanner.nextDouble();

            switch (operacao) {
                case "+":
                    System.out.println("Soma: " + adicao(numero1, numero2));
                    break;
                case "-":
                    System.out.println("Subtração: " + subtracao(numero1, numero2));
                    break;
                case "*":
                    System.out.println("Multiplicação: " + multiplicacao(numero1, numero2));
                    break;
                case "/":
                    System.out.println("Divisão: " + divisao(numero1, numero2));
                    break;
                default:
                    System.out.println("Operação desconhecida");
                    break;
            }
        }
    }

    private static double adicao(double valor1, double valor2) {
        return valor1 + valor2;
    }

    private static double subtracao(double valor1, double valor2) {
        return valor1 - valor2;
    }

    private static double multiplicacao(double valor1, double valor2) {
        return valor1 * valor2;
    }

    private static double divisao(double valor1, double valor2) {
        return valor1 / valor2;
    }
}
