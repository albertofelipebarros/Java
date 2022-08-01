package br.com.futurodev.modulo1.semana3;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        double[] array = new double[10];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 10 numeros");
        for (int i = 0; i < array.length; i++) {
            array[i] = entrada.nextDouble();
        }
        for (double numeros : array) {
            System.out.print(" - " + numeros);
        }

    }

}
