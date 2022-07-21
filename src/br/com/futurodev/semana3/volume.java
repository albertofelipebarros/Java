package br.com.futurodev.semana3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class volume {
    public static void main(String[] args) {

        List<Double> dimensoes = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores: ");
        int quantidade = entrada.nextInt();
        System.out.println("");

        double result = 0;
        int i = 0;
        while (i < quantidade) {
            // Peço a operação a partir do segundo loop
            String operacao = "";
            if (i > 0) {
                System.out.print("Informe a operação desejada: ");
                operacao = entrada.next();

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
                    default:
                        result = entrada.nextDouble();
                        break;
                }

                i++;
            }
        }
            System.out.println("\nO resultado é de: " + result);
    }
}