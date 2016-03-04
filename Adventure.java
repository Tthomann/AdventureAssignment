package assingment;
import java.util.Scanner;
public class Adventure {

	public static void main(String[] args) {
		
		System.out.println("welcome brave traveler");
		System.out.println("-----------------------");
		System.out.println("you arrive in a town of foreigners, what do you do?");
		System.out.println("-----------------------");
		System.out.println("type [1] to go to the local inn");
		System.out.println("type [2] to go to the arena");
		System.out.println("type [3] to leave the town and adventure into the forest");
	
		Scanner userInput = new Scanner(System.in);
		int choice = userInput.nextInt();
		
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
		
		switch(userInput.nextInt()){
		case 1:
			System.out.println("you drink until you can't drinks no more");
			System.out.println("you start to feel reaaaaaallly dizzy and");
			System.out.println("begin to throw up. You embaress yourself. Good Job.");
			System.out.println("Game End.");
			break;
		case 2:
			System.out.println("you fight a random person in the inn");
			System.out.println("and you brutally slam his face into");
			System.out.println("his own beer mug. Everyone declares you a true OG");
			System.out.println("you've been arrested for public badassery.");
			System.out.println("Game End.");
			break;
		case 3:
			System.out.println("you enter the arena fully armored");
			System.out.println("the champion charges and impales you with his");
			System.out.println("broadsword. Thats unforturnate.");
			System.out.println("YOU DIED");
			System.out.println("Game End.");
			break;
		case 4:
			System.out.println("you bet on the next match between a large man and a skinny man");
			System.out.println("you bet on the large man to win");
			System.out.println("the large man trips and decapitates himself on accident");
			System.out.println("you lose 10 gil");
			System.out.println("Game End.");
			break;
		case 5:
			System.out.println("you spot a bunny and decide to strangle it with your mighty hands");
			System.out.println("the bunny animorphs into a person and slaps you");
			System.out.println("the bunny person shouts [that was a naughty thing to do! I hate you!]");
			System.out.println("the bunny person walks away.");
			System.out.println("Game End.");
			break;
		case 6:
			System.out.println("you begin to chop wood like crazy");
			System.out.println("during the chopping you slip with your axe and chop your foot off!");
			System.out.println("you die from blood loss..");
			System.out.println("Game End.");
			break;
		default:
			System.out.println("you die from insolence.");
		}
	
		userInput.close();
	}

}
