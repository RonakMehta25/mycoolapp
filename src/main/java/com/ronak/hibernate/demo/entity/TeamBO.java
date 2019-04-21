package com.ronak.hibernate.demo.entity;

import java.util.List;

public class TeamBO {

	private String teamName;
	
	private List<PlayerBO> playersBO;
	
	
	public TeamBO() {
	}

	public TeamBO(String teamName) {
		this.teamName = teamName;
	}
	
	

	public TeamBO(String teamName, List<PlayerBO> playersBO) {
		this.teamName = teamName;
		this.playersBO = playersBO;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;

	}

	
	
	
	public List<PlayerBO> getPlayersBO() {
		return playersBO;
	}

	public void setPlayersBO(List<PlayerBO> playersBO) {
		this.playersBO = playersBO;
	}

	@Override
	public String toString() {
		return "TeamBO [teamName=" + teamName + ", playersBO=" + playersBO + "]";
	}

	

	
	
}
