package br.com.futurodev.semana2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class switchapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 numero");
        int numero = scanner.nextInt();
        switch (numero) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
                break;
            case 3:
            default:
                System.out.println("defaut");
        }
        System.out.println("Apos o Switch");
        System.out.println();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite 1 nome");
        String nome = scanner2.nextLine();
        switch (nome) {
            case "default" :
                System.out.println("negado");
                break;
            case "andre":
            case "alberto":
            case "luana":
                System.out.println("Aceito");
                break;
        }
    }
}