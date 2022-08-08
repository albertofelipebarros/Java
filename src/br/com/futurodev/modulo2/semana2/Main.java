package br.com.futurodev.modulo2.semana2;

public class Main {
    public static void main(String[] args) {
     Calculadora calculadora = new Calculadora();
     calculadora.printCalculadora();

     System.out.println(calculadora.numero1);
     System.out.println(calculadora.numero2);

        Calculadora calculadora1 = new Calculadora();
        calculadora1.numero1=5.0;
        calculadora1.numero2=1.10;

        System.out.println(calculadora1.numero1);
        System.out.println(calculadora1.numero2);
    }
}
