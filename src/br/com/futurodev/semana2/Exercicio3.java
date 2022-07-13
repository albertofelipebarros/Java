package br.com.futurodev.semana2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();
            if(numero1>numero2){
                System.out.println(numero1 + " é maior que " + numero2);
            }
            else
            if (numero1==numero2) {
                System.out.println(numero1 + " é igual a " + numero2);
            }
                else
                System.out.println(numero1 + " é menor que " + numero2);

        }
    }
