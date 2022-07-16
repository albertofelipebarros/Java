package br.com.futurodev.semana2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor do Triângulo: ");
        int x = scanner.nextInt();
        System.out.print("Digite o segundo valor do Triângulo: ");
        int y = scanner.nextInt();
        System.out.print("Digite o terceiro valor do Triângulo: ");
        int z = scanner.nextInt();
        if (x + y > z && x + z > y && y + z > x){
            if (x == y && x == z)
            System.out.println("Três lados iguais: Triângulo Equilátero");
            else if(x == y || x == z)
                System.out.println("Dois lados iguais: Triângulo Isósceles");
            else
                System.out.println("Três lados diferentes: Triângulo Escaleno");
            }
            else
                System.out.println("Não é um Triângulo");
    }
}
