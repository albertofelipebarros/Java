package br.com.futurodev.modulo1.semana2;

/*
* Autor: Alberto Felipe Friderichs Barros
* Data de cria��o: 13/07/2022
* Data de modifica��o: 13/07/2022
* Objeto: Explicar opera��es l�gicas
* */


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
        x = -9;
        if ((10 <= x || x <= -10) && x%2!=0){ //ou maior ou igual a 10, ou menor ou igual a -10
            System.out.println("O n�mero �: ou maior ou igual a 10, ou menor ou igual a -10, e � impar");
        }
    }
}