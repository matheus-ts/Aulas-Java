import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import javax.security.auth.login.LoginException;

public class DiscordConnection extends ListenerAdapter {

    static JDABuilder builder = new JDABuilder(AccountType.BOT); // criando a instância de JDA, usando a class JDABuilder
    static String token = "Njg4MDY5MTYwNDU3OTk0NDE4.XnIy1w.DlEi2UrG1pGfu44bfL9HpDTKV5s";


    public static void startDiscord() throws LoginException{   // Inicialização do bot para conexão com discord com um token

            builder.setToken(token); // adicionando o token no JDABuilder
            builder.addEventListener(new Main());
            builder.setGame(Game.playing("!comandos"));
            builder.buildAsync();// logar no discord com o nosso bot
        }
        }

