package br.com.futurodev.modulo1.semana4;

public class Arrays {
    public static void main(String[] args) {
       /* int[] numero = {0,1,2,3,3,4,7,10};
        int[] numero2 = numero;
       numero2[1] = 10;
       numero2[3] = 20;
        for (int i=0; i< numero2.length; i++){
            System.out.println(numero[i]);
            }
        String[] strings = {"Alberto", "0", "2"};
        for (int i= 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }
*/
        int[] numero3 = new int[10];
        int i =0;
        while (i< numero3.length){
            numero3[i] = i;
            i++;
        }
        for (int j =numero3.length -1; j>=0; j--) {
            System.out.println(numero3[1]);
        }
    }
}
