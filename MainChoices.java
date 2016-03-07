package assingment;
import java.util.*;

public class MainChoices {
	Scanner TownChoice = new Scanner(System.in);
	int choice;
	
	public MainChoices(){
		choice = TownChoice.nextInt();
	}
	
	public void TownOptions(){
		if (choice == 1){
			System.out.println("what do you want to do in the bar?");
			System.out.println("type [1] to drink");
			System.out.println("type [2] to start a brawl");
		}
		else if (choice == 2){
			System.out.println("what do you want to do in the arena?");
			System.out.println("type [3] to fight the champion of the arena");
			System.out.println("type [4] to bet on a match");
		}
		else if (choice == 3){
			System.out.println("what do you want to do in the forest?");
			System.out.println("type [5] to hunt animals");
			System.out.println("type [6] to chop wood");
		}
	}
}
