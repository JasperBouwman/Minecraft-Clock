package clock;

import java.util.Calendar;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.inventory.ItemStack;

public class SignEvent implements Listener {

	Main p;

	public SignEvent(Main instance) {
		p = instance;
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void Sign(SignChangeEvent sign) {
		Player player = sign.getPlayer();
		if (sign.getLine(0).equalsIgnoreCase("[rtime]")) {

			Calendar now = Calendar.getInstance();
			int hour = now.get(Calendar.HOUR_OF_DAY);
			int minute = now.get(Calendar.MINUTE);
			int second = now.get(Calendar.SECOND);
			String shourp = "";
			String sminutep = "";
			String ssecondp = "";
			if (hour <= 9) {
				shourp = "0";
			}
			if (minute <= 9) {
				sminutep = "0";
			}
			if (second <= 9) {
				ssecondp = "0";
			}

			sign.setLine(0, shourp + hour + ":" + sminutep + minute + ":" + ssecondp + second);
			player.sendMessage("realtime set");

			p.getConfig().set("clocks.rtime." + player.getName(), sign.getBlock().getLocation());
			p.saveConfig();

		} else if (sign.getLine(0).equalsIgnoreCase("[stime]")) {

			long time = Bukkit.getServer().getWorld(player.getWorld().getName()).getTime();

			int hour = (int) ((time + 6000) / 1000);
			int minute = (int) (time / 1000);

			if (minute == 60) {
				minute = 0;
			}

			sign.setLine(0, hour + ":" + minute);

		} else if (sign.getLine(0).equalsIgnoreCase("[alarm]")) {
			if (sign.getLine(2).equalsIgnoreCase("") || sign.getLine(1).equalsIgnoreCase("")) {
				return;
			}
			sign.setLine(0, "alarm");

			player.sendMessage("alarm set");

			p.getConfig().set("clocks.alarm." + player.getName() + ".location", sign.getBlock().getLocation());
			p.getConfig().set("clocks.alarm." + player.getName() + ".message", sign.getLine(2));
			p.saveConfig();

		} else if (sign.getLine(0).equalsIgnoreCase("[clock]")) {
			if (sign.getLine(1).equalsIgnoreCase("") || sign.getLine(2).equalsIgnoreCase("")
					|| sign.getLine(3).equalsIgnoreCase("")) {
				return;
			}

			ItemStack clockMaterial = new ItemStack(Material.getMaterial(sign.getLine(1).toUpperCase()));
			Material clockBackmaterial = Material.getMaterial(sign.getLine(2).toUpperCase());
			if (clockMaterial.getType() == null) {
				player.sendMessage(sign.getLine(1) + " is not an material");
				return;
			}
			if (clockBackmaterial == null) {
				player.sendMessage(sign.getLine(2) + " is not an material");
				return;
			}
			String offset = sign.getLine(3);
			String x = "";
			String y = "";
			String z = "";
			int i = 0;
			for (String s : offset.split("\\s", 0)) {
				if (i == 0) {
					x = s;
					i++;
				} else if (i == 1) {
					y = s;
					i++;
				} else if (i == 2) {
					z = s;
					i++;
				} else if (i >= 2) {
					player.sendMessage("to many arguments. ony give x y and z");
					return;
				}
			}

			if (x == "") {
				player.sendMessage("did not give an x value");
				return;
			}
			if (y == "") {
				player.sendMessage("did not give an y value");
				return;
			}
			if (z == "") {
				player.sendMessage("did not give an x value");
				return;
			}

			int intx = 0;
			int inty = 0;
			int intz = 0;

			try {
				intx = Integer.parseInt(x) + 1;
			} catch (NumberFormatException nfe) {
				player.sendMessage("x must be an number ");
				return;
			}
			try {
				inty = Integer.parseInt(y);
			} catch (NumberFormatException nfe) {
				player.sendMessage("y must be an number ");
				return;
			}
			try {
				intz = Integer.parseInt(z) + 2;
			} catch (NumberFormatException nfe) {
				player.sendMessage("z must be an number ");
				return;
			}

			if (p.getConfig().contains("clocks.real")) {
				int offsetx = p.getConfig().getInt("clocks.real.offsetx");
				int offsety = p.getConfig().getInt("clocks.real.offsety");
				int offsetz = p.getConfig().getInt("clocks.real.offsetz");
				Location l = (Location) p.getConfig().get("clocks.real.location");
				Location L1 = new Location(l.getWorld(), l.getX() + 1 + offsetx, l.getY() + offsety,
						l.getZ() + 30 + offsetz);
				Location L2 = new Location(l.getWorld(), l.getX() + offsetx, l.getY() + 6 + offsety,
						l.getZ() + 2 + offsetz);
				// calculates the valuables
				int minX = Math.min(L1.getBlockX(), L2.getBlockX());
				int minY = Math.min(L1.getBlockY(), L2.getBlockY());
				int minZ = Math.min(L1.getBlockZ(), L2.getBlockZ());
				int maxX = Math.max(L1.getBlockX(), L2.getBlockX());
				int maxY = Math.max(L1.getBlockY(), L2.getBlockY());
				int maxZ = Math.max(L1.getBlockZ(), L2.getBlockZ());
				// set all blocks in this region to air
				for (int xx = minX; xx <= maxX; xx++) {
					for (int yy = minY; yy <= maxY; yy++) {
						for (int zz = minZ; zz <= maxZ; zz++) {
							Block block = Bukkit.getServer().getWorld(l.getWorld().getName())
									.getBlockAt(new Location(l.getWorld(), xx, yy, zz));
							block.setType(Material.AIR);
						}
					}
				}
			}

			Location L1 = sign.getBlock().getLocation();
			Location L2 = sign.getBlock().getLocation();

			int minX = Math.min(L1.getBlockX() + intx, L2.getBlockX() + intx);
			int minY = Math.min(L1.getBlockY() + inty, L2.getBlockY() + inty + 6);
			int minZ = Math.min(L1.getBlockZ() + intz, L2.getBlockZ() + intz + 28);
			int maxX = Math.max(L1.getBlockX() + intx, L2.getBlockX() + intx);
			int maxY = Math.max(L1.getBlockY() + inty, L2.getBlockY() + inty + 6);
			int maxZ = Math.max(L1.getBlockZ() + intz, L2.getBlockZ() + intz + 28);

			for (int xx = minX; xx <= maxX; xx++) {
				for (int yy = minY; yy <= maxY; yy++) {
					for (int zz = minZ; zz <= maxZ; zz++) {
						Block block = Bukkit.getServer().getWorld(player.getWorld().getName())
								.getBlockAt(new Location(player.getWorld(), xx, yy, zz));
						block.setType(clockBackmaterial);
					}
				}
			}

			p.getConfig().set("clocks.real.location", L1);
			p.getConfig().set("clocks.real.material", clockMaterial);
			p.getConfig().set("clocks.real.offsetx", intx - 1);
			p.getConfig().set("clocks.real.offsety", inty);
			p.getConfig().set("clocks.real.offsetz", intz - 2);
			p.saveConfig();
			sign.setLine(0, "clock");
		}
	}

	@EventHandler
	public void BlockBreak(BlockBreakEvent e) {

		if (p.getConfig().contains("clocks.real")) {
			Player player = e.getPlayer();
			Location l2 = e.getBlock().getLocation();

			int offsetx = p.getConfig().getInt("clocks.real.offsetx");
			int offsety = p.getConfig().getInt("clocks.real.offsety");
			int offsetz = p.getConfig().getInt("clocks.real.offsetz");
			Location l = (Location) p.getConfig().get("clocks.real.location");
			Location L1 = new Location(l.getWorld(), l.getX() + 1 + offsetx, l.getY() + offsety,
					l.getZ() + 30 + offsetz);
			Location L2 = new Location(l.getWorld(), l.getX() + offsetx, l.getY() + 6 + offsety,
					l.getZ() + 2 + offsetz);
			// calculates the valuables
			int minX = Math.min(L1.getBlockX(), L2.getBlockX());
			int minY = Math.min(L1.getBlockY(), L2.getBlockY());
			int minZ = Math.min(L1.getBlockZ(), L2.getBlockZ());
			int maxX = Math.max(L1.getBlockX(), L2.getBlockX());
			int maxY = Math.max(L1.getBlockY(), L2.getBlockY());
			int maxZ = Math.max(L1.getBlockZ(), L2.getBlockZ());
			// set all blocks in this region to air
			for (int xx = minX; xx <= maxX; xx++) {
				for (int yy = minY; yy <= maxY; yy++) {
					for (int zz = minZ; zz <= maxZ; zz++) {

						Location l1 = new Location(l.getWorld(), xx, yy, zz);
						if (l1.equals(l2)) {
							player.sendMessage("can't break a block in a clock");
							e.setCancelled(true);
							return;
						}

					}
				}
			}
		}

	}

	@EventHandler
	public void Blockplace(BlockPlaceEvent e) {
		Player player = e.getPlayer();
		Location l2 = e.getBlock().getLocation();

		if (p.getConfig().contains("clocks.real")) {

			int offsetx = p.getConfig().getInt("clocks.real.offsetx");
			int offsety = p.getConfig().getInt("clocks.real.offsety");
			int offsetz = p.getConfig().getInt("clocks.real.offsetz");
			Location l = (Location) p.getConfig().get("clocks.real.location");
			Location L1 = new Location(l.getWorld(), l.getX() + 1 + offsetx, l.getY() + offsety,
					l.getZ() + 30 + offsetz);
			Location L2 = new Location(l.getWorld(), l.getX() + offsetx, l.getY() + 6 + offsety,
					l.getZ() + 2 + offsetz);
			// calculates the valuables
			int minX = Math.min(L1.getBlockX(), L2.getBlockX());
			int minY = Math.min(L1.getBlockY(), L2.getBlockY());
			int minZ = Math.min(L1.getBlockZ(), L2.getBlockZ());
			int maxX = Math.max(L1.getBlockX(), L2.getBlockX());
			int maxY = Math.max(L1.getBlockY(), L2.getBlockY());
			int maxZ = Math.max(L1.getBlockZ(), L2.getBlockZ());
			// set all blocks in this region to air
			for (int xx = minX; xx <= maxX; xx++) {
				for (int yy = minY; yy <= maxY; yy++) {
					for (int zz = minZ; zz <= maxZ; zz++) {

						Location l1 = new Location(l.getWorld(), xx, yy, zz);
						if (l1.equals(l2)) {
							player.sendMessage("can't place a block in a clock");
							e.setCancelled(true);
							return;
						}
					}
				}
			}
		}
	}
}
