package br.com.futurodev.modulo2.semana1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        List<String> filmesSeries = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o filme ou a série");
        String conteudoInformado;

        do {
            conteudoInformado = entrada.nextLine();
            if (conteudoInformado.toUpperCase().equals("FECHAR")) {
                break;
            }
            adcionarItem(conteudoInformado, filmesSeries);

        } while (true);
        listarItens(filmesSeries);
    }
    public static void adcionarItem(String item, List<String> itens) {
        itens.add(item);
        System.out.println("Item adcionado: ");
    }
    public static void listarItens(List<String> listaItens) {
        System.out.println("Seus conteudos inseridos foram: ");

        for (String conteudo : listaItens) {
            System.out.println(conteudo);
        }
    }
}
