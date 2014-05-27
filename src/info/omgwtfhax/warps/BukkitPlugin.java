package info.omgwtfhax.warps;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitPlugin extends JavaPlugin{
	
	public void onEnable()
	{
		this.saveDefaultConfig();
	}
	
	public void onDisable()
	{
		this.saveConfig();
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		return false;
	}

}
