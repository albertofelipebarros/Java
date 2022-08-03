package br.com.futurodev.modulo1.semana3;
import java.util.*;

public class Calculadora2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acao = 1;
        Collection<String> historico = new ArrayList<>();
        while (acao > 0) {
            if (acao == 1) {
                System.out.print("Digite o primeiro número: ");
                int numero1 =0;
                 numero1 = scanner.nextInt();
                    scanner.nextLine();
                System.out.print("Digite a operação: ");
                char operacao = scanner.next().charAt(0);
                System.out.print("Digite o segundo número: ");
                int numero2 = scanner.nextInt();
                int result = 0;
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
                System.out.println("------------------------------------");
            } else if (acao == 2) {
                System.out.println("################ Histórico ###############");
                System.out.println(" ");
                historico.forEach(itemhitorico -> System.out.println(itemhitorico));
                System.out.println(" ");
                System.out.println("##########################################");
             } else if (acao == 3) {
                System.out.println("##########################################");
                System.out.println(" ");
                System.out.println("Limpando histórico...");
                System.out.println(" ");
                System.out.println("##########################################");
                historico.clear();
            };
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Realizar operação matemática");
            System.out.println("2 - Visualizar histórico");
            System.out.println("3 - Limpar histórico");
            System.out.println("0 - Sair");
            System.out.print("Informe a opção: ");
            acao = scanner.nextInt();
        }
        System.out.println("saindo...");
    }

}

