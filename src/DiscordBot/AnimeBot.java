package DiscordBot;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import javax.security.auth.login.LoginException;
public class AnimeBot {
    public static JDA jda;
    public static String prefix = "~";
    public static void main(String[] args) {
        try {
                JDA jda= JDABuilder.createDefault(String
                            .valueOf(AccountType.BOT))
                    .setToken("OTc5MzQ1MDY1NDMwMzc2NTA4.G-XgGZ.jmq5kviUPHvu45E3pLLY_APG-YKXdurALTxJzI").build();

            jda.getPresence()
                    .setStatus(OnlineStatus.DO_NOT_DISTURB);

            jda.getPresence()
                    .setActivity(Activity.playing("Watching Anime"));

            jda.addEventListener(new Commands());
        } catch (LoginException e) {
            throw new RuntimeException(e);
        }

    }
}