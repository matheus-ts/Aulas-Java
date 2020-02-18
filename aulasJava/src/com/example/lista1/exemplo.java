package com.example.lista1;

import javax.swing.*;

public class exemplo {
    public static void main(String[] args) {

        String nome= JOptionPane.showInputDialog("Insira seu nome:"); //Exibe popups na tela
        String texto= String.format("Olá %s", nome);
        String facul = "Bandtec";
        Integer numeroInteiro = 42;
        Double numeroReal = 42.1032;


        System.out.println(texto);
        System.out.println(String.format("Bem vindo a %s", facul));
        System.out.println(String.format("Meu nome é: %s e estudo na %s",nome,facul)); //pode se usar diversas intepolações no SOUT porem respeita a ordem de exibição
        System.out.println(String.format("Numeros inteiro: %d",numeroInteiro)); //Numero inteiro para fazer a interpolação se usa p D que significa Decima

        System.out.println(String.format("Numero real: %.2f",numeroReal)); // %.(QUANTIDADE DE CASAS PARA MOSTRAR)F-FLOAT
    }
}
