package com.main.pkg;

public class BaseballCoach implements Coach{
	FortuneService fortune;
	private int homeruns;
	@Override
	public int getDailyWorkout() {
		return homeruns*4*fortune.getDailyFortune();
	}
	public FortuneService getFortune() {
		return fortune;
	}
	public void setFortune(FortuneService fortune) {
		this.fortune = fortune;
	}
	public int getHomeruns() {
		return homeruns;
	}
	public void setHomeruns(int homeruns) {
		this.homeruns = homeruns;
	}
	
}
