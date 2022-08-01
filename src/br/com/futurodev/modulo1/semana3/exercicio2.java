package br.com.futurodev.modulo1.semana3;

import java.util.List;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        double[] notas = new double[3];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira suas notas: ");
            notas[i] = entrada.nextDouble();
        }
        double MEDIA = (notas[0] + notas[1] + notas[2])/ notas.length;
        System.out.println("A média é: " + Math.round(MEDIA));
    }
}
