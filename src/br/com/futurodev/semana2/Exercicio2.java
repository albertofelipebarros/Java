package br.com.futurodev.semana2;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro n�mero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo n�mero: ");
        int numero2 = scanner.nextInt();
        System.out.print("(1)Soma \n(2)Subtra��o \n(3)Multiplica��o \n(4)Divis�o \nDigite o numero da opera��o que deseja realizar: ");
        int operacao = scanner.nextInt();
        if (operacao == 1) {
            int resultado = numero1 + numero2;
            if (resultado % 2 == 0) {
                         if (resultado < 0) {
                             System.out.println("O resultado � " + resultado + " ele � PAR e � um n�mero Negativo");
                         }
                         else if (resultado > 0) {
                         System.out.println("O resultado � " + resultado + " ele � PAR e � um n�mero Positivo");
                         }
                      }
                else if (resultado < 0) {
                System.out.println("O resultado � " + resultado + " ele � IMPAR e � um n�mero Negativo");
                 }
                else if (resultado > 0) {
                System.out.println("O resultado � " + resultado + " ele � IMPAR e � um n�mero Positivo");
            }
        } else if (operacao == 2) {
            int resultado = numero1 - numero2;
            if (resultado % 2 == 0){
                if (resultado < 0) {
                    System.out.println("O resultado � " + resultado + " ele � PAR e � um n�mero Negativo");
                }
                else if (resultado > 0) {
                    System.out.println("O resultado � " + resultado + " ele � PAR e � um n�mero Positivo");
                }
            }
            else if (resultado < 0) {
                System.out.println("O resultado � " + resultado + " ele � IMPAR e � um n�mero Negativo");
            }
            else if (resultado > 0) {
                System.out.println("O resultado � " + resultado + " ele � IMPAR e � um n�mero Positivo");
            }
        }
        else if (operacao == 3) {
            int resultado = numero1 * numero2;
            if (resultado % 2 == 0){
                if (resultado < 0) {
                    System.out.println("O resultado � " + resultado + " ele � PAR e � um n�mero Negativo");
                }
                else if (resultado > 0) {
                    System.out.println("O resultado � " + resultado + " ele � PAR e � um n�mero Positivo");
                }
            }
            else if (resultado < 0) {
                System.out.println("O resultado � " + resultado + " ele � IMPAR e � um n�mero Negativo");
            }
            else if (resultado > 0) {
                System.out.println("O resultado � " + resultado + " ele � IMPAR e � um n�mero Positivo");
            }
        }
        else if (operacao == 4) {
            int resultado = numero1 / numero2;
            if (resultado % 2 == 0){
                if (resultado < 0) {
                    System.out.println("O resultado � " + resultado + " ele � PAR e � um n�mero Negativo");
                }
                else if (resultado > 0) {
                    System.out.println("O resultado � " + resultado + " ele � PAR e � um n�mero Positivo");
                }
            }
            else if (resultado < 0) {
                System.out.println("O resultado � " + resultado + " ele � IMPAR e � um n�mero Negativo");
            }
            else if (resultado > 0) {
                System.out.println("O resultado � " + resultado + " ele � IMPAR e � um n�mero Positivo");
            }
        }
        else
            System.out.println("A opera��o digitada � inv�lida");
    }
}