package com.example.lista2;


import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        double valor,quantia_paga, resultado, resultado2, resultado3;
        String sabor;
        double valor_pago;
        Integer pagaram;

        Scanner leitor = new Scanner (System.in);
        System.out.println("Bora rachar a Pizza ?");
        System.out.println("Qual o valor da pizza ?");
        valor = leitor.nextDouble();
        System.out.println("E qual é o sabor da pizza ? (Por favor não seja ruim né kk)");
        sabor = leitor.next();
        System.out.println("Tudo certo e quantas pessoas vão pagar ?");
        pagaram = leitor.nextInt();
        System.out.println("Qual a quantia que cada um vai pagar ?");
        quantia_paga = leitor.nextDouble();

        System.out.println("PROCESSANDO");
        resultado = quantia_paga * pagaram; //a quantidade de pessoas que pagaram
        resultado2 = resultado/pagaram;
        resultado3 = (resultado/pagaram)-valor;

        if (resultado == valor ){
            System.out.println(String.format("A pizza de %s será dividida entre %d pessoas. R$ %.2f p/ cada",sabor , pagaram , resultado2 ));

        } else if(resultado >= valor){
            System.out.println(String.format("A pizza de %s será dividida entre %d pessoas. R$ %.2f p/ cada",sabor , pagaram , resultado3 ));

        }
            else {
            System.out.println(String.format("Deu ruim no racha. A pizza deveria custar no máximo %.2f",resultado));
        }


    }
}
