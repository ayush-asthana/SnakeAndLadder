package com.tavant.ayush;

import java.util.HashMap;

public class SnakesAndLadderPosition {

	private HashMap<Integer, Integer> snakeAndLadder = new HashMap<>();

	public SnakesAndLadderPosition() {
		// snake Positions on Board
		snakeAndLadder.put(16, 6);
		snakeAndLadder.put(46, 25);
		snakeAndLadder.put(49, 11);
		snakeAndLadder.put(62, 19);
		snakeAndLadder.put(74, 53);
		snakeAndLadder.put(89, 68);
		snakeAndLadder.put(95, 75);
		snakeAndLadder.put(99, 80);
		// Ladder Positions on Board
		snakeAndLadder.put(7, 14);
		snakeAndLadder.put(8, 31);
		snakeAndLadder.put(21, 42);
		snakeAndLadder.put(36, 44);
		snakeAndLadder.put(51, 67);
		snakeAndLadder.put(71, 91);
		snakeAndLadder.put(78, 98);
		snakeAndLadder.put(87, 94);
	}

	public int climbUpOrSlideDown(int number) {
		if (snakeAndLadder.containsKey(number))
			return snakeAndLadder.get(number);
		return 0;
	}
	
	public boolean findSnake(int number) {
		if(snakeAndLadder.containsKey(number) && snakeAndLadder.get(number) > number)
			return false;
		return true;
	}

}
