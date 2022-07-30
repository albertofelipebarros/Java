package br.com.futurodev.semana4;

import java.util.*;
import java.io.*;


public class BinarySearchAula4 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(); // cria lista
        lista.add(2); // adiciona item a lista
        lista.add(3); // adiciona item a lista
        lista.add(11); // adiciona item a lista


        Collections.sort(lista); // ordena a lista, � necess�rio para realizar o binary search

        System.out.println("Resultado de busca bin�ria: "
                +Collections.binarySearch(lista, 7)); //procurando na lista o valor 1 com o algoritimo binary search
        // se o binary search n�o encontra o valor ele retorna ((o ultimo endere�o) + 1) *(-1)
        lista.add(10);
        System.out.println("Resultado de busca bin�ria: "
                +Collections.binarySearch(lista, 10));
        if(Collections.binarySearch(lista,10) <= -1){
            Collections.sort(lista);
            if(Collections.binarySearch(lista,10) <= -1)
                System.out.println("Valor 10 n�o encontrado na lista");
            else
                System.out.println("Valor 10 encontrado na lista");
        }

//        for (Integer item: lista){ // executa para cada item da lista
//            System.out.println(item);
//        }
    }
}
