package br.com.futurodev.semana4;

import java.util.ArrayList;

public class Listasdearray {
    public static void main(String[] args) {
       // String[] array = new String[10000];
       // array[0] ="10-array";
       // System.out.println(array[0]);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("10-arraylist");
        arrayList.add("10-arraylist");
        arrayList.add("10-arraylist");
        arrayList.add("10-arraylist");
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());
    }
}
