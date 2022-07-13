package br.com.futurodev.semana2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float nota2 = scanner.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota1 = scanner.nextFloat();
        float media = (nota1+nota2)/2;
        if (media>=6){
            System.out.println("Sua Média é " + media + " e você está APROVADO");
        }
        else
            System.out.println("Sua Média é " + media + " e você está REPROVADO");
        }
}