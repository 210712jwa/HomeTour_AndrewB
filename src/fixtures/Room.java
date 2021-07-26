package fixtures;

public class Room extends Fixture {
	
	private Room[] exits;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];
	}
	
	public Room[] getExits() {
		return exits;
	}
		
	public Room getExit(String dir) {
		switch (dir) {
			case "1": return exits[0];
			case "2": return exits[1];
			case "3": return exits[2];
			case "4": return exits[3];
			default:  return null;
		}
	}
	
	public void setExits(Room n, Room e, Room s, Room w) {
		exits[0] = n;
		exits[1] = e;
		exits[2] = s;
		exits[3] = w;
	}
	
}
