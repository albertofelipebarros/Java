package br.com.futurodev.modulo1.semana3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class whiles {
        public static void main(String[] args) {


            List<Double> dimensoes = new ArrayList<>();
            Scanner entrada = new Scanner(System.in);
            int quantidade;
            System.out.println("Informe a quantidade de dimens�es: ");
            quantidade = entrada.nextInt();


            System.out.println("Informe as dimens�es: ");
            int i = 0;
            while (i<quantidade) {
                dimensoes.add(entrada.nextDouble());
                i++;
            }
            double volume = 1;
                    i = 0;
            while (i<quantidade) {
               volume = (volume*dimensoes.get(i));
                i++;
            }

            System.out.println("\nO volume � de: " + volume + "cm�");
        }
}
