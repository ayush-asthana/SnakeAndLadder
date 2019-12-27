package com.tavant.ayush;

public class PlayGame {

	private String playerName;
	private int playerPosition;
	private int computerPosition;

	Board board = new Board();
	Dice dice = new Dice();
	Player player = new Player("Ayush");
	SnakesAndLadderPosition snakesAndLadderPosition = new SnakesAndLadderPosition();

	public PlayGame() {
		this.playerPosition = 0;
		this.computerPosition = 0;
		this.playerName = player.getPlayerName();

	}

	public void printWinner(String name) {
		System.out.println("Congratulations! " + name + " is Winner.\nGame Over!");
		System.exit(0);
	}

	public void checkLadderOrSnake(int position, String name) {
		if (snakesAndLadderPosition.findSnake(position))
			System.out.println(name + " is bitten by Snake.");
		else
			System.out.println(name + " climbs up the ladder!");
	}

	public int movePlayer(int boardPosition, String playerName) {

		if (boardPosition == 100) {
			printWinner(playerName);
		} else {
			int newPosition = snakesAndLadderPosition.climbUpOrSlideDown(boardPosition);
			if (newPosition != 0) {
				checkLadderOrSnake(boardPosition, playerName);
				boardPosition = newPosition;
			}
			System.out.println(playerName + " is at " + boardPosition + ".\n\n");
		}
		return boardPosition;
	}

	public void startGame() {
		while (playerPosition <= 100 && computerPosition <= 100){

			int playerThrow = dice.rollDice();
			System.out.println(playerName + "'s Turn\n" + playerName + " Throws: " + playerThrow);
			playerPosition += playerThrow;
			if (playerPosition > 100) {
				System.out.println("Dice Throw is "+(playerPosition-100)+" more you cannot proceed.");
				playerPosition -= playerThrow;
				System.out.println(playerName+" is at "+playerPosition+"\n\n");
			}
			else
				playerPosition=movePlayer(playerPosition, playerName);
			
			int computerThrow = dice.rollDice();
			System.out.println("Computer's Turn.\nComputer's Throw : " + computerThrow);
			computerPosition += computerThrow;
			if (computerPosition > 100) {
				System.out.println("Dice Throw is "+(computerPosition-100)+" more you cannot proceed.");
				computerPosition -=computerThrow;
				System.out.println("Computer is at "+ computerPosition+"\n\n");
			}
			else
				computerPosition=movePlayer(computerPosition, "Computer");
		}
	}
}
