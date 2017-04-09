package com.natephillips.teamup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TeamFactory {
	
	public static ArrayList<Team> createTeams(ArrayList<Player> players, int numTeams){
		
		ArrayList<Team> teams = new ArrayList<Team>();
		ArrayList<Player> clone = new ArrayList<Player>();

		
		for(int i = 0; i < players.size(); i++){
			clone.add(players.get(i));
		}
		
		for(int i = 1; i <= numTeams; i++){
			teams.add(new Team("Team " + i));
		}
		Collections.shuffle(clone);
		
		for(int i = 0; i < clone.size(); i++){
			teams.get(i % numTeams).addMember(clone.get(i));
		}
		return teams;
		
	}
	
	public static Player getRandomPlayer(ArrayList<Player> players){
		Random gen = new Random();
		return players.get(gen.nextInt(players.size()));
	}
	
}
