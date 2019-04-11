package com.main.pkg;

public class CricketCoach implements Coach{
	FortuneService fortune;
	private int rating;
	@Override
	public int getDailyWorkout() {
		return rating*10*fortune.getDailyFortune();
	}
	public FortuneService getFortune() {
		return fortune;
	}
	public void setFortune(FortuneService fortune) {
		this.fortune = fortune;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
