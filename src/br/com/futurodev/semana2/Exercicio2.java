package br.com.futurodev.semana2;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero1: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o numero2: ");
        int numero2 = scanner.nextInt();
        System.out.print("Digite a opera��o (1-soma; 2-subtracao; 3-multiplicacao; 4-divisao): ");
        int operacao = scanner.nextInt();
        int resultado = 0;
         switch (operacao){
            case 1: resultado = numero1+numero2;
            break;
            case 2: resultado = numero1-numero2;
                break;
            case 3: resultado = numero1*numero2;
                break;
            case 4: resultado = numero1/numero2;
                break;
            default:
                System.out.println("Opera��o n�o permitida");
                return;
        }
        boolean positivo = resultado>=0;
        boolean par = resultado % 2 == 0;
        if(positivo && par)
            System.out.println("O n�mero "+resultado+" � par e positivo");
        else if(par)
            System.out.println("O n�mero "+resultado+" � par e negativo");
        else if (positivo)
            System.out.println("O n�mero "+resultado+" � impar e positivo");
        else
            System.out.println("O n�mero "+resultado+" � impar e negativo");
    }
}

