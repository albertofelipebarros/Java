package br.com.futurodev.semana2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();
            if(numero1==numero2){
                System.out.println("Numeros iguais");
            }
            else if(numero1>numero2){
                System.out.println("Maior: " + numero1);
                System.out.print("Menor: " + numero2);
            }
            else {
                System.out.println("Maior: " + numero2);
                System.out.println("Menor: " + numero1);
            }
        }
    }
