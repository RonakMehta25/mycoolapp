package com.ronak.hibernate.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Team")
public class Team {

	//private ArrayList<Player> players=new ArrayList<Player>(11);
	
	@Column(name="team_name")
	private String teamName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="team_id")
	private int teamId;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="team",cascade={CascadeType.ALL})
	private List<Player> players;

	public Team() {
	}

	public Team( String teamName) {
		this.teamName = teamName;
	}

	
	public Team(String teamName, List<Player> players) {
		this.teamName = teamName;
		this.players = players;
	}

	/*public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	*/
	

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public void addPlayer(Player player)
	{
		if(players==null)
		{
			players=new ArrayList<Player>();
		}
		player.setTeam(this);
		players.add(player);
	}
	
	
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", teamId=" + teamId + ", players=" + players + "]";
	}
	

	
	
}
