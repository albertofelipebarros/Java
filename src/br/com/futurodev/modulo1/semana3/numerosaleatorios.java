package br.com.futurodev.modulo1.semana3;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class numerosaleatorios {
    public static void main(String[] args) {
        final int LIMITE = 6;
        final int NUMERO_MAXIMO = 60;


        List<Integer> sorteados = new ArrayList<>();

        int i = 0;
        do {
            int numeroAleatorio = new Random().nextInt(NUMERO_MAXIMO + 1);

            int j = 0;
            boolean encontreiNumero = false;

            while (j < sorteados.size()) {
                Integer numeroAuxiliar = sorteados.get(j);
                if (numeroAleatorio == numeroAuxiliar) {
                    encontreiNumero = true;
                    break;
                }
                j++;
            }

            if (encontreiNumero) {
                System.out.println("Número repetido: " + numeroAleatorio);
            } else {
                sorteados.add(numeroAleatorio);
                i++;
            }

        } while (i < LIMITE);
        i = 0;
        while (i < sorteados.size()) {
            System.out.print(" " + sorteados.get(i));
            i++;
        }
    }
}
