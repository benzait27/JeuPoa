package fr.p10.miage.rps;

import java.util.LinkedList;

public class Player implements Cloneable{

	int score;
	String name;
	public LinkedList<RPSEnum> Mouvement ;
	public Object clone() throws CloneNotSupportedException{ 
		return super.clone(); 
		}
	public Player(String name) {
		super();
		this.name = name;
		Mouvement = new LinkedList<RPSEnum>();
		
		for (int i = 0; i < 10; i++) {
			int a = (int ) (Math.random()*3);
			switch (a) {
			case 0:
				Mouvement.add(RPSEnum.PAPER);
				break;
			case 1:
				Mouvement.add(RPSEnum.ROCK);
				break;
			case 2:
				Mouvement.add(RPSEnum.SCISSORS);
				break;
			default:
				break;
			}
			
		}
	}
	public Player(String name, LinkedList<RPSEnum> mouvement) {
		super();
		this.name = name;
		Mouvement = mouvement;
	}

	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
