package com.qa.assessment;

public class Runner {

	public static void main(String[] args) {
		boolean treasureNotFound = true;
		Player player = new Player();
		Treasure treasure = new Treasure();
		if (player.getxCoordinate() == treasure.getxCoordinate() && player.getyCoordinate() == treasure.getyCoordinate()) {
			treasureNotFound = false;
		}
		System.out.println("Grey foggy clouds float oppressively close to you, \r\n" + 
				"reflected in the murky grey water which reaches up your shins.\r\n" + 
				"Some black plants barely poke out of the shallow water.\r\n" +  
				"You notice a small watch-like device in your left hand.  \r\n" + 
				"It has hands like a watch, but the hands don't seem to tell time.\r\n" + 
				"Press n to go north, w to go west, s to go south or e to go east.");
		while (treasureNotFound) {
			System.out.println("Please enter the direction in which you want to go (n, w, s or e) ");
			System.out.println(Utils.input());
			if (Utils.input().equals("n")) {
				player.setyCoordinate(player.getyCoordinate() + 1);
			} else if (Utils.input().equals("w")) {
				player.setxCoordinate(player.getxCoordinate() - 1);
			} else if (Utils.input().equals("s")) {
				player.setyCoordinate(player.getyCoordinate() - 1);
			} else if (Utils.input().equals("e")) {
				player.setxCoordinate(player.getxCoordinate() + 1);
			} else {
				System.out.println("Please enter a valid direction");
			}
			if (player.getxCoordinate() != treasure.getxCoordinate() || player.getyCoordinate() != treasure.getyCoordinate()) {
				int xCoordinatesDistance = player.getxCoordinate() - treasure.getxCoordinate();
				int yCoordinatesDistance = treasure.getyCoordinate() - player.getyCoordinate();
				double distance = Math.sqrt((xCoordinatesDistance)^2 + (yCoordinatesDistance)^2);
				System.out.println("Distance from treasure is: " + distance);
			} else {
				System.out.println("You found the treasure");
				treasureNotFound = false;
			}
			
		}

	}

}
