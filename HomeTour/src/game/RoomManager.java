package game;
import fixtures.Room;

public class RoomManager {
	
	/*
	 * All of the rooms in the home
	 */

	public static Room[] init() {
		Room[] roomCount = new Room[5];
		
		Room startRoom = new Room("Begin",
				"You open your eyes to a room you have never seen before",
				"You awaken in a widely illuminated room\n" +
				"You get to your feet onto the white tiles that now glow rainbow as you step\n" +
				"on them. You hop on a few because why not, but then you decide to look more deeply\n" +
				"at your surroundings. You notice there are four neon doors in front of you side by side.\n" +
				"The doors are different colors: Purple, Yellow, Lime Green, and Cyan\n" +
				"With no memory of how you got here or what 'here' even is, you need to progress somehow\n"+
				"So, which door will you open?");
				
		roomCount[0] = startRoom;
		
		Room Purple = new Room("Purple", "Seems to be quite the artistic room\n", 
				 "You decided to go through the purple door. The floors are a glossy black marble" + "\n" +
				 "The walls are covered in art, mostly geometric patterns where all of the lines that" + "\n" +
				 "make up the shapes are glowing in purple neon. You imagine the electricity bill for this area, shudder at the thought, then" + "\n" +
				 "proceed to stare at the art on the walls, admiring it. Out of nowhere, all of the neon purple in the art flashes in a small array of color" + "\n" +
				 "You get the feeling to leave the area, like there is something else to experience here. Where will you go now?");
		
		roomCount[1] = Purple;
		
		Room LGreen = new Room("Lime Green" + "\n", "A room of nature" + "\n",
				"You decided to go through the lime green door. The entirety of the walls are a screen, displaying a beautiful video scenery of a forest" + "\n" +
				"You can hear birds, probably through some unseen speakers somewhere. The floor is also a screen displaying grass. Although the scenery is digital" + "\n" +
				"you begin to enjoy it, almost as if you haven't been in a place the screen presents in awhile. You feel calm but uneasy and decide that it is time to move on" + "\n" +
				"Question is, where to go now?");
		
		roomCount[2] = LGreen;
		
		Room Cyan = new Room("Cyan" + "\n", "Energetic yet calm" + "\n",
					"You decided to go through the cyan door. It's the smallest room. There is a computer on a desk in the middle of the room with a cyan chair. You decide to sit." + "\n" +
					"The room lights up bright cyan and the computer turns itself on. You see there are tasks on the computer to be done and you look through the list. The list names each room." + "\n" +
					"Not just that, it shows how much time you spent in each room, including a live timer for the cyan room. Are you being watched? Why?" + "\n" +
					"You look at the timer, which displays an overall timer spent in all rooms: 4 years, 5 months, 1 week. You have been here before...you live here..but for what purpose?" + "\n" +
					"You feel weirded out, rightly so. The only way to figure it out is to progress. So, where to next?");
		
		roomCount[3] = Cyan;
		
		Room Yellow = new Room("Yellow" + "\n", "Lively" + "\n",
				"You decided to go through the yellow door. There is workout equipment there: stationary bike, weight bench, and row machine. The room is energetic, almost more than you can handle." + "\n" +
				"The room is booming with fast paced music, the walls slowly fading in and out of a bright electric yellow. You get on the bike, use it for a bit, to which the wall displays a timer," + "\n" +
				"alongside a leaderboard. Every entry on the leaderboard has the same initials, with different runtimes. You realize they have the same initials as you...or is that you?" + "\n" +
				"The room gives more energy than you can take at the moment, so you decide to leave. Where do you go?");
		
		roomCount[4] = Yellow;
		
		return roomCount;
		
	
	}

	// Find a single room...
	//public Room getRoom(int index) {
	//	return this.getRoom(index);
	//	}

	/*
	 * Used to find a specific room using the room's name
	 */
	public Room getRoom(String roomName) {
		
		return this.getRoom(roomName) ;
	}

	
	

}
