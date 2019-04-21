package com.ronak.springboot.demo.mycoolapp.rest;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ronak.hibernate.demo.entity.Player;

@RestController
public class PlayerController {

	@PostMapping("/ipl/player")
	public void addPlayerToTeam(@RequestBody ArrayList<Player> teamplayers)
	{
		for(Player player:teamplayers)
		{
			
		}
	}
}
