package br.com.futurodev.modulo1.semana3;
import java.util.*;

public class Calculadora2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acao = 1;
        ArrayList<String> historico = new ArrayList<String>();
        while (acao > 0) {
            if (acao == 1) {
                System.out.print("Digite o primeiro n�mero: ");
                int numero1 = scanner.nextInt();
                System.out.print("Digite a opera��o: ");
                char operacao = scanner.next().charAt(0);
                System.out.print("Digite o segundo n�mero: ");
                int numero2 = scanner.nextInt();
                int result = 0;
        /*if (operacao=='+'){
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
        }*/
                switch (operacao) {
                    default:
                        System.out.println("Opera��o Invalida");
                        break;
                    case '+':
                        result = numero1 + numero2;
                        break;
                    case '-':
                        result = numero1 - numero2;
                        break;
                    case '/':
                        result = numero1 / numero2;
                        break;
                    case '*':
                        result = numero1 * numero2;
                        break;
                }
                String entradahistorico = String.format("Opera��o: " + "%d %c %d = %d", numero1, operacao, numero2, result);
                historico.add(entradahistorico);
                System.out.println(entradahistorico);
            } else if (acao == 2) {
                System.out.println("################ Historico ###############");
                String entradahistorico = (String.format("voc� j� fez: %d opera��es", historico.size()));
                historico.forEach(itemhitorico -> System.out.println(itemhitorico));
                }
            System.out.println("O que voc� deseja fazer?");
            System.out.println("1 - Realizar opera��o matem�tica");
            System.out.println("2 - Visualizar hist�rico");
            System.out.println("0 - Sair");
            System.out.println("Informe a op��o");
            acao = scanner.nextInt();
        }
        System.out.println("saindo...");
    }

}

