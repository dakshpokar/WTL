package com.main.pkg;

import java.util.Random;

public class FortuneService implements Fortune {
	@Override
	public int getDailyFortune() {
		Random rand = new Random();
		return rand.nextInt(100);
	}

}
