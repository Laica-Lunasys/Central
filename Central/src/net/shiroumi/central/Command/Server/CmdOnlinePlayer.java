package net.shiroumi.central.Command.Server;

import net.shiroumi.central.CentralCore;
import net.shiroumi.central.Command.BaseCommand;
import net.shiroumi.central.Command.CommandDescription;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class CmdOnlinePlayer extends BaseCommand {

	public CmdOnlinePlayer(CentralCore par1Plugin) {
		super(new CommandDescription("onlineplayers", "server.onlineplayer", true));
	}

	@Override
	public boolean execute(CommandSender par1Sender, Command par2Command,
			String par3Args, String[] par4Args) {
		return false;
	}

}
