package br.com.futurodev.semana3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int quantidade;
        System.out.println("Quantas notas você precisa? ");
        quantidade = entrada.nextInt();

        System.out.println("Informe as Notas: ");
        int i = 0;
        while (i < quantidade) {
            notas.add(entrada.nextDouble());
            i++;
        }
        double media = 0;
        for (double nota : notas) {
            media = media+nota;
        }
        media = media/quantidade;
        System.out.print("Sua média é: " + media);

    }
}