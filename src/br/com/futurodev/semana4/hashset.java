package br.com.futurodev.semana4;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("valor 1");
        hashSet.add("valor 2");
        hashSet.add("valor 3");
        System.out.println("Size: " + hashSet.size());
        System.out.println("HashSet: " + hashSet);
        System.out.println("Contais Valor 2: " + hashSet.contains("valor 2"));
        hashSet.clear();
        System.out.println(hashSet);
        System.out.println("is empty: " +hashSet.isEmpty());
        if(hashSet.isEmpty())
            System.out.println("Lista Vazia");

    }
}
