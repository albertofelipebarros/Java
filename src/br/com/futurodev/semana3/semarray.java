package br.com.futurodev.semana3;
import java.util.List;
import java.util.Scanner;
public class semarray {
    public static void main(String[] args) {

        double largura, comprimento, altura;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a largura: ");
        largura = entrada.nextDouble();

        System.out.print("Digite o comprimento: ");
        comprimento = entrada.nextDouble();

        System.out.print("Digite a altura: ");
        altura = entrada.nextDouble();

        System.out.println(
                "\nLxCxA: " +
                        largura + " x " +
                        comprimento + " x " +
                        altura
        );

        double volume = largura * comprimento * altura;
        System.out.println("\nVolume calculado é de: " + volume);
    }
}
