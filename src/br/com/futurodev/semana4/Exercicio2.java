package br.com.futurodev.semana4;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        String[] convidados = new String[5];
        convidados[0] = "Alberto";
        convidados[1] = "Felipe";
        convidados[2] = "Marcela";
        convidados[3] = "Milena";
        convidados[4] = "Maria";
        int quantidade;
        int quantidadeexibidos;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de convidados: ");
        quantidadeexibidos = scanner.nextInt();
        for (int i = 0; i < quantidadeexibidos; i++) {
            System.out.println(convidados[i]);
            
        }

    }

}
