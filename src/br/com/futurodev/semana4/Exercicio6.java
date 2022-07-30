package br.com.futurodev.semana4;

import java.util.HashSet;

public class Exercicio6 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(3);
        hashSet.add(4);
        System.out.println("HashSet: " + hashSet);
        System.out.println("Removendo numero repetido " + hashSet.remove(3));
        System.out.println("HashSet: " + hashSet);
    }
}
