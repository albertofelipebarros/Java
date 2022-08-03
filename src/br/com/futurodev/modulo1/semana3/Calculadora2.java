package br.com.futurodev.modulo1.semana3;
import java.util.*;

public class Calculadora2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acao = 1;
        Collection<String> historico = new ArrayList<>();
        while (acao > 0) {
            if (acao == 1) {
                System.out.print("Digite o primeiro n�mero: ");
                int numero1 =0;
                 numero1 = scanner.nextInt();
                    scanner.nextLine();
                System.out.print("Digite a opera��o: ");
                char operacao = scanner.next().charAt(0);
                System.out.print("Digite o segundo n�mero: ");
                int numero2 = scanner.nextInt();
                int result = 0;
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
                System.out.println("------------------------------------");
            } else if (acao == 2) {
                System.out.println("################ Hist�rico ###############");
                System.out.println(" ");
                historico.forEach(itemhitorico -> System.out.println(itemhitorico));
                System.out.println(" ");
                System.out.println("##########################################");
             } else if (acao == 3) {
                System.out.println("##########################################");
                System.out.println(" ");
                System.out.println("Limpando hist�rico...");
                System.out.println(" ");
                System.out.println("##########################################");
                historico.clear();
            };
            System.out.println("O que voc� deseja fazer?");
            System.out.println("1 - Realizar opera��o matem�tica");
            System.out.println("2 - Visualizar hist�rico");
            System.out.println("3 - Limpar hist�rico");
            System.out.println("0 - Sair");
            System.out.print("Informe a op��o: ");
            acao = scanner.nextInt();
        }
        System.out.println("saindo...");
    }

}

