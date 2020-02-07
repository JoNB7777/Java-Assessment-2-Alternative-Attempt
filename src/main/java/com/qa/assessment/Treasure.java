package com.qa.assessment;

public class Treasure {
	private int xCoordinate;
	private int yCoordinate;
	
	public Treasure() {
		double randomXCoordinate = 100*Math.random();
		this.setxCoordinate((int) randomXCoordinate);
		double randomYCoordinate = 100 * Math.random();
		this.setyCoordinate((int) randomYCoordinate);
		}
	
	public int getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public int getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

}
