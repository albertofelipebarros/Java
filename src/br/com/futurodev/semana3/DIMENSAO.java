package br.com.futurodev.semana3;

import java.util.Scanner;

public class DIMENSAO {
    public static void main(String[] args) {
        int[] dimensoes = new int[3];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe na sequencia a Largura, Comprimento e Altura");
        dimensoes[0] = entrada.nextInt();
        dimensoes[1] = entrada.nextInt();
        dimensoes[2] = entrada.nextInt();
        int volume = dimensoes[0] * dimensoes[1] * dimensoes[2];
        System.out.println(volume);

    }
}
