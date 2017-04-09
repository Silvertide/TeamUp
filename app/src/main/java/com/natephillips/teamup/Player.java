package com.natephillips.teamup;

import java.util.concurrent.atomic.AtomicInteger;

public class Player {

	private static final AtomicInteger count = new AtomicInteger(0);
	private String name;
	private final int playerID;
	
	public Player(String name){
		this.name = name;
		playerID = count.incrementAndGet();
	}
	
	public String getName(){
		return name;
	}
	
	public int getID(){
		return playerID;
	}
	
	public String toString(){
		return playerID + " - " + this.name;
	}
	
}
