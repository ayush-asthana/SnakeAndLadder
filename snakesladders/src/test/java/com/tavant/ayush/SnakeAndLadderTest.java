package com.tavant.ayush;

import static org.junit.Assert.*;
import org.junit.Test;

public class SnakeAndLadderTest {

	@Test
	public void testDiceRangeBetweenOneAndSixFor100Rolls() {
		Dice dice = new Dice();
		for (int i = 0; i < 100; i++) {
			int actual = dice.rollDice();
			assertTrue(0 < actual && actual <= 6);
		}
	}

	@Test
	public void testSnakeOnPositionSeventyFour() {
		SnakesAndLadderPosition snakesAndLadderPosition = new SnakesAndLadderPosition();
		int actual = snakesAndLadderPosition.climbUpOrSlideDown(74);
		int expected = 53;
		assertEquals(expected, actual);
	}

	@Test
	public void testLadderPositionOnFiftyOne() {
		SnakesAndLadderPosition snakesAndLadderPosition = new SnakesAndLadderPosition();
		int actual = snakesAndLadderPosition.climbUpOrSlideDown(51);
		int expected = 67;
		assertEquals(expected, actual);
	}

	@Test
	public void testLadderOrSnakePositionWhichDoesNotExist() {
		SnakesAndLadderPosition snakesAndLadderPosition = new SnakesAndLadderPosition();
		int actual = snakesAndLadderPosition.climbUpOrSlideDown(52);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void testFindSnakeAtPositionSixtyEight() {
		SnakesAndLadderPosition snakesAndLadderPosition = new SnakesAndLadderPosition();
		boolean actual = snakesAndLadderPosition.findSnake(68);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPlayerName() {
		Player player = new Player("ayush");
		String actual = player.getPlayerName();
		String expected = "ayush";
		assertEquals(expected, actual);
	}

	@Test
	public void testIfPlayerLandsAtLadderThenClimbing() {
		PlayGame playGame = new PlayGame();
		int actual = playGame.movePlayer(78, "Computer");
		int expected = 98;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIfPlayerLandsAtSnakeThenSliding() {
		PlayGame playGame = new PlayGame();
		int actual = playGame.movePlayer(62, "Computer");
		int expected = 19;
		assertEquals(expected, actual);
	}


}
