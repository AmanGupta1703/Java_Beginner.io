package DiscordBot_Mai_Sakurajima_Bot;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.ActionRow;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import org.jetbrains.annotations.NotNull;
public class ButtonListeners extends ListenerAdapter {
    private final String[] BAD_WORDS = {"weener", "frick", "crap"};

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {

        //When someone sends a message with a bad word, make a buttoned messsage
        //send in the staff channel so it can be optionally removed.

        for (String badWord : BAD_WORDS) {
            if (event.getMessage().getContentRaw().contains(badWord)) {

                event.getChannel().sendMessage("You said a bad word! I am telling on you.").queue();

                //Create a message and add a button to it
                Message message = new MessageBuilder()
                        .append(event.getMember().getEffectiveName())
                        .append(" said a bad word. Click the button below to remove it.")
                        .append("Message ID: "+ event.getMessageId())
                        .setActionRows(
                                ActionRow.of(   Button.danger("remove-msg", "Remove Message"),
                                                Button.success("ignore-alert", "Ignore Alert"))
                                            )
                        .build();

                //Send the message
                TextChannel staffChannel = event.getJDA().getTextChannelById("985372446964203530");

                if (staffChannel != null) {
                    staffChannel.sendMessage(message).queue();
                }

            }
        }

    }

    @Override
    public void onButtonInteraction(@NotNull ButtonInteractionEvent event) {

        if (event.getButton().getId().equals("remove-msg")) {
            //Get the message the button is on and remove it
            String[] content = event.getMessage().getContentRaw().split(" ");
            //System.out.println(Arrays.toString(content));
            String messageID = content[content.length - 1]; // to get the last one
            //System.out.println(messageID);

            event.getGuild().getTextChannelById("985381034919084032").deleteMessageById(messageID).queue();

            //The interaction needs to still be completed, so reply to it just like a slash command
            event.reply("Message removed.").queue();

        }else if (event.getButton().getId().equals("ignore-alert")) {

            //do nothing lmao
            event.reply("Ignoring the alert...").queue();

        }

    }
}

