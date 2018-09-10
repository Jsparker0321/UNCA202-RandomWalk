
public class RandomWalkTest {

	public static void main(String[] args) {
	

		RandomWalk simulationOne = new RandomWalk();
		
			simulationOne.runBug();
			System.out.println(simulationOne.getTotalSteps());
			
		
			
		
		RandomWalk simulationTwo = new RandomWalk();
		
			simulationTwo.runBug();
			System.out.println(simulationTwo.getTotalSteps());
		
		RandomWalk simulationThree = new RandomWalk();
		
			simulationThree.runBug();
			System.out.println(simulationThree.getTotalSteps());
		
		RandomWalk simulationFour = new RandomWalk();
		
			simulationFour.runBug();
			System.out.println(simulationFour.getTotalSteps());
	}

}
