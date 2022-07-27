package br.com.futurodev.semana4;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] vetor = new int[50];
        int i = 0;
        while (i < vetor.length) {
            vetor[i] = i;
            i++;
        }
        for (int numero : vetor) {
            // numero existe apenas dentro do for
            System.out.println(numero);

        }
    }
}