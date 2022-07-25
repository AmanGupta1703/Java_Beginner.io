package DiscordBot_Mai_Sakurajima_Bot;

import DiscordBot.Commands;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException, InterruptedException {

        JDA jda= JDABuilder.createDefault(String
                 .valueOf(AccountType.BOT))
                .setActivity(Activity.listening("Fukashigi no Carte"))
                .setToken("OTg0NDE4Nzg2OTMxMjc3ODY1.GWKmoC.YyrVEIKKXQUcv7a7ubO6ucUjVtnATGymlJzepU")
                .addEventListeners(new BotListeners(), new ButtonListeners())
                .build();
        Guild guild = jda.getGuildById("755897339880800257");

        if(guild != null) {
            guild.upsertCommand("BotName", "MaiSakurajima").queue();
         }


    }
}
