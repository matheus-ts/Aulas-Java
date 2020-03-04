package continuadaC1;

import java.util.Scanner;

public class registroProfundidade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        Integer tempo, soma = 0, quantidade = 0;


        System.out.println("Registrar tempo de mergulho");
        System.out.println("Digite o seu nome:");
        nome = leitor.nextLine();

        do{
            System.out.println("Quantos minutos passou mergulhando em uma profundidade maior do que 30m ?");
            tempo = leitor.nextInt(); //o usuario digita quantidade de minutos passou mergulhado a uma profundaidade maior que 30m

            if (tempo < 0){
                break;
            }

            else if(tempo >100){
                System.out.println("Quantidade inválida! não será considerada!");
            }

            else if(tempo >= 0){
                soma = tempo + soma;
                quantidade++;
            }

            System.out.println(String.format("%s agora tem um total de %d minutos de mergulho em profundidades acima de 30m.",nome,soma));
        } while(tempo >= 0);
        System.out.println(String.format("%s se aposentou após fazer %d mergulhos acumulando %d minutos!",nome,quantidade ,soma));

        }

    }
