package main.java;

import java.util.Scanner;

public class estruturaDeRepeticao {
    public static void main(String[] args) {
        Integer contador = 1, cont, numero;
//        while (contador < 10){
//            System.out.println("olá mundo :D :D :D :" + contador );
//            contador ++;
//        }
//

        Scanner leitor= new Scanner(System.in);

        cont = 0;
 //       do { for(Integer i =1; i <= 9;  i++ ){
//            System.out.println("olá mundo :D :D :D :1-" + i );
//        };
            System.out.println("HELLO OLAR");
            cont--;
  //      } while(cont >= 0);
        do {

            System.out.println("Digite um valor positivo");
            numero = leitor.nextInt();
        }while (numero < 0);

    }
}
