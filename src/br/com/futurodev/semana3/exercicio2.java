package br.com.futurodev.semana3;

import java.util.List;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        double[] notas = new double[3];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Infome 3 notas: ");
        notas[0] = entrada.nextDouble();
        notas[1] = entrada.nextDouble();
        notas[2] = entrada.nextDouble();

        double MEDIA = (notas[0] + notas[1] + notas[2])/3;
        System.out.println("A média é: " + Math.round(MEDIA));
    }
}
