package br.com.futurodev.semana4;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class sorted {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("O");
        sortedSet.add("RATO");
        sortedSet.add("ROEU");
        sortedSet.add("A");

        System.out.println("primeiro item do Set: "+sortedSet.first()); // retorna a primeria posição do sortedSet
        System.out.println("ultimo item do Set: "+sortedSet.last()); // retorna a ultima posição do sortedSet
        System.out.println("itens a partir do Rato: "+sortedSet.tailSet("Rato")); // retorna os valores a partir do valor Rato
        System.out.println("itens a partir do O: "+sortedSet.tailSet("O")); // retorna os valores a partir do valor O
                System.out.println("itens a partir do O: "+sortedSet.tailSet("O")); // retorna os valores a partir do valor O
        System.out.println("itens antes do Rato: "+sortedSet.headSet("Rato")); // retorna os valores a antes do valor Rato

        System.out.println("Set completo: "+sortedSet);

    }
}
