package br.com.futurodev.modulo1.semana3;
import java.util.List;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores: ");
        int quantidade = entrada.nextInt();
        System.out.println("");

        double result = 0;
        int i = 0;
        while (i < quantidade) {
            // Pe�o a opera��o a partir do segundo loop
            String operacao = "l";
            if (i > 0) {
                System.out.println("#############");
                System.out.println("# Opera��es #");
                System.out.println("#############");
                System.out.println("Somar      : \"+\"");
                System.out.println("Subtrair   : \"-\"");
                System.out.println("Multiplicar: \"*\"");
                System.out.println("Dividir    : \"/\"");
                System.out.println("Corrigir   : \"c\"");
                System.out.println("Limpar     : \"l\"");
                System.out.print("Informe a opera��o desejada: ");
                operacao = entrada.next();
            }

            // Informa o valor para executar a opera��o
            System.out.print("Informe um valor: ");
            switch (operacao) {
                case "+":
                    result += entrada.nextDouble();
                    break;
                case "-":
                    result -= entrada.nextDouble();
                    break;
                case "*":
                    result *= entrada.nextDouble();
                    break;
                case "/":
                    result /= entrada.nextDouble();
                    break;
                case "l":
                    result = entrada.nextDouble();
                    i = 0;
                    break;
                default:
                    System.out.println("Comando inv�lido");
                    i--;
                    break;
            }

            i++;
        }

        System.out.println("\nO resultado � de: " + result);
    }

}
