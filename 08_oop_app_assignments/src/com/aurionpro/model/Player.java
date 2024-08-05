package com.aurionpro.model;

public class Player {
	private int playerId;
	private String name;
	private int matches;
	private int runs;
	private int wickets;

	public Player(int playerId, String name, int matches, int runs, int wickets) {

		this.playerId = playerId;
		this.name = name;
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public double calculateAverage() {
		double average;
		if (matches == 0) {
			average = 0.0;
		} else
			average = runs / matches;
		return average;
	}

}
