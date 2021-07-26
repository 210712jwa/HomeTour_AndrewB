package game;

import fixtures.*;

public class RoomManager {
	
	public Room startingRoom;
	private Room[] rooms = new Room[7];

	public void init() {
		
		Room diningRoom = new Room(
			"Dining Room",
			"the dining room",
			"An elaborate dining room capable of easily seating two families."
			);
		this.rooms[0] = diningRoom;
		
		Room smallHall = new Room(
			"Small Hall",
			"a small hall",
			"A small hallway with a collection of oil paintings decorating the walls."	
			);
		this.rooms[1] = smallHall;
		
		Room entryWay = new Room(
			"Entry Way",
			"a large entry way",
			"This is the home's main entry way. The floor is made of marble, with three doors leading away."
			);
		this.rooms[2] = entryWay;
		this.startingRoom = entryWay;

		Room garage = new Room(
			"Garage",
			"a two-car garage",
			"You find yourself in the house's garage, with space for a couple of cars and further storage."
			);
		this.rooms[3] = garage;

		Room familyRoom = new Room(
			"Family Room",
			"a large family room",
			"In this large family room is a sofa, a recliner, and an entertainment center with an extraorinarily large TV."
			);
		this.rooms[4] = familyRoom;
		
		Room largeHall = new Room(
			"Large Hall",
			"a large hall",
			"A large hall with windows on the side closest to the garage, displaying an elaborate garden outside."
			);
		this.rooms[5] = largeHall;

		Room bedRoom = new Room(
			"Bedroom",
			"a modest bedroom",
			"You find yourself in a surprisingly small bedroom, with a queen bed and a series of drawers nearby."
			);
		this.rooms[6] = bedRoom;
		
		diningRoom.setExits(null, smallHall, null, null);
		smallHall.setExits(null, entryWay, familyRoom, diningRoom);
		entryWay.setExits(null, garage, largeHall, smallHall);
		garage.setExits(null, null, null, entryWay);
		familyRoom.setExits(smallHall, largeHall, null, null);
		largeHall.setExits(entryWay, null, bedRoom, familyRoom);
		bedRoom.setExits(largeHall, null, null, null);

	}
	
}
