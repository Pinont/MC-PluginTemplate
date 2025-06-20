package com.pinont.plugin.command;

import com.pinont.lib.api.annotation.AutoRegister;
import com.pinont.lib.api.command.SimpleCommand;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.List;

@AutoRegister
public class Example implements SimpleCommand {
    @Override
    public String getName() { // Command name
        return "";
    }

    @Override
    public String description() { // Command description
        return "";
    }

    @Override
    public void execute(CommandSourceStack commandSourceStack, String[] strings) {
        // Command execution logic
        CommandSender sender = commandSourceStack.getSender();
        sender.sendMessage("This is an example command.");
    }

    @Override
    public Collection<String> suggest(CommandSourceStack commandSourceStack, String[] args) {
        return List.of("example"); // Provide suggestions for command arguments
    }

    @Override
    public boolean canUse(CommandSender sender) {
        return sender instanceof Player; // Check if the command can be used by the sender, I assume you want it to be used by players
    }
}
