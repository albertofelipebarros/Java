package br.com.futurodev.modulo1.semana2;

import java.util.Scanner;

public class scannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva seu nome: " );
        String nome = scanner.nextLine();
        double valor = scanner.nextDouble();
        System.out.println(" Olá mundo! Sou" + nome);
    }
}
