package br.com.futurodev.modulo2.semana1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
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
            System.out.println("3 - Remover");

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
                    System.out.print("Informe a série: ");
                    adcionarItem(filmesSeries);
                    break;

                case "3":
                    removerItemLista(filmesSeries, entrada);
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

    public static int listarPedirIndice(List<String> listaItens, Scanner entrada) {
        listarItens(listaItens);
        System.out.print("Escolha um item: ");
        String opcaoEscolhida = entrada.nextLine();
        try {
            return Integer.parseInt(opcaoEscolhida) - 1;
        } catch (Exception e) {
            return -1;
//            System.out.println("Opção inválida!");
//            return listarPedirIndice(listaItens, entrada);
        }
    }

    public static void removerItemLista(List<String> listaItens, Scanner entrada) {
        int indice = listarPedirIndice(listaItens, entrada);
        if (indice < 0) {
            System.out.println("Opção inválida! Operação cancelada!");
        } else {
            removerItem(indice, listaItens);
        }
    }

    public static void removerItem(int indice, List<String> listaItens) {
        listaItens.remove(indice);
        System.out.println("Item removido!");
    }

}
