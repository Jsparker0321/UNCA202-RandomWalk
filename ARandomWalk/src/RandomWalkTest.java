import java.util.Scanner;

public class RandomWalkTest {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter user name: ");
		String name = userInput.nextLine();
		System.out.println("");
		System.out.println("Welcome, " + name + "!");
		System.out.println("------------------------");

		System.out.println("Bug Map #1: ");
		RandomWalk simulationOne = new RandomWalk();
		simulationOne.runBug();
		System.out.println("It took " + simulationOne.getTotalSteps() + " steps to fill the grid!");
		System.out.println("");
		
		System.out.println("Bug Map #2: ");
		RandomWalk simulationTwo = new RandomWalk();
		simulationTwo.runBug();
		System.out.println("It took " + simulationTwo.getTotalSteps() + " steps to fil the grid!");
		System.out.println("");

		System.out.println("Bug Map #3: ");
		RandomWalk simulationThree = new RandomWalk();
		simulationThree.runBug();
		System.out.println("It took " + simulationThree.getTotalSteps() + " steps to fill the grid!");
		System.out.println("");

		System.out.println("Bug Map #4: ");
		RandomWalk simulationFour = new RandomWalk();
		simulationFour.runBug();
		System.out.println("It took " + simulationFour.getTotalSteps() + " steps to fill the grid!");
		System.out.println("");
		
		
		
		System.out.print("Would you like to simulate another map? ");
		String answer = userInput.nextLine();
		if( answer.equals("yes")) {
			System.out.println("Bug Map #5: ");
			RandomWalk simulationFive = new RandomWalk();
			simulationFive.runBug();
			System.out.println("It took " + simulationFive.getTotalSteps() + " steps to fill the grid!");
			System.out.println("");
		}else {
			System.out.println("Goodbye!");
		}
		
	}

}
