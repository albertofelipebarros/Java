package br.com.futurodev.semana2;
public class Boolean {
    public static void main(String[] args) {
        boolean resultado = true && true; // true
        if(resultado){
            System.out.println("Executa AND");
        }

        resultado = true && false; // false
        if(resultado)
            System.out.println("N�o Executa");


        if(false && false)
            System.out.println("N�o Executa");

        resultado = true || true;
        if (resultado){
            System.out.println("Executa OR");
        }

        resultado = true || false;
        if (resultado){
            System.out.println("Executa OR");
        }

        resultado = false || false;
        if (resultado){
            System.out.println("N�o Executa OR");
        }

        int x = 10;
        if (10 <= x || x < -10){ //ou maior ou igual a 10, ou menor do que -10
            System.out.println("ou maior ou igual a 10, ou menor do que -10 ");
        }
//   or     x                           x
//        ---------(-10) -------- (10) ---------
//   and                     x
        if (10 >= x && x > -10){ //intervalo entre -9 e 10
            System.out.println("intervalo entre -9 e 10");
        }
    }
}