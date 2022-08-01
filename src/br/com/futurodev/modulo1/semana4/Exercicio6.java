package br.com.futurodev.modulo1.semana4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Exercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> listanumeros = new ArrayList();
        listanumeros.add(10);
        listanumeros.add(11);
        listanumeros.add(12);
        listanumeros.add(10);
        listanumeros.add(11);
        listanumeros.add(10);

        TreeSet<Integer> setNumeros = new TreeSet<>();
        setNumeros.addAll(listanumeros);
        int setSizes = setNumeros.size();
        for (int i = 0; i < setSizes; i++) {
            System.out.println(setNumeros.pollLast());
            
        }
    }
}
