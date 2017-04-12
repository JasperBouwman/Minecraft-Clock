package clock;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Clock implements CommandExecutor {

	Main p;

	public Clock(Main instance) {
		p = instance;
	}

	public void Time(String w, Location l, Material m) {
		int x = l.getBlockX() + 3;
		Block b = Bukkit.getServer().getWorld(w).getBlockAt(x, l.getBlockY(), l.getBlockZ());
		b.setType(m);
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;

		String s = args[0];

//		if (Material.getMaterial(s) == null) {
//			player.sendMessage("wrong material");
//			return false;
//		}
		
		int a = Integer.parseInt(s);
		int b = a & 5;
		StringBuilder str = new StringBuilder();
		str.append(b);
		player.sendMessage(str.toString());
		
//		Calendar now = Calendar.getInstance();
//		int day = now.get(Calendar.DAY_OF_MONTH);
//		int hour = now.get(Calendar.HOUR_OF_DAY);
//		int minute = now.get(Calendar.MINUTE);
		
		

//		Time(player.getWorld().getName(), player.getLocation(), Material.getMaterial(s));

		return false;
	}
}
