package info.omgwtfhax.warps;

import java.util.Map;

import org.bukkit.entity.Player;

public class PublicWarp extends Warp{

	public PublicWarp(String name, Player creator) {
		super(name, creator);
	}

	@Override
	public boolean isAllowed(Player player) {
		//TODO return whether the player has permissions for this node or not.
		return false;
	}

	@Override
	public Map<String, Object> serialize() {
		Map<String, Object> map = super.serialize();
		
		//TODO add PublicWarp's relevant variables to the map variable.
		
		return map;
	}

}
