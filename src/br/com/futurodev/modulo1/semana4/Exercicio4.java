package br.com.futurodev.modulo1.semana4;

import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {
        List <Integer> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int limite = 10;
        for (int i = 0; i < limite ; i++) {
            System.out.print("Informe um numero: ");
            array.add(scanner.nextInt());
                    }
        System.out.println("A ordem normal �: "+ array);
        Collections.reverse(array);
        System.out.println("A ordem inversa �: "+ array);
        int i=0;
        array.sort((e1, e2) -> e1 > e2 ? 1 : -1);
        while (i < 1) {
            i++;
            System.out.println("A ordem crescente � : " + array);
            Collections.reverse(array);
            System.out.println("A ordem decrescente � : " + array);
        }
    }
}
