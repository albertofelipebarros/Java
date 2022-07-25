package br.com.futurodev.semana3;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        final int NUMERO_MAXIMO = 100; // N�mero m�ximo para ser sorteado

        int numeroAleatorio = new Random().nextInt(NUMERO_MAXIMO + 1); // Cria um numero ale�torio de 0 � "NUMERO_MAXIMO"

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um n�mero m�ltiplo de " + numeroAleatorio + ":");
            int numero = 0;
            do{
                numero = entrada.nextInt();
            } while (numero % numeroAleatorio != 0); // Repete o la�o enquanto o resto da divis�o de "numero" pelo "numeroAleatorio" N�O for ZERO (enquanto n�o for m�ltiplos)

            System.out.println("\nParab�ns! Os n�meros s�o m�ltiplos");
    }
}
