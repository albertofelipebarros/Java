package br.com.futurodev.semana3;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        final int NUMERO_MAXIMO = 100;
        int numeroAleatorio = new Random().nextInt(NUMERO_MAXIMO + 1);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número múltiplo de " + numeroAleatorio + ":");
            int numero = 0;
            do{
                numero = entrada.nextInt();
            } while (numero % numeroAleatorio != 0);
            System.out.println("\nParabéns! Os números são múltiplos");
    }
}
