package br.com.futurodev.semana1;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class QuartoExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 1 numero de 0 a 255 para transformá-lo em algum caracter: " );
        int numero = scanner.nextInt();
        char transforma = (char) numero;
        System.out.println("A letra convertida é " + transforma);
    }
}

