package br.com.futurodev.modulo1.semana2;
import java.util.Scanner;
public class Exercicio4 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor de X: ");
            int x = scanner.nextInt();
            System.out.print("Digite o valor de Y: ");
            int y = scanner.nextInt();
            System.out.println("Invertendo os valores... ");
            int aux = y;
            y = x;
            x = aux;
            System.out.println("Agora X vale = " + x);
            System.out.println("Agora Y vale = " + y);
        }
}
