package br.com.futurodev.modulo1.semana3;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        List<String> listaCompras = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seus passatempos (para sair digite \"fechar\"):");
        List<String> passatempos = new ArrayList<>();
        String passatempoInformado;
        do{
            passatempoInformado = entrada.nextLine();
            if (!passatempoInformado.toUpperCase().equals("FECHAR")) { // ".toUpperCase" transforma o conte�do de "passatempo" em MAI�SCULO
                passatempos.add(passatempoInformado); // Adiciona na lista de passatempos
                System.out.println("Passatempo inserido com sucesso!\n");
            }
        } while (!passatempoInformado.toUpperCase().equals("FECHAR")); // Repete o la�o enquanto o usu�rio N�O digitar

        System.out.println("\nSeus passatempos inseridos foram:");
        for (String passatempo : passatempos) { // Percorre a lista de passatempos
            System.out.println(passatempo);
        }
    }
}
