
//Jessica Parker
//9-10-18
//CSCI 202
//Project #1: A Random Walk

import java.util.Random;

public class RandomWalk {

	private int[][] board;
	private int totalSteps = 0;
	private int row;
	private int column;

	private int[] bugPosition = new int[2];
	int counted = 1;
	int visited = 1;

	public RandomWalk(int row, int column) {

		board = new int[row][column];

		this.row = row;
		this.column = column;

	}

	public RandomWalk() {

		board = new int[3][3];

	}

	private void moveBug() {

		boolean validbugRow = false;
		boolean validbugColumn = false;

		while (!validbugRow && !validbugColumn) {

			Random gen = new Random();

			bugPosition[0] = gen.nextInt(3);
			bugPosition[1] = gen.nextInt(3);

			validbugRow = checkMoveBug(bugPosition[0]);
			validbugColumn = checkMoveBug(bugPosition[1]);

		}
		totalSteps++;

		if (board[bugPosition[0]][bugPosition[1]] != visited) {
			counted++;
			board[bugPosition[0]][bugPosition[1]] = visited;
		}

	}

	private boolean checkMoveBug(int bugPosition) {
		boolean check = false;

		if (bugPosition < board.length && bugPosition >= 0) {
			check = true;
		}
		return check;
	}

	public int getTotalSteps() {

		return totalSteps;
	}

	public void printRoom() {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println("");
		}
	}

	public void runBug() {

		int totalSpaces = board.length * board[0].length;
		bugPosition[0] = 1;
		bugPosition[1] = 2;

		board[bugPosition[0]][bugPosition[1]] = visited;

		while (counted < totalSpaces) {
			moveBug();
		}

		printRoom();
	}
}
