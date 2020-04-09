package CalculadoraOrçamento;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Double resultado,total_comp, preço_windows, preço_linux, total_linux, total_windows;
        Integer computadores, salas, windows, linux, quantidade;

        System.out.println("calculadora de orçamento v1");
        System.out.println("Digite a quantidade de computadores");
        computadores = leitor.nextInt();
        System.out.println("Digite a quantidade de salas");
        salas = leitor.nextInt();
        System.out.println("Quantidade de maquinas com windows ?");
        windows = leitor.nextInt();
        System.out.println("Quantidade de maquinas com linux ?");
        linux = leitor.nextInt();

        System.out.println("Processando aguarde !");


        //Preço das maquinas individual linux  e windwos
        preço_windows = 700.00;
        preço_linux = 500.00;


        //Preço total das maquinas de linux
        total_linux = preço_linux * linux;

        //Preço total das maquinas com windows
        total_windows= preço_windows * windows;

        //Preço total das maquinas juntas
        total_comp = total_linux + total_windows;


        //Calculo para identificar quantos computadores ao total serão nescessarios
        quantidade = computadores*salas;

        //Calculo para identificar o total
        resultado= total_comp*quantidade;


        System.out.println(String.format("São ao todo %s a quantidade de computadores nescessários, por cada maquina" +
                " com windows você irá pagar  R% %.2f , por cada maquina\" +\n" + " com linux você irá pagar  R% %.2f, de acordo com a quantidade exigida o preço total de maquinas windows vai custar R% %.2f\n" +
                "de acordo com a quantidade exigida o preço total de maquinas linux vai custar R% %.2f, o orçamento total seria R% %.2f", quantidade ,windows,linux, total_windows, total_linux, resultado ));






    }
}
