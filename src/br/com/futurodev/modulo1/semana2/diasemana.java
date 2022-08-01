package br.com.futurodev.modulo1.semana2;

import java.util.Scanner;

public class diasemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da semana ");
        String dia = scanner.nextLine();
        switch (dia) {

            case "Segunda":
                System.out.println("Faltam 5 dias para o fim de semana");
                break;
            case "Terça":
                System.out.println("Faltam 4 dias para o fim de semana");
                break;
            case "Quarta":
                System.out.println("Faltam 3 dias para o fim de semana");
                break;
            case "Quinta":
                System.out.println("Faltam 2 dias para o fim de semana");
                break;
            case "Sexta":
                System.out.println("Falta 1 dia para o fim de semana");
                break;
            case "Sabado":
                System.out.println("Voce esta no fim de semana");
                break;
            case "Domingo":
                System.out.println("Voce esta no fim de semana");
                break;
            default :
                System.out.println("Dia não encontrado");
                break;
        }
    }
}
