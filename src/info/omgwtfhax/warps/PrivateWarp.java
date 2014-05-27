package info.omgwtfhax.warps;

import java.util.List;
import java.util.Map;

import org.bukkit.entity.Player;

public class PrivateWarp extends Warp{
	
	/**A list of the usernames of people allowed to use this warp.*/
	private List<String> allowed;

	public PrivateWarp(String name, Player creator)
	{
		super(name, creator);
	}
	
	public List<String> getAllowedPlayers()
	{
		return allowed;
	}
	
	public void addPlayer(Player player)
	{
		//TODO add this player's username to the list of allowed users
	}
	
	public void removePlayer(Player player)
	{
		//TODO remove this player's username from the list of allowed users
	}

	@Override
	public boolean isAllowed(Player player)
	{
		// TODO Check if player is in this warp's player list
		return false;
	}
	
	@Override
	public Map<String, Object> serialize()
	{
		Map<String, Object> map = super.serialize();
		
		//TODO add PrivateWarp's relevant variables to the map variable.
		
		return map;
	}

}
