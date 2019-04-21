package com.ronak.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="Result")
public class Result {

	@Column(name="team_won")
	private String teamWon;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="result_id")
	private int resultId;

	public Result() {
	}

	public Result(String teamWon) {
		this.teamWon = teamWon;
	}
	
	public Result(int resultId,String teamWon) {
		this.resultId=resultId;
		this.teamWon = teamWon;
	}

	public String getTeamWon() {
		return teamWon;
	}

	public void setTeamWon(String teamWon) {
		this.teamWon = teamWon;
	}

	public int getResultId() {
		return resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	
	
	
	
}
