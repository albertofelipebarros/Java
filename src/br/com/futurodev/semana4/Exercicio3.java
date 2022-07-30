package br.com.futurodev.semana4;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Exercicio3 {
        public static void main(String[] args) {
            //             0,1,2,3,4,5 - endereços/indexador
            int[] vetor = {1,82,22,30,2,67,4,2,92,2,1,0,6,7,9,3,2,3,22,35,44,59,7,73,3,1,50,22,30,19,8,13,2,3,2,1,5,79,7,93,35,21,30,22,35,41,55,99,77,3};// - valores

//   chave-unica   valor-Lista[um vetor de tamanho variável]
            Map<Integer, List<Integer>> contadorLista = new LinkedHashMap<>();

            for (int indexador = 0; indexador < vetor.length; indexador++) {
                int valor = vetor[indexador];

                if (!contadorLista.containsKey(valor)) {
                    contadorLista.put(valor, new ArrayList<>());

                }
                contadorLista.get(valor).add(indexador);

            }

            for (Map.Entry<Integer, List<Integer>> item : contadorLista.entrySet()) {
                List<Integer> listaPosicoes = item.getValue();
                if (listaPosicoes.size() > 1) {
                    System.out.println("O Número "+ item.getKey() +" se repete "+ listaPosicoes.size()+" vezes nas posições: " + listaPosicoes);
                }
            }
        }

    }
