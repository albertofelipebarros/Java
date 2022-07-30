package br.com.futurodev.semana4;

import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os nomes na lita (para sair digite \"FIM\"):");
        String nomes;
        do{
            nomes = entrada.nextLine();
            if (!nomes.toUpperCase().equals("FIM")) { // ".toUpperCase" transforma o conteúdo de "passatempo" em MAIÚSCULO
                lista.add(nomes); // Adiciona na lista de passatempos
            }
        } while (!nomes.toUpperCase().equals("FIM")); // Repete o laço enquanto o usuário NÃO digitar
        for (int i = lista.size()-1; i>=0; i--) {
            System.out.println("O ultimo nome da lista é " + lista.pollLast());
        }

        }

}
