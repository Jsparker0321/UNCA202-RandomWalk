import java.util.Random;

//Class named RandomWalk
public class RandomWalk {

	// Two-Dimensional array as instance variable with size 3 x 3

	private int[][] board;
	private int totalSteps = 0;
	private int row;
	private int column;

	
	// RandomWalk constructor with two arguments representing dimensions of the room
	public RandomWalk(int row, int column) {

		board = new int[row][column];

		 this.row = row;
		 this.column = column;

	}

	// Default Constructor with no arguments & initializes the size of room
	public RandomWalk() {

		board = new int[3][3];

	}

	

	// Generates the next move for the bug
	private void moveBug() {

		Random gen = new Random();
		int row = 0;
		int column = 0;
		

		if (board[row][column] == board[row][column]) {
			row = gen.nextInt(3) - 1;
			column = gen.nextInt(3) - 1;
		} else if (board[row][column] > board.length) {
			row = gen.nextInt(3) - 1;
			column = gen.nextInt(3) - 1;
		} else {
			totalSteps++;
		}

		// need to write and if to check the coordinates
		// if coordinates are good you need to add to totalSteps
		// if coordinates are bad you need to run generator again
	}

	// will keep track of totalSteps the bug moves
	public int getTotalSteps() {

		return totalSteps;
	}

	// prints out the 2d array on console
	public void printRoom() {

		System.out.println(board);
		
	}
	
	// Takes no parameters & runs the simulation
		public void runBug() {
			
			 moveBug();
			 printRoom();
		}
}
