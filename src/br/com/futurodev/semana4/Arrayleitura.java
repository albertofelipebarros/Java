package br.com.futurodev.semana4;

import java.util.Scanner;

public class Arrayleitura {
    public static void main(String[] args) {
        int[] listaNumeros = new int[2];

        Scanner scaner = new Scanner(System.in);

        System.out.print("Escreva um valor: ");
        listaNumeros[0] = scaner.nextInt();

        System.out.print("Escreva outro valor: ");
        listaNumeros[1] = scaner.nextInt();

        for (int numero : listaNumeros) {
            // numero existe apenas dentro do for
            System.out.println(numero);

        }
    }
}
