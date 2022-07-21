package br.com.futurodev.semana3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        List<Double> dimensoes = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        dimensoes.add(entrada.nextDouble());
        dimensoes.add(entrada.nextDouble());
        dimensoes.add(entrada.nextDouble());
        double volume = dimensoes.get(0) * dimensoes.get(1) * dimensoes.get(2);
        System.out.println("\nO volume é de: " + volume + "cm³");
    }
}
