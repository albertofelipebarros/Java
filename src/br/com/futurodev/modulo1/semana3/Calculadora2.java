package br.com.futurodev.modulo1.semana3;
import java.util.*;

public class Calculadora2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acao = 1;
        ArrayList<String> historico = new ArrayList<String>();
        while (acao > 0) {
            if (acao == 1) {
                System.out.print("Digite o primeiro número: ");
                int numero1 = scanner.nextInt();
                System.out.print("Digite a operação: ");
                char operacao = scanner.next().charAt(0);
                System.out.print("Digite o segundo número: ");
                int numero2 = scanner.nextInt();
                int result = 0;
        /*if (operacao=='+'){
            result = numero1+numero2;
            System.out.println(String.format("Operação: " + "%d %c %d = %d", numero1, operacao, numero2, result));
        } else if (operacao=='-'){
            result = numero1-numero2;
            System.out.println(String.format("Operação: " + "%d %c %d = %d", numero1, operacao, numero2, result));
        } else if (operacao=='/') {
            result = numero1/numero2;
            System.out.println(String.format("Operação: " + "%d %c %d = %d", numero1, operacao, numero2, result));
        } else if (operacao=='*'){
            result = numero1 * numero2;
            System.out.println(String.format("Operação: " + "%d %c %d = %d", numero1, operacao, numero2, result));
        } else {
            System.out.println("Operação inválida");
        }*/
                switch (operacao) {
                    default:
                        System.out.println("Operação Invalida");
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
                String entradahistorico = String.format("Operação: " + "%d %c %d = %d", numero1, operacao, numero2, result);
                historico.add(entradahistorico);
                System.out.println(entradahistorico);
            } else if (acao == 2) {
                System.out.println("################ Historico ###############");
                String entradahistorico = (String.format("você já fez: %d operações", historico.size()));
                historico.forEach(itemhitorico -> System.out.println(itemhitorico));
                }
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Realizar operação matemática");
            System.out.println("2 - Visualizar histórico");
            System.out.println("0 - Sair");
            System.out.println("Informe a opção");
            acao = scanner.nextInt();
        }
        System.out.println("saindo...");
    }

}

