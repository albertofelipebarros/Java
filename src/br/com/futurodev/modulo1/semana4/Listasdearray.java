package br.com.futurodev.modulo1.semana4;

import java.util.ArrayList;

public class Listasdearray {
    public static void main(String[] args) {
       // String[] array = new String[10000];
       // array[0] ="10-array";
       // System.out.println(array[0]);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("zero");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));

        arrayList.clear();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Nome");
        arrayList2.add("Idade");
        arrayList2.add("Estado");

        arrayList.addAll(arrayList2);
        System.out.println(arrayList);

        arrayList2.add("Formato");
        System.out.println(arrayList2);


    }
}
