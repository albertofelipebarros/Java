package br.com.futurodev.modulo2.semana1.objetos;

import java.util.Date;

public class Pessoa {
    //Atributos
    public String nome; //*
    public double altura; //*
    public Date dataNascimento; //*
    public String genero; //*
    public double peso; //*
    public String cpf; //*

    public Pessoa(String nome, String cpf, String genero, Double altura, Double peso) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", genero='" + genero + '\'' +
                ", altura=" + altura +
                ", peso=" + peso + '\'' +
                '}';
    }

}