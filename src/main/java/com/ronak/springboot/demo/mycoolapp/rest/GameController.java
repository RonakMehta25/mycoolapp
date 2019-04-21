package com.ronak.springboot.demo.mycoolapp.rest;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ronak.hibernate.demo.entity.Game;
import com.ronak.hibernate.demo.entity.GameBO;
import com.ronak.hibernate.demo.entity.Player;
import com.ronak.hibernate.demo.entity.PlayerBO;
import com.ronak.hibernate.demo.entity.Result;
import com.ronak.hibernate.demo.entity.Team;

@RestController
public class GameController {

	
	@PostMapping("/ipl/game")
	public void addGames(@RequestBody ArrayList<GameBO> gamesBO)
	{
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Game.class).addAnnotatedClass(Result.class).addAnnotatedClass(Team.class).addAnnotatedClass(Player.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		for(GameBO gameBO:gamesBO)
		{
			System.out.println("gameBO="+gameBO);
			
			
			try {
				
				Result result=new Result(gameBO.getResult().getTeamWon());
				
				
				Team team=new Team(gameBO.getTeam1().getTeamName());
				
				for(PlayerBO playerbo:gameBO.getTeam1().getPlayersBO())
				{
					Player player=new Player(playerbo.getName());
					team.addPlayer(player);
				}
				
				Game game=new Game(team,result);
				session.beginTransaction();
				System.out.println("Saving");
				session.save(game);
				System.out.println("Saved = "+game);
				
				session.getTransaction().commit();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			
			
			
		}
		factory.close();
	}
	
	@GetMapping("/ipl/game/{gameId}")
	public GameBO getGames(@PathVariable int gameId)
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Game.class).addAnnotatedClass(Result.class).addAnnotatedClass(Team.class).addAnnotatedClass(Player.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {

			session.beginTransaction();
			System.out.println("Getting the game with id="+gameId);
			Game game=(Game) session.get(Game.class, gameId);
			session.getTransaction().commit();
			System.out.println("Got="+game);
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		factory.close();
		return null;
	}
	
	
}
