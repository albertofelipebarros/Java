package br.com.futurodev.semana2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor do Tri�ngulo: ");
        int x = scanner.nextInt();
        System.out.print("Digite o segundo valor do Tri�ngulo: ");
        int y = scanner.nextInt();
        System.out.print("Digite o terceiro valor do Tri�ngulo: ");
        int z = scanner.nextInt();
        if (x + y > z && x + z > y && y + z > x){
            if (x == y && x == z)
            System.out.println("Tr�s lados iguais: Tri�ngulo Equil�tero");
            else if(x == y || x == z)
                System.out.println("Dois lados iguais: Tri�ngulo Is�sceles");
            else
                System.out.println("Tr�s lados diferentes: Tri�ngulo Escaleno");
            }
            else
                System.out.println("N�o � um Tri�ngulo");
    }
}
