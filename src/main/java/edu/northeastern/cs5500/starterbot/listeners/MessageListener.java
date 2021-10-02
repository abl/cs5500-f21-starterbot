package edu.northeastern.cs5500.starterbot.listeners;

import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {
    @Override
    public void onSlashCommand(SlashCommandEvent event) {
        switch (event.getName()) {
            case "say":
                event.reply(event.getOption("content").getAsString()).queue();
        }
    }
}
