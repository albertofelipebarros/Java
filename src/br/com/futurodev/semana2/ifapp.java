package br.com.futurodev.semana2;

import java.util.Scanner;

public class ifapp {
    public static void main(String[] args) {
//package src;

//import java.util.Scanner;



                /* Scanner scanner = new Scanner(System.in);

                System.out.print("Digite um n�mero: ");
                int numero = scanner.nextInt();

                //se
                if(numero >= 10){
                    System.out.println("Executa se for true/verdadeiro");
                    if(numero > 15){
                        System.out.println("if no if");
                    }
                }
                //se n�o
                else{
                    System.out.println("Executa se for false/falso");
                    if(numero < 0){
                        System.out.println("Numero negativo");
                    }
                }


                if(1 == 1){
                    System.out.println("Numero iguais");
                }

                if(1 <= 1){
                    System.out.println("Menor ou igual");
                }

                if(3 >= 1){
                    System.out.println("Maior ou igual");
                }

                if(3 > 1){
                    System.out.println("Maior");
                }

                if(3 < 1){
                    System.out.println("Maior");
                }


                if(!true){
                    System.out.println("Verdadeiro");
                }else {
                    System.out.println("Falso");
                }

                String nome = "Pedro";
                if(nome != "Andre" ){
                    System.out.println("Nome diferente de Andre");
                }
                else {
                    System.out.println("Nome igual a Andre");
                }
*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um n�mero: ");
        int numero = scanner.nextInt();
        if(!(numero>=10)){
        System.out.println("N�mero Menor que 10");
        }
        else
            System.out.println("N�mero Maior ou igual a 10");

    }
}