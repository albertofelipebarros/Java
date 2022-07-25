package br.com.futurodev.semana3;


import java.util.List;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Infome 10 números: ");
        numeros[0] = entrada.nextInt();
        numeros[1] = entrada.nextInt();
        numeros[2] = entrada.nextInt();
        numeros[3] = entrada.nextInt();
        numeros[4] = entrada.nextInt();
        numeros[5] = entrada.nextInt();
        numeros[6] = entrada.nextInt();
        numeros[7] = entrada.nextInt();
        numeros[8] = entrada.nextInt();
        numeros[9] = entrada.nextInt();

        System.out.println("Os números digitados na sequência foram: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2] + ", " + numeros[3] + ", " + numeros[4] + ", " + numeros[5] + ", " + numeros[6] + ", " + numeros[7] + ", " + numeros[8] + ", " + numeros[9]);

    }
}
