package com.ronak.hibernate.demo.entity;

public class PlayerBO {
	

	private String name;

	public PlayerBO() {
	}

	public PlayerBO(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PlayerBO [name=" + name + "]";
	}
	
	
	

}
