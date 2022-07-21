package br.com.futurodev.semana3;

import java.util.Random;

public class dowhiles {
    public static void main(String[] args) {
        int numeroAleatorio;
        final int LIMITE = 6;
        int i = 0;
        do {
            numeroAleatorio = new Random().nextInt(61);
            System.out.print(" " + numeroAleatorio);
            i++;
        } while (i<LIMITE);
    }
}
