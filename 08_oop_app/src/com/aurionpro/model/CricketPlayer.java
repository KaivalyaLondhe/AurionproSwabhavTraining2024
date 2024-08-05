package com.aurionpro.model;

public class CricketPlayer {
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int numberOfWickets;
	
	public CricketPlayer(){
		this.playerId = 10;
		this.name = "Player";
		this.numberOfMatches = 5;
		this.runs = 200;
		this.numberOfWickets = 3;
	}
	
	public CricketPlayer(int playerId, String name, int numberOfMatches, int runs, int numberOfWickets){
		if(playerId <0) {
			System.err.println("Player ID cannot be negative");
		}else
		this.playerId = playerId;
		
		this.name = name;
		
		if(numberOfMatches <0) {
			System.err.println("Number of Matches cannot be negative");
		}else
			this.numberOfMatches = numberOfMatches;
		
		if(runs <0) {
			System.err.println("Runs cannot be negative");
		}else
		this.runs = runs;
		
		if(numberOfWickets <0) {
			System.err.println("Number of Wickets cannot be negative");
		}else
		this.numberOfWickets = numberOfWickets;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		if(playerId <0) {
			System.err.println("Player ID cannot be negative");
		}else
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		if(numberOfMatches <0) {
			System.err.println("Number of Matches cannot be negative");
		}else
			this.numberOfMatches = numberOfMatches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		if(runs <0) {
			System.err.println("Runs cannot be negative");
		}else
		this.runs = runs;
	}

	public int getNumberOfWickets() {
		return numberOfWickets;
	}

	public void setNumberOfWickets(int numberOfWickets) {
		if(numberOfWickets <0) {
			System.err.println("Number of Wickets cannot be negative");
		}else
		this.numberOfWickets = numberOfWickets;
	}
	
	public void calculateAverage() {
		double average = this.runs/this.numberOfMatches;
		System.out.println("The average of the player is " + average);
	}
	public void display() {
		System.out.println("Player ID: " + this.playerId);
		System.out.println("Name: " + this.name);
		System.out.println("Number of Matches: " + this.numberOfMatches);
		System.out.println("Runs: " + this.runs);
		System.out.println("Number of Wickets: " + this.numberOfWickets);

	}
}
