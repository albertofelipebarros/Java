package br.com.futurodev.modulo1.semana2;

import java.util.*;

public class parimpar {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if (N % 2 == 0 && N<10 || N>20) {
            System.out.print("Não é estranho");
        } else if (N % 2 != 0) {
            System.out.print("Estranho");
        } else if (N % 2 == 0 && N>10 && N<20) {
            System.out.print("Estranho");
        }
    }
}
