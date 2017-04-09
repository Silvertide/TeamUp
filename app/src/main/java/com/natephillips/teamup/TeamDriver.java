package com.natephillips.teamup;

import java.util.ArrayList;

public class TeamDriver {

	
	public static void test(){
		System.out.println("Running Test");
		Game game = new Game();
		
		game.addPlayer(new Player("Nate"));
		game.addPlayer(new Player("Ashley"));
		game.addPlayer(new Player("Brendan"));
		game.addPlayer(new Player("Riley"));
		game.addPlayer(new Player("Alex"));
		game.addPlayer(new Player("Matt"));
		game.addPlayer(new Player("Justyne"));
		game.addPlayer(new Player("Matt"));
		game.addPlayer(new Player("Cara"));
		game.addPlayer(new Player("Nick"));
		game.addPlayer(new Player("Alyssa"));
		game.addPlayer(new Player("Michelle"));
		

		game.createTeams(4);

		game.printTeams();
		game.getRandomPlayer();
	}

}
