package com.ronak.hibernate.demo.entity;

public class ResultBO {

	private String teamWon;
	

	public ResultBO() {
	}

	public ResultBO(String teamWon) {
		this.teamWon = teamWon;
	}

	public String getTeamWon() {
		return teamWon;
	}

	public void setTeamWon(String teamWon) {
		this.teamWon = teamWon;
	}

	@Override
	public String toString() {
		return "ResultBO [teamWon=" + teamWon + "]";
	}

	
	
	
}
