/*
 * Main method. So much more stuff can be implemented, such as items, inventory, maybe a health bar. Come back for practice
 */

package game;

import java.util.Scanner;

import fixtures.Room;


public class Main {
	
	private static boolean running = true;
	// Main method
	public static void main(String[] args) throws InterruptedException {
		Player p1 = new Player();
		Room[] roomCount = RoomManager.init();
		
		Initialize(); // just a simple starter message 
		
		p1.setCurrentRoom(roomCount[0]);
		if(p1.getIndex() == 0) {
		
		System.out.println(p1.getCurrentRoom().longDescription);
		}
		
		
		// while the program runs, take in user input to detect a door color and set it all toUpperCase so it
		// doesn't matter if the word is all lowercase or not
		while (running) {
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			String[]command = input.split("\\s+");
			
			switch(input.toUpperCase()) {
			case "PURPLE":
				p1.setCurrentRoom(roomCount[1]);
				System.out.println(p1.getCurrentRoom().longDescription);
				break;
			case "LIME GREEN":
				p1.setCurrentRoom(roomCount[2]);
				System.out.println(p1.getCurrentRoom().longDescription);
				break;
			case "CYAN":
				p1.setCurrentRoom(roomCount[3]);
				System.out.println(p1.getCurrentRoom().longDescription);
				break;
			case "YELLOW":
				p1.setCurrentRoom(roomCount[4]);
				System.out.println(p1.getCurrentRoom().longDescription);
				break;
			case "LOCATION":
				System.out.println(p1.getCurrentRoom().name);  
				break;
			case "END":
				GameEnd();
				running = false;
				
			
			}

		// After the game ends...
		if (!running) {
			System.out.println("Thanks for playing");
		}}
	}



/* could not get parse to work in time. Come back to this
	public static void parse(String[] command, Player p1) {
		Scanner scan = new Scanner(System.in);
		
		
		String input = scan.nextLine();
		command = input.split("\\s+");
		
		}
	*/
		
		
	
	// Just a simple start to introduce the game
	public static void Initialize() {
		
		System.out.println("TEXT BASED ADVENTURE\n" + "Once all doors are completed, type END\n" +
							"If you forget where you are, type LOCATION\n\n" +
							"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	}
	
	// Simple ending
	public static void GameEnd() { 
		
		System.out.println("You have explored all of the rooms, each room having a seperate purpose\n" +
							"But you're still not sure where you are or why you are here.\n" +
							"Then a voice comes over the intercom that you didn't know existed. It's a robot\n" +
							"She says -Thank you for your work today Test Subject #2345, see you again for more tests tomorrow\n"+
							"You are a test subject for robots\n");
		
	}
		
	
}
