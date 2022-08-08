package br.com.futurodev.modulo2.semana1;

import br.com.futurodev.modulo2.semana1.objetos.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa alberto = new Pessoa(
                "Alberto",
                "042.336.229-70",
                "Masculino",
                1.83,
                80.0);

        System.out.println(alberto);

    }
}
