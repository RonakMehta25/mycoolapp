package com.ronak.hibernate.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Game")
public class Game {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="game_id")
	private int gameId;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="team_id")
	private Team team1;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="result_id")
	private Result result;

	public Game() {
	}

	public Game(Team team1, Result result) {
		this.team1 = team1;
		this.result = result;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}


	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Game [gameId=" + gameId + ", team1=" + team1 + ", result=" + result + "]";
	}

	
	

}
