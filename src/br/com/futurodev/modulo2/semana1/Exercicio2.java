package br.com.futurodev.modulo2.semana1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> filmesSeries = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
//        System.out.println("Informe quais sao os seus filmes/series preferidos (para sair digite \"fechar\"):");

        do {
            // Menu de opções
            System.out.println("Informe uma opção:");
            System.out.println("0 - Sair");
            System.out.println("1 - Listar");
            System.out.println("2 - Adicionar");

            System.out.print("Informe a opção desejada: ");
            String opcao = entrada.nextLine();
            if (opcao.equals("0")) {
                break;
            }
            switch (opcao) {
                case "1":
                    System.out.println("############################");
                    System.out.println(" ");
                    listarItens(filmesSeries);
                    System.out.println(" ");
                    System.out.println("############################");
                    break;
                case "2":

                    System.out.print ("Informe a série: ");
                    adcionarItem(filmesSeries);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (true);

    }

    public static void adcionarItem(List<String> itens) {
        String item = new Scanner(System.in).nextLine();
        itens.add(item);
        System.out.println("Item adcionado com sucesso!!");
    }

    public static void listarItens(List<String> listaItens) {
        System.out.println("Filmes/Séries adicionados: ");
        System.out.println(" ");
        for (int i = 0; i < listaItens.size(); i++) {
            System.out.println((i + 1) + " - " + listaItens.get(i));
        }
    }

}