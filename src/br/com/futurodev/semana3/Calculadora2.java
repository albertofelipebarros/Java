package br.com.futurodev.semana3;
import java.util.*;
public class Calculadora2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro n�mero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite a opera��o: ");
        char operacao = scanner.next().charAt(0);
        System.out.print("Digite o segundo n�mero: ");
        int numero2 = scanner.nextInt();
        int result = 0;
        if (operacao=='+'){
            result = numero1+numero2;
            System.out.println(String.format("Opera��o: " + "%d %c %d = %d", numero1, operacao, numero2, result));
        } else if (operacao=='-'){
            result = numero1-numero2;
            System.out.println(String.format("Opera��o: " + "%d %c %d = %d", numero1, operacao, numero2, result));
        } else if (operacao=='/') {
            result = numero1/numero2;
            System.out.println(String.format("Opera��o: " + "%d %c %d = %d", numero1, operacao, numero2, result));
        } else if (operacao=='*'){
            result = numero1 * numero2;
            System.out.println(String.format("Opera��o: " + "%d %c %d = %d", numero1, operacao, numero2, result));
        } else {
            System.out.println("Opera��o inv�lida");
        }
    }
}
