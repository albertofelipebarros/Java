package br.com.futurodev.semana2;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.print("(1)Soma \n(2)Subtração \n(3)Multiplicação \n(4)Divisão \nDigite o numero da operação que deseja realizar: ");
        int operacao = scanner.nextInt();
        if (operacao == 1) {
            int resultado = numero1 + numero2;
            if (resultado % 2 == 0) {
                         if (resultado < 0) {
                             System.out.println("O resultado é " + resultado + " ele é PAR e é um número Negativo");
                         }
                         else if (resultado > 0) {
                         System.out.println("O resultado é " + resultado + " ele é PAR e é um número Positivo");
                         }
                      }
                else if (resultado < 0) {
                System.out.println("O resultado é " + resultado + " ele é IMPAR e é um número Negativo");
                 }
                else if (resultado > 0) {
                System.out.println("O resultado é " + resultado + " ele é IMPAR e é um número Positivo");
            }
        } else if (operacao == 2) {
            int resultado = numero1 - numero2;
            if (resultado % 2 == 0){
                if (resultado < 0) {
                    System.out.println("O resultado é " + resultado + " ele é PAR e é um número Negativo");
                }
                else if (resultado > 0) {
                    System.out.println("O resultado é " + resultado + " ele é PAR e é um número Positivo");
                }
            }
            else if (resultado < 0) {
                System.out.println("O resultado é " + resultado + " ele é IMPAR e é um número Negativo");
            }
            else if (resultado > 0) {
                System.out.println("O resultado é " + resultado + " ele é IMPAR e é um número Positivo");
            }
        }
        else if (operacao == 3) {
            int resultado = numero1 * numero2;
            if (resultado % 2 == 0){
                if (resultado < 0) {
                    System.out.println("O resultado é " + resultado + " ele é PAR e é um número Negativo");
                }
                else if (resultado > 0) {
                    System.out.println("O resultado é " + resultado + " ele é PAR e é um número Positivo");
                }
            }
            else if (resultado < 0) {
                System.out.println("O resultado é " + resultado + " ele é IMPAR e é um número Negativo");
            }
            else if (resultado > 0) {
                System.out.println("O resultado é " + resultado + " ele é IMPAR e é um número Positivo");
            }
        }
        else if (operacao == 4) {
            int resultado = numero1 / numero2;
            if (resultado % 2 == 0){
                if (resultado < 0) {
                    System.out.println("O resultado é " + resultado + " ele é PAR e é um número Negativo");
                }
                else if (resultado > 0) {
                    System.out.println("O resultado é " + resultado + " ele é PAR e é um número Positivo");
                }
            }
            else if (resultado < 0) {
                System.out.println("O resultado é " + resultado + " ele é IMPAR e é um número Negativo");
            }
            else if (resultado > 0) {
                System.out.println("O resultado é " + resultado + " ele é IMPAR e é um número Positivo");
            }
        }
        else
            System.out.println("A operação digitada é inválida");
    }
}