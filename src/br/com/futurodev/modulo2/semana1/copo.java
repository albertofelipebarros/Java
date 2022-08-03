package br.com.futurodev.modulo2.semana1;

import java.util.Scanner;

public class copo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        copo copovidro = new copo();
        System.out.print("Digite o volume do copo: ");
        copovidro.capacidade = scanner.nextInt();
        System.out.println("Seu copo está: " + copovidro.getEstado());
    }

    //Atributos
    public int capacidade = 0;

    // Métodos
    public String getEstado() {
        if (this.capacidade == 100) {
            return "Cheio";
        } else if (this.capacidade >= 70) {
            return "Quase Cheio";
        } else if (this.capacidade >= 30) {
            return "Pela metade";
        } else if (this.capacidade > 0) {
            return "Quase vazio";
        } else {
            return "Vazio";
        }
    }
}
