package game;

import java.util.Scanner;

public class Main {
	
	static String userInput;
	static Scanner scan = new Scanner(System.in);
	static RoomManager roomManager = new RoomManager();
	
	public static void main(String[] args) {
		
		Boolean active = true;
		roomManager.init();
		Player player = new Player(roomManager.startingRoom);

		printRoom(player);
		
		// Primary loop.
		while(active == true) {
			userInput = scan.nextLine();
			if (player.getCurrentRoom().getExit(userInput) != null) {
				player.currentRoom = player.getCurrentRoom().getExit(userInput);
				printRoom(player);
			} else {
				System.out.println("Not a valid direction. \n");
			}
		}

	}
	
	// Print room info and available directions of travel.
	private static void printRoom(Player player) {

		System.out.println(player.getCurrentRoom().name);
		System.out.println(player.getCurrentRoom().longDescription);

		System.out.println("Enter one of the numbers below to travel.");

		if(player.getCurrentRoom().getExit("1") != null)
			System.out.println("1 -> North");
		if(player.getCurrentRoom().getExit("2") != null)
			System.out.println("2 -> East");
		if(player.getCurrentRoom().getExit("3") != null)
			System.out.println("3 -> South");
		if(player.getCurrentRoom().getExit("4") != null)
			System.out.println("4 -> West");

	}

}