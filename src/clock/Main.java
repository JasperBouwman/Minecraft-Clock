package clock;

import java.util.Calendar;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

//Location loc = new Location(l.getWorld(), l.getBlockX(), l.getY() + 2, l.getZ() + 3 + offset);
//Block b = Bukkit.getServer().getWorld("world").getBlockAt(loc);
//b.setType(m);

public class Main extends JavaPlugin implements Listener {

	// this cleared all the numbers, so the new numbers wont collide
	public void clear(Location l, int offsetx, int offsety, int offsetz) {
		// set the location
		Location L1 = new Location(l.getWorld(), l.getX() + offsetx, l.getY() + 1 + offsety, l.getZ() + 29 + offsetz);
		Location L2 = new Location(l.getWorld(), l.getX() + offsetx, l.getY() + 5 + offsety, l.getZ() + 3 + offsetz);
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

	public void digit1(int offset, Material m, Location l, int offsetx, int offsety, int offsetz) {

		Location loc0 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b0 = Bukkit.getServer().getWorld("world").getBlockAt(loc0);
		b0.setType(m);

		Location loc1 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b1 = Bukkit.getServer().getWorld("world").getBlockAt(loc1);
		b1.setType(m);

		Location loc2 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b2 = Bukkit.getServer().getWorld("world").getBlockAt(loc2);
		b2.setType(m);

		Location loc3 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b3 = Bukkit.getServer().getWorld("world").getBlockAt(loc3);
		b3.setType(m);

		Location loc4 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b4 = Bukkit.getServer().getWorld("world").getBlockAt(loc4);
		b4.setType(m);

	}

	public void digit2(int offset, Material m, Location l, int offsetx, int offsety, int offsetz) {

		Location loc0 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b0 = Bukkit.getServer().getWorld("world").getBlockAt(loc0);
		b0.setType(m);

		Location loc1 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b1 = Bukkit.getServer().getWorld("world").getBlockAt(loc1);
		b1.setType(m);

		Location loc2 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b2 = Bukkit.getServer().getWorld("world").getBlockAt(loc2);
		b2.setType(m);

		Location loc3 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b3 = Bukkit.getServer().getWorld("world").getBlockAt(loc3);
		b3.setType(m);

		Location loc4 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b4 = Bukkit.getServer().getWorld("world").getBlockAt(loc4);
		b4.setType(m);

		Location loc5 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b5 = Bukkit.getServer().getWorld("world").getBlockAt(loc5);
		b5.setType(m);

		Location loc6 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b6 = Bukkit.getServer().getWorld("world").getBlockAt(loc6);
		b6.setType(m);

		Location loc7 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b7 = Bukkit.getServer().getWorld("world").getBlockAt(loc7);
		b7.setType(m);

		Location loc8 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b8 = Bukkit.getServer().getWorld("world").getBlockAt(loc8);
		b8.setType(m);

		Location loc9 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b9 = Bukkit.getServer().getWorld("world").getBlockAt(loc9);
		b9.setType(m);

		Location loc10 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b10 = Bukkit.getServer().getWorld("world").getBlockAt(loc10);
		b10.setType(m);

		Location loc11 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b11 = Bukkit.getServer().getWorld("world").getBlockAt(loc11);
		b11.setType(m);
	}

	public void digit3(int offset, Material m, Location l, int offsetx, int offsety, int offsetz) {

		Location loc0 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b0 = Bukkit.getServer().getWorld("world").getBlockAt(loc0);
		b0.setType(m);

		Location loc1 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b1 = Bukkit.getServer().getWorld("world").getBlockAt(loc1);
		b1.setType(m);

		Location loc2 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b2 = Bukkit.getServer().getWorld("world").getBlockAt(loc2);
		b2.setType(m);

		Location loc3 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b3 = Bukkit.getServer().getWorld("world").getBlockAt(loc3);
		b3.setType(m);

		Location loc4 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b4 = Bukkit.getServer().getWorld("world").getBlockAt(loc4);
		b4.setType(m);

		Location loc5 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b5 = Bukkit.getServer().getWorld("world").getBlockAt(loc5);
		b5.setType(m);

		Location loc6 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b6 = Bukkit.getServer().getWorld("world").getBlockAt(loc6);
		b6.setType(m);

		Location loc7 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b7 = Bukkit.getServer().getWorld("world").getBlockAt(loc7);
		b7.setType(m);

		Location loc8 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b8 = Bukkit.getServer().getWorld("world").getBlockAt(loc8);
		b8.setType(m);

		Location loc9 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b9 = Bukkit.getServer().getWorld("world").getBlockAt(loc9);
		b9.setType(m);

		Location loc10 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b10 = Bukkit.getServer().getWorld("world").getBlockAt(loc10);
		b10.setType(m);
	}

	public void digit4(int offset, Material m, Location l, int offsetx, int offsety, int offsetz) {

		Location loc0 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b0 = Bukkit.getServer().getWorld("world").getBlockAt(loc0);
		b0.setType(m);

		Location loc1 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b1 = Bukkit.getServer().getWorld("world").getBlockAt(loc1);
		b1.setType(m);

		Location loc2 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b2 = Bukkit.getServer().getWorld("world").getBlockAt(loc2);
		b2.setType(m);

		Location loc3 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b3 = Bukkit.getServer().getWorld("world").getBlockAt(loc3);
		b3.setType(m);

		Location loc4 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b4 = Bukkit.getServer().getWorld("world").getBlockAt(loc4);
		b4.setType(m);

		Location loc5 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b5 = Bukkit.getServer().getWorld("world").getBlockAt(loc5);
		b5.setType(m);

		Location loc6 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b6 = Bukkit.getServer().getWorld("world").getBlockAt(loc6);
		b6.setType(m);

		Location loc7 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b7 = Bukkit.getServer().getWorld("world").getBlockAt(loc7);
		b7.setType(m);

		Location loc8 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b8 = Bukkit.getServer().getWorld("world").getBlockAt(loc8);
		b8.setType(m);
	}

	public void digit5(int offset, Material m, Location l, int offsetx, int offsety, int offsetz) {

		Location loc0 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b0 = Bukkit.getServer().getWorld("world").getBlockAt(loc0);
		b0.setType(m);

		Location loc1 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b1 = Bukkit.getServer().getWorld("world").getBlockAt(loc1);
		b1.setType(m);

		Location loc2 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b2 = Bukkit.getServer().getWorld("world").getBlockAt(loc2);
		b2.setType(m);

		Location loc3 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b3 = Bukkit.getServer().getWorld("world").getBlockAt(loc3);
		b3.setType(m);

		Location loc4 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b4 = Bukkit.getServer().getWorld("world").getBlockAt(loc4);
		b4.setType(m);

		Location loc5 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b5 = Bukkit.getServer().getWorld("world").getBlockAt(loc5);
		b5.setType(m);

		Location loc6 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b6 = Bukkit.getServer().getWorld("world").getBlockAt(loc6);
		b6.setType(m);

		Location loc7 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b7 = Bukkit.getServer().getWorld("world").getBlockAt(loc7);
		b7.setType(m);

		Location loc8 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b8 = Bukkit.getServer().getWorld("world").getBlockAt(loc8);
		b8.setType(m);

		Location loc9 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b9 = Bukkit.getServer().getWorld("world").getBlockAt(loc9);
		b9.setType(m);

		Location loc10 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b10 = Bukkit.getServer().getWorld("world").getBlockAt(loc10);
		b10.setType(m);
	}

	public void digit6(int offset, Material m, Location l, int offsetx, int offsety, int offsetz) {

		Location loc0 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b0 = Bukkit.getServer().getWorld("world").getBlockAt(loc0);
		b0.setType(m);

		Location loc1 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b1 = Bukkit.getServer().getWorld("world").getBlockAt(loc1);
		b1.setType(m);

		Location loc2 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b2 = Bukkit.getServer().getWorld("world").getBlockAt(loc2);
		b2.setType(m);

		Location loc3 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b3 = Bukkit.getServer().getWorld("world").getBlockAt(loc3);
		b3.setType(m);

		Location loc4 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b4 = Bukkit.getServer().getWorld("world").getBlockAt(loc4);
		b4.setType(m);

		Location loc5 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b5 = Bukkit.getServer().getWorld("world").getBlockAt(loc5);
		b5.setType(m);

		Location loc6 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b6 = Bukkit.getServer().getWorld("world").getBlockAt(loc6);
		b6.setType(m);

		Location loc7 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b7 = Bukkit.getServer().getWorld("world").getBlockAt(loc7);
		b7.setType(m);

		Location loc8 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b8 = Bukkit.getServer().getWorld("world").getBlockAt(loc8);
		b8.setType(m);

		Location loc9 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b9 = Bukkit.getServer().getWorld("world").getBlockAt(loc9);
		b9.setType(m);

		Location loc10 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b10 = Bukkit.getServer().getWorld("world").getBlockAt(loc10);
		b10.setType(m);

		Location loc11 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b11 = Bukkit.getServer().getWorld("world").getBlockAt(loc11);
		b11.setType(m);

	}

	public void digit7(int offset, Material m, Location l, int offsetx, int offsety, int offsetz) {

		Location loc0 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b0 = Bukkit.getServer().getWorld("world").getBlockAt(loc0);
		b0.setType(m);

		Location loc1 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b1 = Bukkit.getServer().getWorld("world").getBlockAt(loc1);
		b1.setType(m);

		Location loc2 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b2 = Bukkit.getServer().getWorld("world").getBlockAt(loc2);
		b2.setType(m);

		Location loc3 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b3 = Bukkit.getServer().getWorld("world").getBlockAt(loc3);
		b3.setType(m);

		Location loc4 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b4 = Bukkit.getServer().getWorld("world").getBlockAt(loc4);
		b4.setType(m);

		Location loc5 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b5 = Bukkit.getServer().getWorld("world").getBlockAt(loc5);
		b5.setType(m);

		Location loc6 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b6 = Bukkit.getServer().getWorld("world").getBlockAt(loc6);
		b6.setType(m);
	}

	public void digit8(int offset, Material m, Location l, int offsetx, int offsety, int offsetz) {

		Location loc0 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b0 = Bukkit.getServer().getWorld("world").getBlockAt(loc0);
		b0.setType(m);

		Location loc1 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b1 = Bukkit.getServer().getWorld("world").getBlockAt(loc1);
		b1.setType(m);

		Location loc2 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b2 = Bukkit.getServer().getWorld("world").getBlockAt(loc2);
		b2.setType(m);

		Location loc3 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b3 = Bukkit.getServer().getWorld("world").getBlockAt(loc3);
		b3.setType(m);

		Location loc4 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b4 = Bukkit.getServer().getWorld("world").getBlockAt(loc4);
		b4.setType(m);

		Location loc5 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b5 = Bukkit.getServer().getWorld("world").getBlockAt(loc5);
		b5.setType(m);

		Location loc6 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b6 = Bukkit.getServer().getWorld("world").getBlockAt(loc6);
		b6.setType(m);

		Location loc7 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b7 = Bukkit.getServer().getWorld("world").getBlockAt(loc7);
		b7.setType(m);

		Location loc8 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b8 = Bukkit.getServer().getWorld("world").getBlockAt(loc8);
		b8.setType(m);

		Location loc9 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b9 = Bukkit.getServer().getWorld("world").getBlockAt(loc9);
		b9.setType(m);

		Location loc10 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b10 = Bukkit.getServer().getWorld("world").getBlockAt(loc10);
		b10.setType(m);

		Location loc11 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b11 = Bukkit.getServer().getWorld("world").getBlockAt(loc11);
		b11.setType(m);

		Location loc12 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b12 = Bukkit.getServer().getWorld("world").getBlockAt(loc12);
		b12.setType(m);
	}

	public void digit9(int offset, Material m, Location l, int offsetx, int offsety, int offsetz) {

		Location loc0 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b0 = Bukkit.getServer().getWorld("world").getBlockAt(loc0);
		b0.setType(m);

		Location loc1 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b1 = Bukkit.getServer().getWorld("world").getBlockAt(loc1);
		b1.setType(m);

		Location loc2 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b2 = Bukkit.getServer().getWorld("world").getBlockAt(loc2);
		b2.setType(m);

		Location loc3 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b3 = Bukkit.getServer().getWorld("world").getBlockAt(loc3);
		b3.setType(m);

		Location loc4 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b4 = Bukkit.getServer().getWorld("world").getBlockAt(loc4);
		b4.setType(m);

		Location loc5 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b5 = Bukkit.getServer().getWorld("world").getBlockAt(loc5);
		b5.setType(m);

		Location loc6 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b6 = Bukkit.getServer().getWorld("world").getBlockAt(loc6);
		b6.setType(m);

		Location loc7 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b7 = Bukkit.getServer().getWorld("world").getBlockAt(loc7);
		b7.setType(m);

		Location loc8 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b8 = Bukkit.getServer().getWorld("world").getBlockAt(loc8);
		b8.setType(m);

		Location loc9 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b9 = Bukkit.getServer().getWorld("world").getBlockAt(loc9);
		b9.setType(m);

		Location loc10 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b10 = Bukkit.getServer().getWorld("world").getBlockAt(loc10);
		b10.setType(m);

		Location loc11 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b11 = Bukkit.getServer().getWorld("world").getBlockAt(loc11);
		b11.setType(m);

	}

	public void digit0(int offset, Material m, Location l, int offsetx, int offsety, int offsetz) {

		Location loc0 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b0 = Bukkit.getServer().getWorld("world").getBlockAt(loc0);
		b0.setType(m);

		Location loc1 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b1 = Bukkit.getServer().getWorld("world").getBlockAt(loc1);
		b1.setType(m);

		Location loc2 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b2 = Bukkit.getServer().getWorld("world").getBlockAt(loc2);
		b2.setType(m);

		Location loc3 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b3 = Bukkit.getServer().getWorld("world").getBlockAt(loc3);
		b3.setType(m);

		Location loc4 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b4 = Bukkit.getServer().getWorld("world").getBlockAt(loc4);
		b4.setType(m);

		Location loc5 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b5 = Bukkit.getServer().getWorld("world").getBlockAt(loc5);
		b5.setType(m);

		Location loc6 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 3,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b6 = Bukkit.getServer().getWorld("world").getBlockAt(loc6);
		b6.setType(m);

		Location loc7 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b7 = Bukkit.getServer().getWorld("world").getBlockAt(loc7);
		b7.setType(m);

		Location loc8 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b8 = Bukkit.getServer().getWorld("world").getBlockAt(loc8);
		b8.setType(m);

		Location loc9 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 3 + offset);
		Block b9 = Bukkit.getServer().getWorld("world").getBlockAt(loc9);
		b9.setType(m);

		Location loc10 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 4 + offset);
		Block b10 = Bukkit.getServer().getWorld("world").getBlockAt(loc10);
		b10.setType(m);

		Location loc11 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 5 + offset);
		Block b11 = Bukkit.getServer().getWorld("world").getBlockAt(loc11);
		b11.setType(m);

	}

	public void Time(int hour1, int hour2, int minute1, int minute2, int second1, int second2, Material m, Location l,
			int offsetx, int offsety, int offsetz) {

		// clears the board
		clear(l, offsetx, offsety, offsetz);

		// sets the :
		Location loc0 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 3 + 8);
		Block b0 = Bukkit.getServer().getWorld("world").getBlockAt(loc0);
		b0.setType(m);
		Location loc1 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 3 + 8);
		Block b1 = Bukkit.getServer().getWorld("world").getBlockAt(loc1);
		b1.setType(m);
		Location loc2 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 3 + 8);
		Block b2 = Bukkit.getServer().getWorld("world").getBlockAt(loc2);
		b2.setType(m);
		Location loc3 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 3 + 8);
		Block b3 = Bukkit.getServer().getWorld("world").getBlockAt(loc3);
		b3.setType(m);
		Location loc4 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 1,
				l.getBlockZ() + offsetz + 3 + 18);
		Block b4 = Bukkit.getServer().getWorld("world").getBlockAt(loc4);
		b4.setType(m);
		Location loc5 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 2,
				l.getBlockZ() + offsetz + 3 + 18);
		Block b5 = Bukkit.getServer().getWorld("world").getBlockAt(loc5);
		b5.setType(m);
		Location loc6 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 4,
				l.getBlockZ() + offsetz + 3 + 18);
		Block b6 = Bukkit.getServer().getWorld("world").getBlockAt(loc6);
		b6.setType(m);
		Location loc7 = new Location(l.getWorld(), l.getBlockX() + offsetx, l.getBlockY() + offsety + 5,
				l.getBlockZ() + offsetz + 3 + 18);
		Block b7 = Bukkit.getServer().getWorld("world").getBlockAt(loc7);
		b7.setType(m);

		// fist digit of hour time
		if (hour1 == 1) {
			int offset = 0;
			digit1(offset, m, l, offsetx, offsety, offsetz);
		}
		if (hour1 == 2) {
			int offset = 0;
			digit2(offset, m, l, offsetx, offsety, offsetz);
		}
		if (hour1 == 0) {
			int offset = 0;
			digit0(offset, m, l, offsetx, offsety, offsetz);
		}
		// second digit of hour time
		if (hour2 == 1) {
			int offset = 4;
			digit1(offset, m, l, offsetx, offsety, offsetz);
		}
		if (hour2 == 2) {
			int offset = 4;
			digit2(offset, m, l, offsetx, offsety, offsetz);
		}
		if (hour2 == 3) {
			int offset = 4;
			digit3(offset, m, l, offsetx, offsety, offsetz);
		}
		if (hour2 == 4) {
			int offset = 4;
			digit4(offset, m, l, offsetx, offsety, offsetz);
		}
		if (hour2 == 5) {
			int offset = 4;
			digit5(offset, m, l, offsetx, offsety, offsetz);
		}
		if (hour2 == 6) {
			int offset = 4;
			digit6(offset, m, l, offsetx, offsety, offsetz);
		}
		if (hour2 == 7) {
			int offset = 4;
			digit7(offset, m, l, offsetx, offsety, offsetz);
		}
		if (hour2 == 8) {
			int offset = 4;
			digit8(offset, m, l, offsetx, offsety, offsetz);
		}
		if (hour2 == 9) {
			int offset = 4;
			digit9(offset, m, l, offsetx, offsety, offsetz);
		}
		if (hour2 == 0) {
			int offset = 4;
			digit0(offset, m, l, offsetx, offsety, offsetz);
		}
		// first digit of minute time
		if (minute1 == 1) {
			int offset = 10;
			digit1(offset, m, l, offsetx, offsety, offsetz);
		}
		if (minute1 == 2) {
			int offset = 10;
			digit2(offset, m, l, offsetx, offsety, offsetz);
		}
		if (minute1 == 3) {
			int offset = 10;
			digit3(offset, m, l, offsetx, offsety, offsetz);
		}
		if (minute1 == 4) {
			int offset = 10;
			digit4(offset, m, l, offsetx, offsety, offsetz);
		}
		if (minute1 == 5) {
			int offset = 10;
			digit5(offset, m, l, offsetx, offsety, offsetz);
		}
		if (minute1 == 0) {
			int offset = 10;
			digit0(offset, m, l, offsetx, offsety, offsetz);
		}
		// second digit of minute time
		if (minute2 == 1) {
			int offset = 14;
			digit1(offset, m, l, offsetx, offsety, offsetz);
		}
		if (minute2 == 2) {
			int offset = 14;
			digit2(offset, m, l, offsetx, offsety, offsetz);
		}
		if (minute2 == 3) {
			int offset = 14;
			digit3(offset, m, l, offsetx, offsety, offsetz);
		}
		if (minute2 == 4) {
			int offset = 14;
			digit4(offset, m, l, offsetx, offsety, offsetz);
		}
		if (minute2 == 5) {
			int offset = 14;
			digit5(offset, m, l, offsetx, offsety, offsetz);
		}
		if (minute2 == 6) {
			int offset = 14;
			digit6(offset, m, l, offsetx, offsety, offsetz);
		}
		if (minute2 == 7) {
			int offset = 14;
			digit7(offset, m, l, offsetx, offsety, offsetz);
		}
		if (minute2 == 8) {
			int offset = 14;
			digit8(offset, m, l, offsetx, offsety, offsetz);
		}
		if (minute2 == 9) {
			int offset = 14;
			digit9(offset, m, l, offsetx, offsety, offsetz);
		}
		if (minute2 == 0) {
			int offset = 14;
			digit0(offset, m, l, offsetx, offsety, offsetz);
		}
		// first digit of second time
		if (second1 == 1) {
			int offset = 20;
			digit1(offset, m, l, offsetx, offsety, offsetz);
		}
		if (second1 == 2) {
			int offset = 20;
			digit2(offset, m, l, offsetx, offsety, offsetz);
		}
		if (second1 == 3) {
			int offset = 20;
			digit3(offset, m, l, offsetx, offsety, offsetz);
		}
		if (second1 == 4) {
			int offset = 20;
			digit4(offset, m, l, offsetx, offsety, offsetz);
		}
		if (second1 == 5) {
			int offset = 20;
			digit5(offset, m, l, offsetx, offsety, offsetz);
		}
		if (second1 == 0) {
			int offset = 20;
			digit0(offset, m, l, offsetx, offsety, offsetz);
		}
		// second digit of second time
		if (second2 == 1) {
			int offset = 24;
			digit1(offset, m, l, offsetx, offsety, offsetz);
		}
		if (second2 == 2) {
			int offset = 24;
			digit2(offset, m, l, offsetx, offsety, offsetz);
		}
		if (second2 == 3) {
			int offset = 24;
			digit3(offset, m, l, offsetx, offsety, offsetz);
		}
		if (second2 == 4) {
			int offset = 24;
			digit4(offset, m, l, offsetx, offsety, offsetz);
		}
		if (second2 == 5) {
			int offset = 24;
			digit5(offset, m, l, offsetx, offsety, offsetz);
		}
		if (second2 == 6) {
			int offset = 24;
			digit6(offset, m, l, offsetx, offsety, offsetz);
		}
		if (second2 == 7) {
			int offset = 24;
			digit7(offset, m, l, offsetx, offsety, offsetz);
		}
		if (second2 == 8) {
			int offset = 24;
			digit8(offset, m, l, offsetx, offsety, offsetz);
		}
		if (second2 == 9) {
			int offset = 24;
			digit9(offset, m, l, offsetx, offsety, offsetz);
		}
		if (second2 == 0) {
			int offset = 24;
			digit0(offset, m, l, offsetx, offsety, offsetz);
		}

	}

	public void onEnable() {

		getCommand("clock").setExecutor(new Clock(this));

		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new SignEvent(this), this);

		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {

				if (getConfig().contains("clocks.rtime")) {

					for (String st : getConfig().getConfigurationSection("clocks.rtime").getKeys(false)) {

						Location l = (Location) getConfig().get("clocks.rtime." + st);
						Block b = Bukkit.getServer().getWorld("world").getBlockAt(l);
						if (b.getType() == Material.WALL_SIGN || b.getType() == Material.SIGN_POST) {
							Calendar now = Calendar.getInstance();
							int hour = now.get(Calendar.HOUR_OF_DAY);
							int minute = now.get(Calendar.MINUTE);
							int second = now.get(Calendar.SECOND);
							BlockState bl = b.getState();
							Sign s = (Sign) bl;

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

							s.setLine(0, shourp + hour + ":" + sminutep + minute + ":" + ssecondp + second);
							s.update();
						} else {
							getConfig().set("clocks.rtime." + st, null);
							saveConfig();

							if (Bukkit.getServer().getPlayerExact(st) != null) {
								Player p = Bukkit.getServer().getPlayerExact(st);
								p.sendMessage("clock removed");
							}
						}
					}
				}
				if (getConfig().contains("clocks.alarm")) {

					for (String st : getConfig().getConfigurationSection("clocks.alarm").getKeys(false)) {

						Location l = (Location) getConfig().get("clocks.alarm." + st + ".location");
						Block b = Bukkit.getServer().getWorld("world").getBlockAt(l);
						if (b.getType() == Material.WALL_SIGN || b.getType() == Material.SIGN_POST) {

							BlockState bl = b.getState();
							Sign s = (Sign) bl;

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

							if (s.getLine(1).equalsIgnoreCase(
									shourp + hour + ":" + sminutep + minute + ":" + ssecondp + second)) {
								Bukkit.getPlayerExact(st).sendMessage(
										"alarm: " + getConfig().getString("clocks.alarm." + st + ".message"));

							}

						} else {
							getConfig().set("clocks.alarm." + st, null);
							saveConfig();
							if (Bukkit.getServer().getPlayerExact(st) != null) {
								Player p = Bukkit.getServer().getPlayerExact(st);
								p.sendMessage("alarm removed");
							}
						}
					}
				}
				if (getConfig().contains("clocks.real")) {

					Location l = (Location) getConfig().get("clocks.real.location");
					Block b = Bukkit.getServer().getWorld("world").getBlockAt(l);
					if (b.getType() == Material.WALL_SIGN || b.getType() == Material.SIGN_POST) {

						Calendar now = Calendar.getInstance();
						int hour = now.get(Calendar.HOUR_OF_DAY);
						int minute = now.get(Calendar.MINUTE);
						int second = now.get(Calendar.SECOND);

						// int hour = 18;
						// int minute = 41;
						// int second = 57;

						int hour1 = hour;
						int hour2 = hour;

						int minute1 = minute;
						int minute2 = minute;

						int second1 = second;
						int second2 = second;

						if (!(hour <= 9)) {
							hour2 = hour % 10;
							hour1 = hour / 10;
						} else {
							hour1 = 0;
							hour2 = hour;
						}
						if (minute <= 9) {
							minute1 = 0;
							minute2 = minute;
						} else {
							minute2 = minute % 10;
							minute1 = minute / 10;
						}
						if (second <= 9) {
							second1 = 0;
							second2 = second;
						} else {
							second2 = second % 10;
							second1 = second / 10;
						}

//						Location ll = (Location) getConfig().get("clocks.real.location");
						ItemStack m = getConfig().getItemStack("clocks.real.material");
						int offsetx = getConfig().getInt("clocks.real.offsetx");
						int offsety = getConfig().getInt("clocks.real.offsety");
						int offsetz = getConfig().getInt("clocks.real.offsetz");

						Time(hour1, hour2, minute1, minute2, second1, second2, m.getType(), l, offsetx, offsety,
								offsetz);

					} else {
						
						int offsetx = getConfig().getInt("clocks.real.offsetx");
						int offsety = getConfig().getInt("clocks.real.offsety");
						int offsetz = getConfig().getInt("clocks.real.offsetz");
						
						Location L1 = new Location(l.getWorld(), l.getX() + 1 + offsetx, l.getY() + offsety, l.getZ() + 30 + offsetz);
						Location L2 = new Location(l.getWorld(), l.getX() + offsetx, l.getY() + 6 + offsety, l.getZ() + 2 + offsetz);
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
						getConfig().set("clocks.real", null);
						saveConfig();
						
						
					}
				}
			}
		}, 20, 20);

	}
}
