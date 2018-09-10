import java.util.Random;

//Class named RandomWalk
public class RandomWalk {

	// Two-Dimensional array as instance variable with size 3 x 3

	private int[][] board;
	private int totalSteps = 0;
	private int row;
	private int column;
	
	private int [] bugPosition = new int [2];
	int counted = 1;
	int visited = 1;

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

		boolean validbugRow = false;
		boolean validbugColumn = false;
		

		
		
		while (!validbugRow && !validbugColumn )  {
			
			Random gen = new Random();
			
			bugPosition[0] = gen.nextInt(3);
			bugPosition[1] = gen.nextInt(3);
			
			validbugRow = checkMoveBug(bugPosition[0]);
			validbugColumn = checkMoveBug(bugPosition[1]);
			
		}
		totalSteps++;
		
		if(board[bugPosition[0]][bugPosition[1]] != visited) {
			counted++;
			board[bugPosition[0]][bugPosition[1]] = visited;
		}

		// make a while loop
		// need to write and if to check the coordinates
		// if coordinates are good you need to add to totalSteps
		// if coordinates are bad you need to run generator again
	}

	private boolean checkMoveBug(int  bugPosition ) {
		boolean check = false;
		
		if(bugPosition < board.length && bugPosition >= 0) {
			check = true;
		}
		return check;
	}
	
	
	
	// will keep track of totalSteps the bug moves
	public int getTotalSteps() {

		return totalSteps;
	}

	// prints out the 2d array on console
	public void printRoom() {
		//nested for loop that prints out everything in the board
		
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
		System.out.print(board[i][j]);
			}
		System.out.println("");
		}
	}

	// Takes no parameters & runs the simulation
	public void runBug() {
		
		
		int totalSpaces = board.length * board[0].length;
		bugPosition[0] = 1;
		bugPosition[1] = 2;
		
		board[bugPosition[0]][bugPosition[1]] = visited;
		
		while (counted < totalSpaces ) {
			moveBug();
		}
			
		printRoom();
	}
}
