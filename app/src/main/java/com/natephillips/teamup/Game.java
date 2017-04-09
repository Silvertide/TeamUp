package com.natephillips.teamup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Game {

	private ArrayList<Team> teams;
	private ArrayList<Player> players;
	private Random gen = new Random();
	
	public Game(){
		players = new ArrayList<Player>();
		teams = new ArrayList<Team>();
	}
	
	public Game(ArrayList<Player> players){
		this.players = players;
		teams = new ArrayList<Team>();	
	}
	
	public void addPlayer(Player p){
		players.add(p);
	}
	
	public void createTeams(int numTeams){
		
		teams = TeamFactory.createTeams(players, numTeams);
		
	}
	
	public void getRandomPlayer(){
		System.out.println(TeamFactory.getRandomPlayer(players));
	}
	
	public boolean teamsCreated(){
		
		if(teams == null || teams.size() == 0){
			return false;
		}
		else{
			return true;
		}
		
	}
	
	public void printTeams(){
		
		if(!teamsCreated()){
			System.out.println("No teams have been created.");
		}
		else{
			for (Team t : teams){
				System.out.println(t);
			}
		}
		
	}

	
}
