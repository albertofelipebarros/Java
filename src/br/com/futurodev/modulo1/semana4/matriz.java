package br.com.futurodev.modulo1.semana4;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.println(" ");
        System.out.println("############################### ");
        System.out.println("Listando matriz atual: ");
        System.out.println("############################### ");
        System.out.println(" ");
        System.out.println( matriz[0][0] + " | " + matriz[0][1] + " | " + matriz[0][2]);
        System.out.println( matriz[1][0] + " | " + matriz[1][1] + " | " + matriz[1][2]);
        System.out.println( matriz[2][0] + " | " + matriz[2][1] + " | " + matriz[2][2]);
        System.out.println(" ");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                matriz[linha][coluna] = linha + coluna;
                System.out.print("Preencha o valor da posição:  " + matriz[linha][coluna] +" (l+c=" + matriz[linha][coluna] +")" + ": ");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }
        System.out.println(" ");
        System.out.println("############################### ");
        System.out.println("Listando os valores da matriz: ");
        System.out.println("############################### ");
        System.out.println(" ");
        System.out.println( matriz[0][0] + " | " + matriz[0][1] + " | " + matriz[0][2]);
        System.out.println( matriz[1][0] + " | " + matriz[1][1] + " | " + matriz[1][2]);
        System.out.println( matriz[2][0] + " | " + matriz[2][1] + " | " + matriz[2][2]);
    }
}
