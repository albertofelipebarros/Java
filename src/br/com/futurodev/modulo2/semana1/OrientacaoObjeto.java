package br.com.futurodev.modulo2.semana1;
import br.com.futurodev.modulo2.semana1.objetos.Time;

public class OrientacaoObjeto {
    public static void main(String[] args) {
        Time futuroDev = new Time();
        futuroDev.nome = "FuturoDev";
        System.out.println("Nome do time: " + futuroDev.nome);
    }
}
