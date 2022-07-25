package DiscordBot;

import gnu.trove.impl.sync.TSynchronizedShortObjectMap;
import jdk.swing.interop.SwingInterOpUtils;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.GuildMessageChannel;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.managers.GuildManager;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Commands extends ListenerAdapter  {
    public void onMessageReceived(@NotNull MessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split(" ");
        event.getChannel().sendTyping();
        System.out.println("We receives a message from "+ event.getAuthor().getName() + " : "+ event.getMessage().getContentDisplay());

        if(event.getMessage().getContentRaw().equalsIgnoreCase(AnimeBot.prefix + "ping")) {
            event.getChannel().sendMessage("Pong").queue();
        } else if(event.getMessage().getContentRaw().equalsIgnoreCase(AnimeBot.prefix + "id")) {
            event.getChannel().sendMessage("ID : "+ event.getMember().getId()).queue();
        } else if(event.getMessage().getContentRaw().equalsIgnoreCase(AnimeBot.prefix + "info")) {
            event.getChannel().sendMessage("Anime Bot In-Build").queue();
        } else if (event.getMessage().getContentRaw().equalsIgnoreCase(AnimeBot.prefix + "Hello")) {
            event.getChannel().sendMessage("Hello " + " " + event.getAuthor().getName()).queue();
        }

        /*if(args[0].equalsIgnoreCase(AnimeBot.prefix + "info")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("About Anime");
            info.addField("Creater", "Aman", false);

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage((Message) info.build()).queue();
            info.clear();
        }*/
    }
}
