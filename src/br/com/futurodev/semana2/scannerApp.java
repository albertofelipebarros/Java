package br.com.futurodev.semana2;

import java.util.Scanner;

public class scannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva seu nome: " );
        String nome = scanner.nextLine();
        System.out.print("Digite um valor: " );
        double valor = scanner.nextDouble();
        System.out.println("Seu nome é " + nome + " e sua altura é " + valor);
    }
}
