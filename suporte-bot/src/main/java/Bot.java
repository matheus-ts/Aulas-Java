import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Bot extends ListenerAdapter {

    static Boolean isBotLigado = true;
    static MessageReceivedEvent currentEvent;
    static String autor,mensagem,conteudo;
//    static Integer horaAtual;
//    static List<String> respostaDia = Arrays.asList("Bom dia, <user>! :smile:", "Eai <user>, bom dia! :blush: ","bom dia");
//    static List<String> respostaTarde = Arrays.asList("Boa tarde, <user>! :smile:", "Eai <user>, boa tarde! :blush: ","boa tarde");
//    static List<String> respostaNoite = Arrays.asList("Boa noite, <user>! :smile:", "Eai <user>, boa noite! :blush: ","boa noite");
//    static List<String> respostaMadrugada = Arrays.asList("Boa madrugada, <user>! :sleeping:", "Eai <user>, boa madrugada! :blush:","boa madruga");



    //Orientação a objetos do discord

    public static void setEvent(MessageReceivedEvent event){
        currentEvent = event;
        autor = event.getAuthor().getName();
        mensagem = event.getMessage().getContentDisplay();
        conteudo = event.getMessage().getContentRaw().toLowerCase();
    }

    private static void verificaLigar() {
        if(!isBotLigado) {
            if (conteudo.contains("!ligar")) {
                currentEvent.getChannel().sendMessage("#PartiuTrabalhar :smile:").queue();
                isBotLigado = true;
            }
        }
    }

    private static void verificaDesligar(){
        if(isBotLigado && conteudo.contains("!desligar")) {
            currentEvent.getChannel().sendMessage("#PartiuDormir :sleeping: ").queue();
            isBotLigado = false;
        }
    }


    public static void responderMsg(String entrada, String resposta) {
        verificaLigar();
        verificaDesligar();

        if( conteudo.contains(entrada)) {
            currentEvent.getChannel().sendMessage(resposta).queue();
               isBotLigado = true;
        }
    }
    public static void responderMsg(List entrada, String resposta) {
        verificaLigar();
        verificaDesligar();
        if(isBotLigado && conteudo.contains(conteudo)) {
            currentEvent.getChannel().sendMessage(resposta).queue();
            isBotLigado = true;
        }
    }

        public static void responderMsgRandom ( List entrada,List resposta){
            verificaLigar();
            verificaDesligar();
            if(entrada.contains(conteudo)) {
                Random aleatorio = new Random();
                Integer numero = aleatorio.nextInt(resposta.size());
                currentEvent.getChannel().sendMessage(resposta.get(numero).toString().replace("<user>", autor)).queue();

            }
        }

    public static void enviarMsg(String entrada) {
        currentEvent.getChannel().sendMessage(entrada).queue();
    }

    public static void mensagemConsole() {
        try {
            System.out.println("Recebemos uma mensagem de " + Bot.autor + ": " + Bot.mensagem );
        } catch (Exception NullPointerException) {
            System.out.println("Erro");
        }
    }
    }


