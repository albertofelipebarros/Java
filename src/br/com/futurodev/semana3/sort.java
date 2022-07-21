package br.com.futurodev.semana3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class sort {
        public static void main(String[] args) {
            final int LIMITE = 6;
            final int NUMERO_MAXIMO = 60;
            int i = 0;

            //armazena numeros sorteados
            List<Integer> sorteados = new ArrayList<>();
            do {
                int numeroAleatorio = new Random().nextInt(NUMERO_MAXIMO + 1);
                // contador usado no arraylist
                int j = 0;
                boolean encontreiNumero = false;
                while (j < sorteados.size()) {
                    //verifica se o numero sorteado ja foi usado
                    Integer numeroAuxiliar = sorteados.get(j);
                    if (numeroAleatorio == numeroAuxiliar) {
                        encontreiNumero = true;
                        break; //encerra o loop de busca
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
            //ordenar os elementos
            sorteados.sort((e1, e2) -> e1 > e2 ? 1 : -1);
            while (i < sorteados.size()) {
                System.out.print(" " + sorteados.get(i));
                i++;
            }
        }
    }
