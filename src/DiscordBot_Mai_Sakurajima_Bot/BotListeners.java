package DiscordBot_Mai_Sakurajima_Bot;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.channel.ChannelDeleteEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.user.UserTypingEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class BotListeners extends ListenerAdapter {
    @Override
    public void onChannelDelete(@NotNull ChannelDeleteEvent event) {
        String channelName = event.getChannel().getName();  // grabbing the channel that was deleted

        TextChannel general = event.getGuild().getTextChannelById(755897339880800260L); // grabbing the general channel by id(to send a message of the channel that has been deleted)

        if(general != null) {   // if general channel in the server was deleted
            general.sendMessage("The channel: "+ "\" "+ channelName + "\""+  " was deleted").queue();
        }
    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if(event.getMessage().getContentRaw().equalsIgnoreCase("BotInfo")) {
            String replyMessage = "\nBotName: Mai Sakurajima\n\tCan be used for anime searches.";

            event.getTextChannel().sendMessage(replyMessage).queue();
        }
    }
}
