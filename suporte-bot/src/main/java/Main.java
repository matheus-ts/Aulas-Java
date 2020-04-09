import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import javax.security.auth.login.LoginException;
import javax.swing.*;
import java.util.Arrays;
import java.util.List;


public class Main extends ListenerAdapter {

    public static void main(String[] args) throws LoginException {
        DiscordConnection.startDiscord(); //Class para incialização do bot
        if (DiscordConnection.token.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Token vazio");
        }
    }

     List<String> saudacoesGnar = Arrays.asList("bom dia","boa tarde","boa noite","b dia","b tarde","b noite","ola","oi","ajuda" );
     List<String> saudacoesGnarResposta = Arrays.asList("Ola <user>, em que posso ajudar? ","E ai <user>! Precisa de ajuda?",
            "Opa, <user>, beleza? Precisa de alguma coisa?");
     List<String> entradaRandom = Arrays.asList("entrada", "entrada2");
     List<String> respostaRandom = Arrays.asList("resposta1", "resposta2", "resposta3");


    public void onMessageReceived(MessageReceivedEvent event) {
        Bot.setEvent(event);
        Bot.mensagemConsole();


        if(event.getAuthor().isBot()) {
            return;
        }


        Bot.responderMsg("hello gnar","Salve, " + Bot.autor + ", em que posso ajudar?"); // metódos de resposta simples (input, output)

        Bot.responderMsgRandom(saudacoesGnar, saudacoesGnarResposta); // métodos de resposta aleatória com lista (listaInput, listaOutput)




    }

}
