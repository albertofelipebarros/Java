package br.com.futurodev.semana2;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do sal�rio m�nimo: " );
        Float minimo = scanner.nextFloat();
        System.out.print("Informe seu sal�rio: " );
        float valor = scanner.nextFloat();
        Float salarios = valor/minimo;
        System.out.println("Voc� ganha o equivalente a " + (salarios) + " sal�rios m�nimos" );
    }
}
