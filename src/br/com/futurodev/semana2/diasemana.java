package br.com.futurodev.semana2;

import java.util.Scanner;

public class diasemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da semana ");
        String dia = scanner.nextLine();
        switch (dia) {

            case "Segunda":
                System.out.println("Faltam 5 dias");
                break;
            case "Terça":
                System.out.println("Faltam 4 dias");
                break;
            case "Quarta":
                System.out.println("Faltam 3 dias");
                break;
            case "Quinta":
                System.out.println("Faltam 2 dias");
                break;
            case "Sexta":
                System.out.println("Falta 1 dia");
                break;
            case "Sabado":
                System.out.println("Faltam 0 dias");
                break;
            case "Domingo":
                System.out.println("Faltam 0 dias");
                break;
            default :
                System.out.println("Dia não encontrado");
                break;
        }
    }
}
