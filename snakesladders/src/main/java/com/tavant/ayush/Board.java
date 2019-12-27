package com.tavant.ayush;

public class Board {
	private int counter = 100;
	private int iteration = -1;

	public Board() {
		getBoard();

	}

	public void getBoard() {
		while (counter > 0) {
			if (counter % 10 == 0 && counter != 100) {
				if (iteration == -1) {
					counter -= 9;
					iteration = 1;
				} else {
					System.out.print(counter + "\t");
					counter -= 10;
					iteration = -1;
				}
				if (counter != 0)
					System.out.print("\n" + counter + "\t");
			} else
				System.out.print(counter + "\t");
			counter += iteration;
		}
		System.out.println();
	}
}
