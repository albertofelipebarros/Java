package br.com.futurodev.modulo1.semana2;

/*
* Autor: Alberto Felipe Friderichs Barros
* Data de criação: 13/07/2022
* Data de modificação: 13/07/2022
* Objeto: Explicar operações lógicas
* */


public class Boolean {
    public static void main(String[] args) {
        boolean resultado = true && true; // true
        if(resultado){
            System.out.println("Executa AND");
        }

        resultado = true && false; // false
        if(resultado)
            System.out.println("Não Executa");


        if(false && false)
            System.out.println("Não Executa");

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
            System.out.println("Não Executa OR");
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
            System.out.println("O número é: ou maior ou igual a 10, ou menor ou igual a -10, e é impar");
        }
    }
}