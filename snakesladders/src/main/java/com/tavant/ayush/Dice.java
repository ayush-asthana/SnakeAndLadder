package com.tavant.ayush;

import java.util.Random;

public class Dice {
	private int diceNumber;

	public Dice() {
		this.diceNumber = 1;
	}

	public int rollDice() {
		Random random = new Random();
		this.diceNumber = random.nextInt(7);
		return (this.diceNumber == 0 ? 1 : diceNumber);
	}
}
