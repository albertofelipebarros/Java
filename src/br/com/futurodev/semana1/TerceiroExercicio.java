package br.com.futurodev.semana1;

import java.util.Scanner;

public class TerceiroExercicio {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe seu passatempo favorito: " );
            String nome = scanner.nextLine();
            System.out.print("Informe a frequ�ncia com que realiza: " );
            String freq = scanner.nextLine();
            System.out.println("Voc� informou que seu passatempo favorito � " + nome + " e a frequ�ncia com que realiza � " + freq);
        }
    }
