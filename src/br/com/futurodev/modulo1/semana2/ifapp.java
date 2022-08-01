package br.com.futurodev.modulo1.semana2;

import java.util.Scanner;

public class ifapp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        if(numero>=10){
        System.out.println("Número Maior ou igual a 10");
        }
        else
            System.out.println("Número Menor que 10");

    }
}
