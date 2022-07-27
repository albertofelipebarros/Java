package br.com.futurodev.semana4;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class Exercicioaula1 {
    public static void main(String[] args) {
        int[] lista = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 numero: ");

        for (int i = 0; i < lista.length; i++) {
            lista[0] = scanner.nextInt();
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.println(i);
        }
    }
}




