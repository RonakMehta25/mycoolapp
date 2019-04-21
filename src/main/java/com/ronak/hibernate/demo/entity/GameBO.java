package com.ronak.hibernate.demo.entity;

public class GameBO {
	
	private TeamBO team1;
	
	private ResultBO result;

	public GameBO() {
	}

	public GameBO(TeamBO team1, ResultBO result) {
		this.team1 = team1;
		this.result = result;
	}

	public TeamBO getTeam1() {
		return team1;
	}

	public void setTeam1(TeamBO team1) {
		this.team1 = team1;
	}

	public ResultBO getResult() {
		return result;
	}

	public void setResult(ResultBO result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "GameBO [team1=" + team1 + ", result=" + result + "]";
	}
	
	
	
	
}
