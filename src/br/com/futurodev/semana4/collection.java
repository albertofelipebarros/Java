package br.com.futurodev.semana4;
import java.util.ArrayList;
import java.util.Collection;
public class collection {
    public static void main(String[] args) {

        Collection<String> stringCollection = new ArrayList<>();

        //stringCollection.add("1");
       // stringCollection.add("2");
        //stringCollection.add("3");
       // stringCollection.add("4");
       // stringCollection.add("");
        //stringCollection.forEach(itemCollection -> System.out.println(itemCollection));
       // System.out.println("Fim da execução");

        stringCollection.addAll(new ArrayList<String>());
        System.out.println(stringCollection.contains("1"));
        System.out.println(stringCollection.size());
        System.out.println(stringCollection.isEmpty());
        System.out.println(stringCollection.remove("1"));
        stringCollection.removeAll(new ArrayList<String>());
        stringCollection.removeIf(s -> s.isBlank());
        stringCollection.iterator();
        stringCollection.spliterator();
        stringCollection.clear();



    }
}
