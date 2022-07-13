package br.com.futurodev.semana2;
import java.util.Scanner;
public class Exercicio4 {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor de x: ");
            int x = scanner.nextInt();
            System.out.print("Digite o valor de y: ");
            int y = scanner.nextInt();
                System.out.println("O valor de x é " + x);
                System.out.println("O valor de y é " + y);
            int z = x;
            int f = y;
            System.out.println("Invertendo os valores: ");
            System.out.println("Agora X vale = " + f);
            System.out.println("Agora Y vale = " + z);
        }
}
