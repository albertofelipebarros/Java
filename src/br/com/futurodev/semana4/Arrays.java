package br.com.futurodev.semana4;

public class Arrays {
    public static void main(String[] args) {
        int[] numero = {0,1,2,3,3,4,7,10};
        int[] numero2 = numero;
       numero2[1] = 10;
       numero2[3] = 20;
        for (int i=0; i<8; i++){
            System.out.println(numero[i]);
        }
    }
}
