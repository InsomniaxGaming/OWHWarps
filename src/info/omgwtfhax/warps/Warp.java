package info.omgwtfhax.warps;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Location;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.entity.Player;

public abstract class Warp implements ConfigurationSerializable {
	
	/**Path name for a serialized variable.*/
	public static final String S_CREATOR="creator",S_NAME="name",S_X="location.x",S_Y="location.y",S_Z="location.z",S_WORLD="location.world",S_YAW="location.yaw",S_PITCH="location.pitch";
	
	/**The total number of warps that exist.*/
	private static int WARP_COUNT = 0;
	
	/**The username of the player who created this warp.*/
	private String creator;
	
	/**The name of this warp.*/
	private String name;
	
	/**The location of this warp.*/
	private Location location;
	
	/**The unique ID of this warp. This doesn't need to be saved to config, just generate one during its creation.*/
	private int id;
	
	/**
	 * The base warp class. This class will only contain the information that ALL types of warps share.
	 * */
	public Warp(String name, Player creator)
	{
		this.name 		= name;
		this.creator 	= creator.getName();
		this.location 	= creator.getLocation();
		
		id = WARP_COUNT++;
	}
	
	public String getCreator()
	{
		return creator;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Location getLocation()
	{
		return location;
	}
	
	public int getId()
	{
		return id;
	}
	
	public Map<String, Object> serialize()
	{
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put(S_CREATOR, creator);
		map.put(S_NAME, name);
		map.put(S_WORLD, location.getWorld().getName());
		map.put(S_X, location.getX());
		map.put(S_Y, location.getY());
		map.put(S_Z, location.getZ());
		map.put(S_YAW, location.getYaw());
		map.put(S_PITCH, location.getPitch());
		
		return map;
	}
	
	/**
	 * Returns whether or not the specified player can use this warp.
	 * */
	public abstract boolean isAllowed(Player player);
	
}
