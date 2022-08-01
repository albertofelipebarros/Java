package br.com.futurodev.modulo1.semana4;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] notas = new Double[3];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Insira uma nota: ");
            notas[i] = scanner.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma =  soma + notas[i];
        }

        Double media = soma/notas.length;
        System.out.println("A média das notas é: " + media);

    }

}
