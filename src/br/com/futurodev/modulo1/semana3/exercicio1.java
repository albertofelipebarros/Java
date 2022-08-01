package br.com.futurodev.modulo1.semana3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int quantidade = 10;
        List <Double> numeros= new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i <quantidade; i++) {
        System.out.println("Infome um números: ");
        numeros.add(entrada.nextDouble());
        }
        System.out.print("Os números inseridos foram: " + numeros);

    }
}
