package br.com.futurodev.modulo1.semana2;

public class semana2 {
    public static void main(String[] args) {

    int numero1 = 10;
    int numero2 = 20;
    double numero3 = 2.4;
    double numero4 = 2.8;
    //Como usar o Math
        /*
        Bloco de C�digo
         */
        System.out.println();
        System.out.println("O menor numero �: " + Math.min(1,2));
        System.out.println("O menor numero �: " + Math.max(numero1,numero2));
        System.out.println("A fatora��o �: "  + Math.pow(numero3,numero4));
        System.out.println("O arredondando o numero fica: " + Math.round(21.0123123));
        System.out.println("O arredondando para cima �: " + Math.ceil(21.0123123));
        System.out.println("O arredondando para baixo �: " + Math.floor(21.0123));
    }


}
